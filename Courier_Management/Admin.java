package Courier_Management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.border.MatteBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextField e_name;
	private JComboBox e_branch;
	private JTextField e_mailid;
	private JTextField e_mobile;
	private JTextField e_age;
	private JTable user_table;
	private JTable employee_table;
	private JTable order_table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(136, 189, 188));
		panel.setBounds(0, 0, 836, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\jayashree.s\\eclipse-workspace\\Training_Java\\src\\Courier_Management\\images\\xpressLogo.png"));
		lblNewLabel_7.setBounds(726, 11, 100, 42);
		panel.add(lblNewLabel_7);
		
		JLabel lblXpressCourier = new JLabel("XPRESS COURIER");
		lblXpressCourier.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblXpressCourier.setBounds(22, 21, 257, 36);
		panel.add(lblXpressCourier);
		
		JTabbedPane admin_tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		admin_tabbedPane.setBounds(171, 43, 665, 470);
		contentPane.add(admin_tabbedPane);
		
		JPanel admin_menu = new JPanel();
		admin_menu.setBorder(new LineBorder(new Color(0, 0, 0)));
		admin_menu.setBackground(new Color(245, 245, 220));
		admin_tabbedPane.addTab("New tab", null, admin_menu, null);
		admin_menu.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Employee");
		btnNewButton.setBackground(new Color(136, 189, 188));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(232, 64, 158, 45);
		admin_menu.add(btnNewButton);
		
		JButton btnViewOrders = new JButton("View Orders");
		btnViewOrders.setBackground(new Color(136, 189, 188));
		btnViewOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_tabbedPane.setSelectedIndex(2);
			}
		});
		btnViewOrders.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnViewOrders.setBounds(232, 134, 158, 45);
		admin_menu.add(btnViewOrders);
		
		JButton btnViewUsers = new JButton("View Users");
		btnViewUsers.setBackground(new Color(136, 189, 188));
		btnViewUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_tabbedPane.setSelectedIndex(3);
			}
		});
		btnViewUsers.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnViewUsers.setBounds(232, 194, 158, 45);
		admin_menu.add(btnViewUsers);
		
		JButton btnViewEmployees = new JButton("View Employees");
		btnViewEmployees.setBackground(new Color(136, 189, 188));
		btnViewEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_tabbedPane.setSelectedIndex(4);
			}
		});
		btnViewEmployees.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnViewEmployees.setBounds(232, 262, 158, 45);
		admin_menu.add(btnViewEmployees);
		
		JButton btnNewButton_1 = new JButton("Go to Home");
		btnNewButton_1.setBackground(new Color(136, 189, 188));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage home=new HomePage();
				home.setVisible(true);
				home.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1.setBounds(520, 25, 114, 23);
		admin_menu.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("WELCOME ADMIN");
		lblNewLabel.setBounds(186, 11, 264, 42);
		admin_menu.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\jayashree.s\\eclipse-workspace\\Training_Java\\src\\Courier_Management\\images\\admin.gif"));
		lblNewLabel_1.setBounds(0, 5, 670, 450);
		admin_menu.add(lblNewLabel_1);
		
		JPanel add_employee = new JPanel();
		add_employee.setBackground(new Color(245, 245, 220));
		admin_tabbedPane.addTab("New tab", null, add_employee, null);
		add_employee.setLayout(null);
		
		JLabel lblAddEmployee = new JLabel(" ADD EMPLOYEE");
		lblAddEmployee.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAddEmployee.setBounds(226, 12, 186, 42);
		add_employee.add(lblAddEmployee);
		
		JLabel lblNewLabel_3 = new JLabel("NAME : ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(190, 65, 73, 24);
		add_employee.add(lblNewLabel_3);
		
		e_name = new JTextField();
		e_name.setColumns(10);
		e_name.setBounds(263, 68, 149, 20);
		add_employee.add(e_name);
		
		JLabel lblNewLabel_3_1 = new JLabel("BRANCH : ");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(190, 100, 73, 24);
		add_employee.add(lblNewLabel_3_1);
		
		e_branch = new JComboBox();
		e_branch.setBounds(263, 103, 149, 20);
		add_employee.add(e_branch);
		e_branch.addItem("--select city--");
		
		try {
				Connection con=jdbcConnection.getCon();
				Statement st= con.createStatement();
				String query= "select * from cities order by name_of_city";
					
				ResultSet rs=st.executeQuery(query);
				while(rs.next()) {
			        e_branch.addItem(rs.getString("name_of_city"));
				}	
			}
		catch(Exception e1) {
			JOptionPane.showMessageDialog(getRootPane(), e1);
		}
		
		JLabel lblNewLabel_3_2 = new JLabel("MAIL ID : ");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(190, 135, 73, 24);
		add_employee.add(lblNewLabel_3_2);
		
		e_mailid = new JTextField();
		e_mailid.setColumns(10);
		e_mailid.setBounds(263, 138, 149, 20);
		add_employee.add(e_mailid);
		
		JLabel lblNewLabel_3_3 = new JLabel("MOBILE NO : ");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(163, 170, 100, 24);
		add_employee.add(lblNewLabel_3_3);
		
		e_mobile = new JTextField();
		e_mobile.setColumns(10);
		e_mobile.setBounds(263, 173, 149, 20);
		add_employee.add(e_mobile);
		
		JLabel lblNewLabel_3_4 = new JLabel("AGE : ");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(190, 205, 73, 24);
		add_employee.add(lblNewLabel_3_4);
		
		e_age = new JTextField();
		e_age.setColumns(10);
		e_age.setBounds(263, 208, 149, 20);
		add_employee.add(e_age);
		
		JLabel lblNewLabel_3_5 = new JLabel("GENDER :");
		lblNewLabel_3_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_5.setBounds(190, 240, 73, 24);
		add_employee.add(lblNewLabel_3_5);
		
		JComboBox e_gender = new JComboBox();
		e_gender.setModel(new DefaultComboBoxModel(new String[] {"--Select Gender--", "Male", "Female", "Others"}));
		e_gender.setBounds(263, 240, 149, 22);
		add_employee.add(e_gender);
		
		JButton btnNewButton_2 = new JButton("ADD");
		btnNewButton_2.setBackground(new Color(136, 189, 188));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e_name.getText().equals("") || e_branch.getSelectedItem().equals("--select city--")) {
					JOptionPane.showMessageDialog(getRootPane(), "Enter Name & branch");
				}
				else if(e_mailid.getText().equals("") || e_mobile.getText().equals("")) {
					JOptionPane.showMessageDialog(getRootPane(), "Enter Mailid & Phone number");
				}
				else if(e_age.getText().equals("") || e_gender.getSelectedItem().toString().equals("--Select Gender--")) {
					JOptionPane.showMessageDialog(getRootPane(), "Enter Name & branch");
				}
				else {
					Random rand=new Random();
				    int e_password=rand.nextInt(90000);
                     try {
						
						Connection con=jdbcConnection.getCon();
						Statement st= con.createStatement();
						String query="insert into employee_details (emp_name,emp_mail,emp_mobile,emp_branch,emp_age, emp_gender,emp_password)"
								+ "values ('"+e_name.getText()
								+ "', '"+e_mailid.getText()
								+ "','"+e_mobile.getText()
								+ "','"+e_branch.getSelectedItem().toString()
								+ "','"+Integer.valueOf(e_age.getText())
								+ "','"+e_gender.getSelectedItem().toString()
								+ "','"+String.valueOf(e_password)
								+ "');";
									
						st.executeUpdate(query);
						//System.out.println(query);
						
						String mailtxt="Welcome you as a part of XPRESS Couriers\n Find below your login credentials"
								+ "\n Employee Name : "+e_name.getText()+"\nPassword : "+e_password+"\n Regards\n Xpress Couriers";
						sendMail mail=new sendMail(e_mailid.getText(),"Employee Added",mailtxt);
					JOptionPane.showMessageDialog(getRootPane(), "Employee Added Sucessfully");
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(getRootPane(), e1);
					}
				}				
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_2.setBounds(251, 282, 89, 23);
		add_employee.add(btnNewButton_2);
						
		JPanel viewOrders = new JPanel();
		viewOrders.setBackground(new Color(245, 245, 220));
		admin_tabbedPane.addTab("New tab", null, viewOrders, null);
		viewOrders.setLayout(null);
		
		JLabel lblViewOrders = new JLabel("VIEW ORDERS");
		lblViewOrders.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblViewOrders.setBounds(259, 11, 145, 32);
		viewOrders.add(lblViewOrders);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBackground(new Color(245, 245, 220));
		scrollPane_2.setBounds(10, 76, 640, 290);
		viewOrders.add(scrollPane_2);
		
		order_table = new JTable();
		order_table.setGridColor(new Color(136, 189, 188));
		order_table.setBackground(new Color(245, 245, 220));
		order_table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		order_table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Order ID", "Username", "From City", "To City", "Pick-up Address", "Delivery Address", "Ship Mode", "Ship Type", "Ship Content", "Weight", "Service Type", "Payment Mode", "Status", "Ordered Date", "Estimated Delivery"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		order_table.getColumnModel().getColumn(0).setMinWidth(50);
		order_table.getColumnModel().getColumn(1).setMinWidth(50);
		order_table.getColumnModel().getColumn(2).setMinWidth(50);
		order_table.getColumnModel().getColumn(3).setMinWidth(50);
		order_table.getColumnModel().getColumn(4).setPreferredWidth(100);
		order_table.getColumnModel().getColumn(4).setMinWidth(100);
		order_table.getColumnModel().getColumn(5).setPreferredWidth(100);
		order_table.getColumnModel().getColumn(5).setMinWidth(100);
		order_table.getColumnModel().getColumn(6).setMinWidth(50);
		order_table.getColumnModel().getColumn(7).setMinWidth(50);
		order_table.getColumnModel().getColumn(8).setMinWidth(50);
		order_table.getColumnModel().getColumn(9).setMinWidth(50);
		order_table.getColumnModel().getColumn(10).setMinWidth(50);
		order_table.getColumnModel().getColumn(11).setMinWidth(50);
		order_table.getColumnModel().getColumn(12).setMinWidth(50);
		order_table.getColumnModel().getColumn(13).setMinWidth(50);
		order_table.getColumnModel().getColumn(14).setMinWidth(50);
		scrollPane_2.setViewportView(order_table);
		
		JLabel order_table_heading = new JLabel("ALL ORDERS : ");
		order_table_heading.setFont(new Font("Times New Roman", Font.BOLD, 15));
		order_table_heading.setBounds(10, 48, 266, 23);
		viewOrders.add(order_table_heading);
		
		JButton btnNewButton_3 = new JButton("Orders Placed");
		btnNewButton_3.setBackground(new Color(136, 189, 188));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try      //////view order table
		        { 
		            DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
		            dt.setRowCount(0);
		            Connection con = jdbcConnection.getCon();
		            Statement st = con.createStatement();
		            ResultSet rs = st.executeQuery("select * from order_details where status='Order Placed'");
		            while(rs.next())
		            {
		            dt.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)
		            		,rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(14),
		            		rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18)});		            		     
		            }
		            order_table_heading.setText("ORDERS PLACED : ");
		        }
		        catch(Exception e1)
		        {
		            JOptionPane.showMessageDialog(null, e1);
		        }
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_3.setBounds(175, 389, 121, 23);
		viewOrders.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Orders In Transit");
		btnNewButton_3_1.setBackground(new Color(136, 189, 188));
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try      //////view order table
		        { 
		            DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
		            dt.setRowCount(0);
		            Connection con = jdbcConnection.getCon();
		            Statement st = con.createStatement();
		            ResultSet rs = st.executeQuery("select * from order_details where status='In Transit'");
		            while(rs.next())
		            {
		            dt.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)
		            		,rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(14),
		            		rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18)});		            		     
		            }
		            order_table_heading.setText("ORDERS IN TRANSIT : ");
		        }
		        catch(Exception e1)
		        {
		            JOptionPane.showMessageDialog(null, e1);
		        }

			}
		});
		btnNewButton_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_3_1.setBounds(317, 389, 155, 23);
		viewOrders.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_1_1 = new JButton("Delivered Orders");
		btnNewButton_3_1_1.setBackground(new Color(136, 189, 188));
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try      //////view order table - delivered orders
		        { 
		            DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
		            dt.setRowCount(0);
		            Connection con = jdbcConnection.getCon();
		            Statement st = con.createStatement();
		            ResultSet rs = st.executeQuery("select * from order_details where status='Delivered'");
		            while(rs.next())
		            {
		            dt.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)
		            		,rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(14),
		            		rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18)});		            		     
		            }
		            order_table_heading.setText("ORDERS DELIVERED : ");
		        }
		        catch(Exception e1)
		        {
		            JOptionPane.showMessageDialog(null, e1);
		        }

			}
		});
		btnNewButton_3_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_3_1_1.setBounds(490, 389, 160, 23);
		viewOrders.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_2 = new JButton("All Orders");
		btnNewButton_3_2.setBackground(new Color(136, 189, 188));
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try      //////view order table - all orders
		        { 
		            DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
		            dt.setRowCount(0);
		            Connection con = jdbcConnection.getCon();
		            Statement st = con.createStatement();
		            ResultSet rs = st.executeQuery("select * from order_details");
		            while(rs.next())
		            {
		            dt.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)
		            		,rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(14),
		            		rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18)});		            		     
		            }
		        }
		        catch(Exception e1)
		        {
		            JOptionPane.showMessageDialog(null, e1);
		        }
			}
		});
		btnNewButton_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_3_2.setBounds(26, 389, 121, 23);
		viewOrders.add(btnNewButton_3_2);
		
		
		
		try      //////view order table
        { 
            DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
            dt.setRowCount(0);
            Connection con = jdbcConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from order_details");
            while(rs.next())
            {
            dt.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)
            		,rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(14),
            		rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18)});
            }
            order_table_heading.setText("ALL ORDERS : ");
            
            
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null, e1);
        }
		JButton btn_dashboard = new JButton("Dashboard");
        
        btn_dashboard.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        btn_dashboard.setBackground(new Color(136, 189, 188));
        btn_dashboard.setBounds(477, 18, 121, 23);
        viewOrders.add(btn_dashboard);
		
		JPanel viewUsers = new JPanel();
		viewUsers.setBackground(new Color(245, 245, 220));
		admin_tabbedPane.addTab("New tab", null, viewUsers, null);
		viewUsers.setLayout(null);
		
		JLabel lblViewUsers = new JLabel("VIEW USERS");
		lblViewUsers.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblViewUsers.setBounds(243, 25, 145, 42);
		viewUsers.add(lblViewUsers);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(72, 66, 478, 273);
		viewUsers.add(scrollPane);
		
		user_table = new JTable();
		user_table.setBackground(new Color(245, 245, 220));
		user_table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		user_table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"User ID", "User Name", "First Name", "Last Name", "Mail ID", "Mobile No"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		user_table.getColumnModel().getColumn(1).setMinWidth(20);
		user_table.getColumnModel().getColumn(2).setMinWidth(50);
		user_table.getColumnModel().getColumn(3).setMinWidth(50);
		user_table.getColumnModel().getColumn(4).setMinWidth(100);
		user_table.getColumnModel().getColumn(5).setMinWidth(20);
		scrollPane.setViewportView(user_table);
		try      //////view user table
        { int sno = 1;
            DefaultTableModel dt = (DefaultTableModel) user_table.getModel();
            dt.setRowCount(0);
            Connection con = jdbcConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from user_details");
            while(rs.next())
            {
            dt.addRow(new Object[] {rs.getInt(7), rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(5),rs.getString(6)});
            sno++;
            }
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null, e1);
        }
		
		JPanel viewEmployee = new JPanel();
		viewEmployee.setBackground(new Color(245, 245, 220));
		admin_tabbedPane.addTab("New tab", null, viewEmployee, null);
		viewEmployee.setLayout(null);
		
		JLabel lblViewEmployee = new JLabel("VIEW EMPLOYEES");
		lblViewEmployee.setBounds(222, 31, 200, 24);
		lblViewEmployee.setFont(new Font("Times New Roman", Font.BOLD, 20));
		viewEmployee.add(lblViewEmployee);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(49, 66, 552, 297);
		viewEmployee.add(scrollPane_1);
		
		employee_table = new JTable();
		employee_table.setBackground(new Color(245, 245, 220));
		employee_table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		employee_table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Emp ID", "Emp Name", "Branch", "Mail ID", "Mobile No", "Age", "Gender"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		employee_table.getColumnModel().getColumn(1).setMinWidth(20);
		employee_table.getColumnModel().getColumn(2).setMinWidth(50);
		employee_table.getColumnModel().getColumn(3).setMinWidth(100);
		employee_table.getColumnModel().getColumn(4).setMinWidth(50);
		employee_table.getColumnModel().getColumn(6).setMinWidth(20);
		scrollPane_1.setViewportView(employee_table);
		
		JPanel dashboard = new JPanel();
		dashboard.setBackground(new Color(245, 245, 220));
		admin_tabbedPane.addTab("New tab", null, dashboard, null);
		dashboard.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(136, 189, 188));
		panel_2.setBounds(65, 51, 155, 39);
		dashboard.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("TOTAL ORDERS");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(0, 0, 98, 36);
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel t_o_count = new JLabel("20");
		t_o_count.setHorizontalAlignment(SwingConstants.CENTER);
		t_o_count.setForeground(new Color(245, 245, 220));
		t_o_count.setFont(new Font("Times New Roman", Font.BOLD, 24));
		t_o_count.setBounds(108, 0, 47, 38);
		panel_2.add(t_o_count);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(136, 189, 188));
		panel_2_1.setBounds(234, 51, 158, 39);
		dashboard.add(panel_2_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("ORDERS PLACED");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_4_1.setBounds(0, 2, 119, 36);
		panel_2_1.add(lblNewLabel_4_1);
		
		JLabel o_p_count = new JLabel("20");
		o_p_count.setHorizontalAlignment(SwingConstants.CENTER);
		o_p_count.setForeground(new Color(245, 245, 220));
		o_p_count.setFont(new Font("Times New Roman", Font.BOLD, 24));
		o_p_count.setBounds(116, 0, 47, 38);
		panel_2_1.add(o_p_count);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(new Color(136, 189, 188));
		panel_2_2.setBounds(419, 51, 158, 39);
		dashboard.add(panel_2_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("ORDERS IN TRANSIT");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_4_2.setBounds(0, 2, 116, 36);
		panel_2_2.add(lblNewLabel_4_2);
		
		JLabel o_it_count = new JLabel("20");
		o_it_count.setHorizontalAlignment(SwingConstants.CENTER);
		o_it_count.setForeground(new Color(245, 245, 220));
		o_it_count.setFont(new Font("Times New Roman", Font.BOLD, 24));
		o_it_count.setBounds(111, 0, 47, 38);
		panel_2_2.add(o_it_count);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBackground(new Color(136, 189, 188));
		panel_2_3.setBounds(65, 101, 155, 39);
		dashboard.add(panel_2_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("ORDERS DELIVERED");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_4_3.setBounds(0, 0, 113, 36);
		panel_2_3.add(lblNewLabel_4_3);
		
		JLabel o_d_count = new JLabel("20");
		o_d_count.setHorizontalAlignment(SwingConstants.CENTER);
		o_d_count.setForeground(new Color(245, 245, 220));
		o_d_count.setFont(new Font("Times New Roman", Font.BOLD, 24));
		o_d_count.setBounds(108, 0, 47, 38);
		panel_2_3.add(o_d_count);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(136, 189, 188));
		panel_2_1_1.setBounds(234, 101, 158, 39);
		dashboard.add(panel_2_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("TOTAL USERS");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_4_1_1.setBounds(0, 2, 119, 36);
		panel_2_1_1.add(lblNewLabel_4_1_1);
		
		JLabel t_u_count = new JLabel("20");
		t_u_count.setHorizontalAlignment(SwingConstants.CENTER);
		t_u_count.setForeground(new Color(245, 245, 220));
		t_u_count.setFont(new Font("Times New Roman", Font.BOLD, 24));
		t_u_count.setBounds(116, 0, 47, 38);
		panel_2_1_1.add(t_u_count);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setBackground(new Color(136, 189, 188));
		panel_2_2_1.setBounds(419, 101, 158, 39);
		dashboard.add(panel_2_2_1);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("TOTAL EMPLOYEES");
		lblNewLabel_4_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_4_2_1.setBounds(0, 2, 116, 36);
		panel_2_2_1.add(lblNewLabel_4_2_1);
		
		JLabel t_e_count = new JLabel("20");
		t_e_count.setHorizontalAlignment(SwingConstants.CENTER);
		t_e_count.setForeground(new Color(245, 245, 220));
		t_e_count.setFont(new Font("Times New Roman", Font.BOLD, 24));
		t_e_count.setBounds(111, 0, 47, 38);
		panel_2_2_1.add(t_e_count);
		
		JLabel lblNewLabel_5 = new JLabel("DASHBOARD");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5.setBounds(255, 11, 137, 31);
		dashboard.add(lblNewLabel_5);
		
		JPanel mode_pieChartPanel = new JPanel();
		mode_pieChartPanel.setBounds(8, 198, 197, 200);
		dashboard.add(mode_pieChartPanel);
		mode_pieChartPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel cities_barchartPanel = new JPanel();
		cities_barchartPanel.setBounds(215, 198, 210, 200);
		dashboard.add(cities_barchartPanel);
		cities_barchartPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel service_pieChartPanel = new JPanel();
		service_pieChartPanel.setBounds(435, 198, 197, 200);
		dashboard.add(service_pieChartPanel);
		service_pieChartPanel.setLayout(new BorderLayout(0, 0));
		//chartPane.add(scrollPane_4);
		//chartPane.add(scrollPane_3);
		
		btn_dashboard.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		admin_tabbedPane.setSelectedIndex(5);
        		try      //////dashboard
                { 
                    Connection con = jdbcConnection.getCon();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select count(*) from order_details");
                    rs.next();
                    t_o_count.setText(String.valueOf(rs.getInt(1)));
                    rs = st.executeQuery("select count(*) from order_details where status='Order Placed'");
                    rs.next();
                    o_p_count.setText(String.valueOf(rs.getInt(1)));
                    rs = st.executeQuery("select count(*) from order_details where status='In Transit'");
                    rs.next();
                    o_it_count.setText(String.valueOf(rs.getInt(1)));
                    rs = st.executeQuery("select count(*) from order_details where status='Delivered'");
                    rs.next();
                    o_d_count.setText(String.valueOf(rs.getInt(1)));
                    rs = st.executeQuery("select count(*) from user_details");
                    rs.next();
                    t_u_count.setText(String.valueOf(rs.getInt(1)));
                    rs = st.executeQuery("select count(*) from employee_details");
                    rs.next();
                    t_e_count.setText(String.valueOf(rs.getInt(1)));
                    
                    DefaultPieDataset pieDataset=new DefaultPieDataset();
                    rs=st.executeQuery("select distinct(ship_mode) from order_details");
                    ArrayList<String> mode=new ArrayList<String>();
                    while(rs.next()) {
                    	mode.add(rs.getString(1));                    	
                    }
                    for(int i=0;i<mode.size();i++)
                    {
                    	rs=st.executeQuery("select count(*) from order_details where ship_mode='"+mode.get(i)+"'");
                    	rs.next() ;
                    	pieDataset.setValue(mode.get(i), rs.getInt(1));
                    }
                    
                    JFreeChart piechart=ChartFactory.createPieChart3D("Shipment Mode",pieDataset,true,true,false);                    
                    PiePlot piePlot=(PiePlot) piechart.getPlot();
                    ChartPanel chartPanel=new ChartPanel(piechart); 
                    chartPanel.setPreferredSize(new Dimension(223,200));                    
                    mode_pieChartPanel.removeAll();
                    mode_pieChartPanel.add(chartPanel,BorderLayout.CENTER);
                    chartPanel.validate();
                    
                    DefaultCategoryDataset dataset= new DefaultCategoryDataset();
                    rs=st.executeQuery("select distinct(from_city) from order_details");
                    ArrayList<String> city=new ArrayList<String>();
                    while(rs.next()) {
                    	city.add(rs.getString(1));
                    	
                    }
                    for(int j=0;j<city.size();j++) {
                    for(int i=0;i<mode.size();i++)
                    {
                    	ResultSet rSet=st.executeQuery("select count(*) from order_details where ship_mode='"+mode.get(i)+"' and from_city='"+city.get(j)+"';");
                    	rSet.next() ;
                    	dataset.addValue( rSet.getInt(1),mode.get(i),city.get(j));
                    	//System.out.println(rSet.getInt(1)+" "+mode.get(i)+" "+city.get(j));
                    }}
                    JFreeChart barchart=ChartFactory.createBarChart3D("Cities with shipment mode","",
                    		"", dataset,PlotOrientation.VERTICAL, true, true, false);
                    CategoryPlot categoryplot=barchart.getCategoryPlot();
                    ChartPanel barchartPanel=new ChartPanel(barchart);
                    barchartPanel.setPreferredSize(new Dimension(200,100));
                    cities_barchartPanel.removeAll();
                    cities_barchartPanel.add(barchartPanel,BorderLayout.CENTER);
                    cities_barchartPanel.validate();
                    
                    DefaultPieDataset ser_pieDataset=new DefaultPieDataset();
                    rs=st.executeQuery("select distinct(service_type) from order_details");
                    ArrayList<String> service=new ArrayList<String>();
                    while(rs.next()) {
                    	service.add(rs.getString(1));                    	
                    }
                    for(int i=0;i<service.size();i++)
                    {
                    	rs=st.executeQuery("select count(*) from order_details where service_type='"+service.get(i)+"'");
                    	rs.next() ;
                    	ser_pieDataset.setValue(service.get(i), rs.getInt(1));
                    }
                    JFreeChart ser_piechart=ChartFactory.createPieChart("Service Opted",ser_pieDataset,true,true,false);                    
                    //PiePlot ser_piePlot=(PiePlot) ser_piechart.getPlot();
                    ChartPanel ser_chartPanel=new ChartPanel(ser_piechart); 
                    ser_chartPanel.setPreferredSize(new Dimension(223,200));
                    service_pieChartPanel.removeAll();
                    service_pieChartPanel.add(ser_chartPanel,BorderLayout.CENTER);
                    //ser_chartPanel.validate();
                    service_pieChartPanel.validate();
                    
                    //System.out.println(total_order_count+" "+order_placed_count+" "+inTransit_count+" "+delivered_count);
                }
                catch(Exception e1)
                {
                    JOptionPane.showMessageDialog(null, e1);
                }
        	}
        });
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(136, 189, 188));
		panel_1.setBounds(0, 64, 173, 449);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel btn_AdminMenu = new JLabel("Main Menu");
		btn_AdminMenu.setBackground(new Color(245, 245, 220));
		
		btn_AdminMenu.setHorizontalAlignment(SwingConstants.CENTER);
		btn_AdminMenu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_AdminMenu.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btn_AdminMenu.setBounds(10, 94, 148, 43);
		panel_1.add(btn_AdminMenu);
		
		JLabel btn_AddEmployee = new JLabel("Add Employee");
		btn_AddEmployee.setBackground(new Color(245, 245, 220));
		
		btn_AddEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		btn_AddEmployee.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_AddEmployee.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btn_AddEmployee.setBounds(10, 148, 148, 43);
		panel_1.add(btn_AddEmployee);
		
		JLabel btn_ViewOrder = new JLabel("View Orders");
		btn_ViewOrder.setBackground(new Color(245, 245, 220));
		
		btn_ViewOrder.setHorizontalAlignment(SwingConstants.CENTER);
		btn_ViewOrder.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_ViewOrder.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btn_ViewOrder.setBounds(10, 200, 148, 43);
		panel_1.add(btn_ViewOrder);
		
		JLabel btn_ViewUser = new JLabel("View Users");
		btn_ViewUser.setBackground(new Color(245, 245, 220));
		
		btn_ViewUser.setHorizontalAlignment(SwingConstants.CENTER);
		btn_ViewUser.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_ViewUser.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btn_ViewUser.setBounds(10, 254, 148, 43);
		panel_1.add(btn_ViewUser);
		
		JLabel btn_ViewEmployee = new JLabel("View Employee");
		btn_ViewEmployee.setBackground(new Color(245, 245, 220));
		
		btn_ViewEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		btn_ViewEmployee.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_ViewEmployee.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btn_ViewEmployee.setBounds(10, 314, 148, 43);
		panel_1.add(btn_ViewEmployee);
		
		JButton btnNewButton_1_1 = new JButton("Logout ");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage home=new HomePage();
				home.setVisible(true);
				home.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1_1.setBackground(new Color(136, 189, 188));
		btnNewButton_1_1.setBounds(23, 408, 114, 30);
		panel_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(53, 29, 55, 55);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\jayashree.s\\eclipse-workspace\\Training_Java\\src\\Courier_Management\\images\\adminLogo.png"));
		
		btn_AdminMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				admin_tabbedPane.setSelectedIndex(0);
			}
		});
		btn_AddEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				admin_tabbedPane.setSelectedIndex(1);
			}
		});
		btn_ViewOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				admin_tabbedPane.setSelectedIndex(2);
			}
		});
		btn_ViewUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				admin_tabbedPane.setSelectedIndex(3);
			}
		});
		btn_ViewEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				admin_tabbedPane.setSelectedIndex(4);
			}
		});
		//"Emp ID", "Emp Name", "Branch", "Mail ID", "Mobile No", "Age", "Gender"
		try
        { int sno = 1;
            DefaultTableModel dt = (DefaultTableModel) employee_table.getModel();
            dt.setRowCount(0);
            Connection con = jdbcConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from employee_details");
            while(rs.next())
            {
            dt.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(5),rs.getString(3),rs.getString(4),rs.getInt(6),rs.getString(7)});
            sno++;
            }

        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null, e1);
        }
	}
}
