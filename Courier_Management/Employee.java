package Courier_Management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLayeredPane;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JPasswordField e_newPassword;
	private JPasswordField e_re_newPassword;
	private JPasswordField old_password;
    static String e_branch;
    private JTable pickOrderTable;
    private JTextField p_orderId;
    private JTextField p_name;
    private JTextField p_shipMode;
    private JTextField d_orderId;
    private JTextField d_username;
    private JTextField d_shipMode;
    private JTable deliOrderTable;
    private JTable orderPickedTable;
    private JTable orderDeliveredTable;
    private JTextField p_userMobile;
    private JTextField p_userMail;
    private JTextField d_userMobile;
    private JTextField d_userMail;
    private JTextField update_eid;
    private JTextField update_ename;
    private JTextField update_eEmail;
    private JTextField update_ebranch;
    private JTextField update_eage;
    private JTextField update_emobile;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee("hello");
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
	public Employee(String ename) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		//ename="Nivedha";
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		try
        {
            Connection con = jdbcConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from employee_details where emp_name = '"+ename+"'");
            while(rs.next())
            {
            	e_branch=rs.getString("emp_branch");
            }
            System.out.println(ename+" "+e_branch);
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null, e1);
        }
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(136, 189, 188));
		panel.setBounds(0, 0, 836, 71);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\jayashree.s\\eclipse-workspace\\Training_Java\\src\\Courier_Management\\images\\xpressLogo.png"));
		lblNewLabel_7.setBounds(726, 11, 100, 42);
		panel.add(lblNewLabel_7);
		
		JLabel lblXpressCourier = new JLabel("XPRESS COURIER");
		lblXpressCourier.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblXpressCourier.setBounds(10, 17, 257, 36);
		panel.add(lblXpressCourier);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(136, 189, 188));
		panel_1.setLayout(null);
		panel_1.setBounds(0, 70, 170, 443);
		contentPane.add(panel_1);
		
		JLabel btn_empMenu = new JLabel("Main Menu");
		
		btn_empMenu.setHorizontalAlignment(SwingConstants.CENTER);
		btn_empMenu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_empMenu.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btn_empMenu.setBounds(10, 83, 148, 43);
		panel_1.add(btn_empMenu);
		
		JLabel btn_pickOrders = new JLabel("Pick-up Orders");
		
		btn_pickOrders.setHorizontalAlignment(SwingConstants.CENTER);
		btn_pickOrders.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_pickOrders.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btn_pickOrders.setBounds(10, 137, 148, 43);
		panel_1.add(btn_pickOrders);
		
		JLabel btn_deliverOrders = new JLabel("Deliver Orders");
		
		btn_deliverOrders.setHorizontalAlignment(SwingConstants.CENTER);
		btn_deliverOrders.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_deliverOrders.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btn_deliverOrders.setBounds(10, 189, 148, 43);
		panel_1.add(btn_deliverOrders);
		
		JLabel btn_deliveryDetails = new JLabel("Delivery Details");
		
		btn_deliveryDetails.setHorizontalAlignment(SwingConstants.CENTER);
		btn_deliveryDetails.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_deliveryDetails.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btn_deliveryDetails.setBounds(10, 243, 148, 43);
		panel_1.add(btn_deliveryDetails);
		
		JLabel btn_viewEmpProfile = new JLabel(" View Profile");
		
		btn_viewEmpProfile.setHorizontalAlignment(SwingConstants.CENTER);
		btn_viewEmpProfile.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_viewEmpProfile.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btn_viewEmpProfile.setBounds(10, 303, 148, 43);
		panel_1.add(btn_viewEmpProfile);
		
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
		btnNewButton_1_1.setBounds(25, 402, 114, 30);
		panel_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(40, 17, 69, 55);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\jayashree.s\\eclipse-workspace\\Training_Java\\src\\Courier_Management\\images\\delivery partner.png"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JTabbedPane emp_tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		emp_tabbedPane.setBackground(new Color(255, 159, 207));
		emp_tabbedPane.setBounds(168, 44, 675, 475);
		contentPane.add(emp_tabbedPane);
		
		JPanel emp_mainMenu = new JPanel();
		emp_mainMenu.setBorder(new LineBorder(new Color(0, 0, 0)));
		emp_mainMenu.setBackground(new Color(245, 245, 220));
		emp_tabbedPane.addTab("New tab", null, emp_mainMenu, null);
		emp_mainMenu.setLayout(null);
		
		JButton btnPickupOrders = new JButton("Pick-up Orders");
		btnPickupOrders.setBackground(new Color(136, 189, 188));
		btnPickupOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emp_tabbedPane.setSelectedIndex(1);
			}
		});
		btnPickupOrders.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnPickupOrders.setBounds(150, 68, 158, 45);
		emp_mainMenu.add(btnPickupOrders);
		
		JButton btnDeliverOrders = new JButton("Deliver Orders");
		btnDeliverOrders.setBackground(new Color(136, 189, 188));
		btnDeliverOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emp_tabbedPane.setSelectedIndex(2);
			}
		});
		btnDeliverOrders.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnDeliverOrders.setBounds(150, 126, 158, 45);
		emp_mainMenu.add(btnDeliverOrders);
		
		JButton btnDeliveryDetails = new JButton("Delivery Details");
		btnDeliveryDetails.setBackground(new Color(136, 189, 188));
		btnDeliveryDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emp_tabbedPane.setSelectedIndex(3);
			}
		});
		btnDeliveryDetails.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnDeliveryDetails.setBounds(150, 182, 158, 45);
		emp_mainMenu.add(btnDeliveryDetails);
		
		JButton btnChangePassword = new JButton("Change Password");
		btnChangePassword.setBackground(new Color(136, 189, 188));
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emp_tabbedPane.setSelectedIndex(5);
			}
		});
		btnChangePassword.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnChangePassword.setBounds(150, 238, 158, 45);
		emp_mainMenu.add(btnChangePassword);
		
		JButton btnEmpLogout = new JButton("Go to Home");
		btnEmpLogout.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnEmpLogout.setBackground(new Color(136, 189, 188));
		btnEmpLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage home=new HomePage();
				home.setVisible(true);
				home.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnEmpLogout.setBounds(546, 28, 114, 23);
		emp_mainMenu.add(btnEmpLogout);
		
		JButton btnViewEmpDetails = new JButton("View Profile");
		btnViewEmpDetails.setBackground(new Color(136, 189, 188));
		btnViewEmpDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emp_tabbedPane.setSelectedIndex(4);
			}
		});
		btnViewEmpDetails.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnViewEmpDetails.setBounds(150, 294, 158, 45);
		emp_mainMenu.add(btnViewEmpDetails);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE - "+ename+" ("+e_branch+")");
		lblNewLabel.setBounds(27, 17, 494, 36);
		emp_mainMenu.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\jayashree.s\\eclipse-workspace\\Training_Java\\src\\Courier_Management\\images\\employee.gif"));
		lblNewLabel_2.setBounds(0, 0, 670, 450);
		emp_mainMenu.add(lblNewLabel_2);
		
		JPanel pickUpOrders = new JPanel();
		pickUpOrders.setBackground(new Color(245, 245, 220));
		emp_tabbedPane.addTab("New tab", null, pickUpOrders, null);
		pickUpOrders.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 48, 643, 167);
		pickUpOrders.add(scrollPane);
		
		pickOrderTable = new JTable();
		pickOrderTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(pickOrderTable);
		pickOrderTable.setModel(new DefaultTableModel(
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
		pickOrderTable.getColumnModel().getColumn(0).setMinWidth(50);
		pickOrderTable.getColumnModel().getColumn(1).setMinWidth(50);
		pickOrderTable.getColumnModel().getColumn(2).setMinWidth(50);
		pickOrderTable.getColumnModel().getColumn(3).setMinWidth(50);
		pickOrderTable.getColumnModel().getColumn(4).setPreferredWidth(100);
		pickOrderTable.getColumnModel().getColumn(4).setMinWidth(100);
		pickOrderTable.getColumnModel().getColumn(5).setPreferredWidth(100);
		pickOrderTable.getColumnModel().getColumn(5).setMinWidth(100);
		pickOrderTable.getColumnModel().getColumn(6).setMinWidth(50);
		pickOrderTable.getColumnModel().getColumn(7).setMinWidth(50);
		pickOrderTable.getColumnModel().getColumn(8).setMinWidth(50);
		pickOrderTable.getColumnModel().getColumn(9).setMinWidth(50);
		pickOrderTable.getColumnModel().getColumn(10).setMinWidth(50);
		pickOrderTable.getColumnModel().getColumn(11).setMinWidth(50);
		pickOrderTable.getColumnModel().getColumn(12).setMinWidth(50);
		pickOrderTable.getColumnModel().getColumn(13).setMinWidth(50);
		pickOrderTable.getColumnModel().getColumn(14).setMinWidth(50);
		scrollPane.setViewportView(pickOrderTable);
		DefaultTableModel dt = (DefaultTableModel) pickOrderTable.getModel();
		try      //////pick up order table
        { 
            //DefaultTableModel dt = (DefaultTableModel) pickOrderTable.getModel();
            dt.setRowCount(0);
            Connection con = jdbcConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from order_details where from_city='"+e_branch+"' and status='Order Placed';");
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
		
		JLabel lblPickupOrders = new JLabel("PICK UP ORDERS");
		lblPickupOrders.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPickupOrders.setBounds(239, 11, 205, 26);
		pickUpOrders.add(lblPickupOrders);
		
		JButton btnPickOrder = new JButton("Pick Order");
		btnPickOrder.setBackground(new Color(136, 189, 188));
		btnPickOrder.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		btnPickOrder.setBounds(204, 226, 118, 23);
		pickUpOrders.add(btnPickOrder);
		
		JLabel lblNewLabel_3_4 = new JLabel("Order ID : ");
		lblNewLabel_3_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(40, 271, 73, 24);
		pickUpOrders.add(lblNewLabel_3_4);
		
		p_orderId = new JTextField();
		p_orderId.setBackground(new Color(255, 255, 255));
		p_orderId.setEditable(false);
		p_orderId.setColumns(10);
		p_orderId.setBounds(105, 274, 104, 20);
		pickUpOrders.add(p_orderId);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Username: ");
		lblNewLabel_3_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_1.setBounds(249, 271, 73, 24);
		pickUpOrders.add(lblNewLabel_3_4_1);
		
		p_name = new JTextField();
		p_name.setBackground(new Color(255, 255, 255));
		p_name.setEditable(false);
		p_name.setColumns(10);
		p_name.setBounds(326, 274, 118, 20);
		pickUpOrders.add(p_name);
		
		JLabel lblNewLabel_3_4_2 = new JLabel("Ship mode : ");
		lblNewLabel_3_4_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_2.setBounds(456, 274, 83, 24);
		pickUpOrders.add(lblNewLabel_3_4_2);
		
		p_shipMode = new JTextField();
		p_shipMode.setBackground(new Color(255, 255, 255));
		p_shipMode.setEditable(false);
		p_shipMode.setColumns(10);
		p_shipMode.setBounds(535, 274, 118, 20);
		pickUpOrders.add(p_shipMode);
		
		JLabel lblNewLabel_3_4_3 = new JLabel("Pick-up Adress :");
		lblNewLabel_3_4_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_3.setBounds(0, 304, 103, 24);
		pickUpOrders.add(lblNewLabel_3_4_3);
		
		JTextArea p_pickAddress = new JTextArea();
		p_pickAddress.setEditable(false);
		p_pickAddress.setBounds(105, 306, 104, 49);
		pickUpOrders.add(p_pickAddress);
		
		JLabel lblNewLabel_3_4_5 = new JLabel("Status :");
		lblNewLabel_3_4_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_5.setBounds(482, 304, 57, 24);
		pickUpOrders.add(lblNewLabel_3_4_5);
		
		JComboBox pickUpStatus = new JComboBox();
		pickUpStatus.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		pickUpStatus.setModel(new DefaultComboBoxModel(new String[] {"Order Placed", "Picked Up", "In Transit"}));
		pickUpStatus.setBounds(535, 306, 118, 22);
		pickUpOrders.add(pickUpStatus);
		
		JButton btn_pick_status = new JButton("Update status");
		btn_pick_status.setBackground(new Color(136, 189, 188));
		
		btn_pick_status.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn_pick_status.setBounds(518, 368, 135, 23);
		pickUpOrders.add(btn_pick_status);
		
		JTextArea p_deliAddress = new JTextArea();
		p_deliAddress.setEditable(false);
		p_deliAddress.setBounds(324, 306, 120, 49);
		pickUpOrders.add(p_deliAddress);
		
		JLabel lblNewLabel_3_4_3_1 = new JLabel("Delivery Add :");
		lblNewLabel_3_4_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_3_1.setBounds(229, 306, 103, 24);
		pickUpOrders.add(lblNewLabel_3_4_3_1);
		
		JLabel lblNewLabel_3_4_6 = new JLabel("Mobile : ");
		lblNewLabel_3_4_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_6.setBounds(40, 366, 73, 24);
		pickUpOrders.add(lblNewLabel_3_4_6);
		
		p_userMobile = new JTextField();
		p_userMobile.setBackground(new Color(255, 255, 255));
		p_userMobile.setEditable(false);
		p_userMobile.setColumns(10);
		p_userMobile.setBounds(105, 369, 104, 20);
		pickUpOrders.add(p_userMobile);
		
		JLabel lblNewLabel_3_4_6_1 = new JLabel("Mail id : ");
		lblNewLabel_3_4_6_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_6_1.setBounds(258, 368, 73, 24);
		pickUpOrders.add(lblNewLabel_3_4_6_1);
		
		p_userMail = new JTextField();
		p_userMail.setBackground(new Color(255, 255, 255));
		p_userMail.setEditable(false);
		p_userMail.setColumns(10);
		p_userMail.setBounds(323, 371, 121, 20);
		pickUpOrders.add(p_userMail);
		
		JButton btn_pRefresh = new JButton("Refresh");
		btn_pRefresh.setBackground(new Color(136, 189, 188));
		btn_pRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					DefaultTableModel dt = (DefaultTableModel) pickOrderTable.getModel();
					try      //////pick up order table
			        { 
			            //DefaultTableModel dt = (DefaultTableModel) pickOrderTable.getModel();
			            dt.setRowCount(0);
			            Connection con = jdbcConnection.getCon();
			            Statement st = con.createStatement();
			            ResultSet rs = st.executeQuery("select * from order_details where from_city='"+e_branch+"' and status='Order Placed' or status='Picked Up';");
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
		btn_pRefresh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn_pRefresh.setBounds(342, 226, 118, 23);
		pickUpOrders.add(btn_pRefresh);
		
		btnPickOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row_sel=pickOrderTable.getSelectedRow();//0,1,6,4,13.
				p_orderId.setText(pickOrderTable.getValueAt(row_sel, 0).toString());
				p_name.setText(pickOrderTable.getValueAt(row_sel, 1).toString());
				p_shipMode.setText(pickOrderTable.getValueAt(row_sel, 6).toString());
				p_pickAddress.setText(pickOrderTable.getValueAt(row_sel, 4).toString());
				p_deliAddress.setText(pickOrderTable.getValueAt(row_sel, 5).toString());
				pickUpStatus.setSelectedItem(pickOrderTable.getValueAt(row_sel, 12));
				
				try 
		        { 
					Connection con = jdbcConnection.getCon();
		            Statement st = con.createStatement();
		            ResultSet rs = st.executeQuery("select * from user_details where uname='"+pickOrderTable.getValueAt(row_sel, 1).toString()+"';");
		            while(rs.next())
		            {
		            	p_userMobile.setText(rs.getString("mobile"));
		            	p_userMail.setText(rs.getString("mailid"));
		            }
		        }
		        catch(Exception e1)
		        {
		            JOptionPane.showMessageDialog(null, e1);
		        }
				
//				System.out.println(pickOrderTable.getValueAt(row_sel, 0));
//				System.out.println(pickOrderTable.getValueAt(row_sel, 13));
			}
		});
		
		JPanel deliverOrder = new JPanel();
		deliverOrder.setBackground(new Color(245, 245, 220));
		emp_tabbedPane.addTab("New tab", null, deliverOrder, null);
		deliverOrder.setLayout(null);
		
		JLabel lblDeliverOrders = new JLabel("DELIVER ORDERS");
		lblDeliverOrders.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDeliverOrders.setBounds(239, 11, 205, 26);
		deliverOrder.add(lblDeliverOrders);
		
		JButton btnDeliverOrder = new JButton("Deliver Order");
		btnDeliverOrder.setBackground(new Color(136, 189, 188));
		
		btnDeliverOrder.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnDeliverOrder.setBounds(204, 226, 118, 23);
		deliverOrder.add(btnDeliverOrder);
		
		JLabel lblNewLabel_3_4_4 = new JLabel("Order ID : ");
		lblNewLabel_3_4_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_4.setBounds(40, 271, 73, 24);
		deliverOrder.add(lblNewLabel_3_4_4);
		
		d_orderId = new JTextField();
		d_orderId.setBackground(new Color(255, 255, 255));
		d_orderId.setEditable(false);
		d_orderId.setColumns(10);
		d_orderId.setBounds(105, 274, 104, 20);
		deliverOrder.add(d_orderId);
		
		JLabel lblNewLabel_3_4_1_1 = new JLabel("Username: ");
		lblNewLabel_3_4_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_1_1.setBounds(249, 271, 73, 24);
		deliverOrder.add(lblNewLabel_3_4_1_1);
		
		d_username = new JTextField();
		d_username.setBackground(new Color(255, 255, 255));
		d_username.setEditable(false);
		d_username.setColumns(10);
		d_username.setBounds(326, 274, 118, 20);
		deliverOrder.add(d_username);
		
		JLabel lblNewLabel_3_4_2_1 = new JLabel("Ship mode : ");
		lblNewLabel_3_4_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_2_1.setBounds(456, 274, 83, 24);
		deliverOrder.add(lblNewLabel_3_4_2_1);
		
		d_shipMode = new JTextField();
		d_shipMode.setBackground(new Color(255, 255, 255));
		d_shipMode.setEditable(false);
		d_shipMode.setColumns(10);
		d_shipMode.setBounds(535, 274, 118, 20);
		deliverOrder.add(d_shipMode);
		
		JLabel lblNewLabel_3_4_3_2 = new JLabel("Pick-up Adress :");
		lblNewLabel_3_4_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_3_2.setBounds(0, 304, 103, 24);
		deliverOrder.add(lblNewLabel_3_4_3_2);
		
		JTextArea d_pickAddress = new JTextArea();
		d_pickAddress.setEditable(false);
		d_pickAddress.setBounds(105, 306, 104, 49);
		deliverOrder.add(d_pickAddress);
		
		JTextArea d_deliAddress = new JTextArea();
		d_deliAddress.setEditable(false);
		d_deliAddress.setBounds(324, 306, 120, 49);
		deliverOrder.add(d_deliAddress);
		
		JComboBox deliStatus = new JComboBox();
		deliStatus.setModel(new DefaultComboBoxModel(new String[] {"In Transit", "Delivered"}));
		deliStatus.setBounds(535, 306, 118, 22);
		deliverOrder.add(deliStatus);
		
		JButton btn_updateDeliStatus = new JButton("Update status");
		btn_updateDeliStatus.setBackground(new Color(136, 189, 188));
		
		btn_updateDeliStatus.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn_updateDeliStatus.setBounds(518, 365, 135, 23);
		deliverOrder.add(btn_updateDeliStatus);
		
		btnDeliverOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row_sel=deliOrderTable.getSelectedRow();//0,1,6,4,13.
				d_orderId.setText(deliOrderTable.getValueAt(row_sel, 0).toString());
				d_username.setText(deliOrderTable.getValueAt(row_sel, 1).toString());
				d_shipMode.setText(deliOrderTable.getValueAt(row_sel, 6).toString());
				d_pickAddress.setText(deliOrderTable.getValueAt(row_sel, 4).toString());
				d_deliAddress.setText(deliOrderTable.getValueAt(row_sel, 5).toString());
				deliStatus.setSelectedItem(deliOrderTable.getValueAt(row_sel, 12));
				
				try 
		        { 
					Connection con = jdbcConnection.getCon();
		            Statement st = con.createStatement();
		            ResultSet rs = st.executeQuery("select * from user_details where uname='"+deliOrderTable.getValueAt(row_sel, 1).toString()+"';");
		            while(rs.next())
		            {
		            	d_userMobile.setText(rs.getString("mobile"));
		            	d_userMail.setText(rs.getString("mailid"));
		            }
		        }
		        catch(Exception e1)
		        {
		            JOptionPane.showMessageDialog(null, e1);
		        }
				
			}
		});
		
		JLabel lblNewLabel_3_4_3_1_1 = new JLabel("Delivery Add :");
		lblNewLabel_3_4_3_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_3_1_1.setBounds(229, 308, 103, 24);
		deliverOrder.add(lblNewLabel_3_4_3_1_1);
		
		JLabel lblNewLabel_3_4_5_1 = new JLabel("Status :");
		lblNewLabel_3_4_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_5_1.setBounds(482, 306, 57, 24);
		deliverOrder.add(lblNewLabel_3_4_5_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 48, 643, 167);
		deliverOrder.add(scrollPane_1);
		
		deliOrderTable = new JTable();
		deliOrderTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		deliOrderTable.setModel(new DefaultTableModel(
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
		deliOrderTable.getColumnModel().getColumn(0).setMinWidth(50);
		deliOrderTable.getColumnModel().getColumn(1).setMinWidth(50);
		deliOrderTable.getColumnModel().getColumn(2).setMinWidth(50);
		deliOrderTable.getColumnModel().getColumn(3).setMinWidth(50);
		deliOrderTable.getColumnModel().getColumn(4).setPreferredWidth(100);
		deliOrderTable.getColumnModel().getColumn(4).setMinWidth(100);
		deliOrderTable.getColumnModel().getColumn(5).setPreferredWidth(100);
		deliOrderTable.getColumnModel().getColumn(5).setMinWidth(100);
		deliOrderTable.getColumnModel().getColumn(6).setMinWidth(50);
		deliOrderTable.getColumnModel().getColumn(7).setMinWidth(50);
		deliOrderTable.getColumnModel().getColumn(8).setMinWidth(50);
		deliOrderTable.getColumnModel().getColumn(9).setMinWidth(50);
		deliOrderTable.getColumnModel().getColumn(10).setMinWidth(50);
		deliOrderTable.getColumnModel().getColumn(11).setMinWidth(50);
		deliOrderTable.getColumnModel().getColumn(12).setMinWidth(50);
		deliOrderTable.getColumnModel().getColumn(13).setMinWidth(50);
		deliOrderTable.getColumnModel().getColumn(14).setMinWidth(50);
		scrollPane_1.setViewportView(deliOrderTable);
		
		JLabel lblNewLabel_3_4_6_2 = new JLabel("Mobile : ");
		lblNewLabel_3_4_6_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_6_2.setBounds(40, 362, 73, 24);
		deliverOrder.add(lblNewLabel_3_4_6_2);
		
		d_userMobile = new JTextField();
		d_userMobile.setBackground(new Color(255, 255, 255));
		d_userMobile.setEditable(false);
		d_userMobile.setColumns(10);
		d_userMobile.setBounds(105, 365, 104, 20);
		deliverOrder.add(d_userMobile);
		
		JLabel lblNewLabel_3_4_6_1_1 = new JLabel("Mail id : ");
		lblNewLabel_3_4_6_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_6_1_1.setBounds(258, 364, 73, 24);
		deliverOrder.add(lblNewLabel_3_4_6_1_1);
		
		d_userMail = new JTextField();
		d_userMail.setBackground(new Color(255, 255, 255));
		d_userMail.setEditable(false);
		d_userMail.setColumns(10);
		d_userMail.setBounds(323, 367, 121, 20);
		deliverOrder.add(d_userMail);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setBackground(new Color(136, 189, 188));
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					DefaultTableModel dt_1 = (DefaultTableModel) deliOrderTable.getModel();
					try      //////pick up order table
			        { 
			            //DefaultTableModel dt_1 = (DefaultTableModel) pickOrderTable.getModel();
			            dt_1.setRowCount(0);
			            Connection con = jdbcConnection.getCon();
			            Statement st = con.createStatement();
			            ResultSet rs = st.executeQuery("select * from order_details where to_city='"+e_branch+"' and status='In Transit';");
			            while(rs.next())
			            {
			            dt_1.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)
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
		btnRefresh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnRefresh.setBounds(357, 226, 88, 23);
		deliverOrder.add(btnRefresh);
		
		DefaultTableModel dt_1 = (DefaultTableModel) deliOrderTable.getModel();
		try      //////pick up order table
        { 
            //DefaultTableModel dt_1 = (DefaultTableModel) pickOrderTable.getModel();
            dt_1.setRowCount(0);
            Connection con = jdbcConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from order_details where to_city='"+e_branch+"' and status='In Transit';");
            while(rs.next())
            {
            dt_1.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)
            		,rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(14),
            		rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18)});		            		     
            }
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null, e1);
        }
		
		btn_updateDeliStatus.addActionListener(new ActionListener() {  //update delivery details
			public void actionPerformed(ActionEvent e) {
				try
		        {
					if(deliStatus.getSelectedItem().toString().equals(deliOrderTable.getValueAt(deliOrderTable.getSelectedRow(), 12))) 
					{JOptionPane.showMessageDialog(null, "Change order status");}
					else {
					int o_id=0;
		            Connection con = jdbcConnection.getCon();
		            Statement st = con.createStatement();
		            st.executeUpdate("update order_details set status='"+deliStatus.getSelectedItem().toString()
		            	 +"' where order_id='"+d_orderId.getText()+"';");
		            st.executeUpdate("update delivery_details set emp_deli='"+ename+"' , status='"+deliStatus.getSelectedItem().toString() +"'"
		            		+ "where order_id='"+d_orderId.getText()+"';");
		            JOptionPane.showMessageDialog(null, "Status Updated");
		            
		            sendMail deliMail=new sendMail(d_userMail.getText(),"Order Delivered !!","Your order : "+d_orderId.getText()
		            +"\nHas been delivered by - "+ename+"\n\n--Thanks for choosing XPRESS Couriers--");
		            
		            d_orderId.setText("");
		            d_username.setText("");
		            d_shipMode.setText("");
		            d_pickAddress.setText("");
		            d_deliAddress.setText("");
		            d_userMail.setText("");
		            d_userMobile.setText("");
		            deliStatus.setSelectedIndex(0);
		            dt_1.removeRow(deliOrderTable.getSelectedRow());
					}		            		            
		        }
		        catch(Exception e1)
		        {
		            JOptionPane.showMessageDialog(null, e1);
		        }
			}
		});
		
		JPanel deliveryDetails = new JPanel();
		deliveryDetails.setBackground(new Color(245, 245, 220));
		emp_tabbedPane.addTab("New tab", null, deliveryDetails, null);
		deliveryDetails.setLayout(null);
		
		JLabel lblDeliveryDetails = new JLabel("DELIVERY DETAILS");
		lblDeliveryDetails.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDeliveryDetails.setBounds(230, 11, 205, 26);
		deliveryDetails.add(lblDeliveryDetails);
		
		JButton btn_getDetails = new JButton("Get Details");
		btn_getDetails.setBackground(new Color(136, 189, 188));
		
		btn_getDetails.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn_getDetails.setBounds(275, 38, 89, 27);
		deliveryDetails.add(btn_getDetails);
		
		JPanel deli_details = new JPanel();
		deli_details.setBackground(new Color(245, 245, 220));
		deli_details.setBounds(22, 76, 608, 360);
		deli_details.setVisible(false);
		deliveryDetails.add(deli_details);
		deli_details.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 33, 593, 144);
		deli_details.add(scrollPane_2);
		
		orderPickedTable = new JTable();
		orderPickedTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane_2.setViewportView(orderPickedTable);
		
		JLabel lblOrdersPicked = new JLabel("ORDERS PICKED : ");
		lblOrdersPicked.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblOrdersPicked.setBounds(10, 0, 205, 33);
		deli_details.add(lblOrdersPicked);
		
		JLabel lblOrdersDelivered = new JLabel("ORDERS DELIVERED : ");
		lblOrdersDelivered.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblOrdersDelivered.setBounds(10, 177, 205, 33);
		deli_details.add(lblOrdersDelivered);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 211, 593, 138);
		deli_details.add(scrollPane_3);
		
		orderDeliveredTable = new JTable();
		scrollPane_3.setViewportView(orderDeliveredTable);
		orderDeliveredTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		btn_getDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				deli_details.setVisible(true);
				orderPickedTable.setModel(new DefaultTableModel(
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
					orderPickedTable.getColumnModel().getColumn(0).setMinWidth(50);
					orderPickedTable.getColumnModel().getColumn(1).setMinWidth(50);
					orderPickedTable.getColumnModel().getColumn(2).setMinWidth(50);
					orderPickedTable.getColumnModel().getColumn(3).setMinWidth(50);
					orderPickedTable.getColumnModel().getColumn(4).setPreferredWidth(100);
					orderPickedTable.getColumnModel().getColumn(4).setMinWidth(100);
					orderPickedTable.getColumnModel().getColumn(5).setPreferredWidth(100);
					orderPickedTable.getColumnModel().getColumn(5).setMinWidth(100);
					orderPickedTable.getColumnModel().getColumn(6).setMinWidth(50);
					orderPickedTable.getColumnModel().getColumn(7).setMinWidth(50);
					orderPickedTable.getColumnModel().getColumn(8).setMinWidth(50);
					orderPickedTable.getColumnModel().getColumn(9).setMinWidth(50);
					orderPickedTable.getColumnModel().getColumn(10).setMinWidth(50);
					orderPickedTable.getColumnModel().getColumn(11).setMinWidth(50);
					orderPickedTable.getColumnModel().getColumn(12).setMinWidth(50);
					orderPickedTable.getColumnModel().getColumn(13).setMinWidth(50);
					orderPickedTable.getColumnModel().getColumn(14).setMinWidth(50);
					scrollPane_2.setViewportView(orderPickedTable);
					
					DefaultTableModel dt = (DefaultTableModel) orderPickedTable.getModel();
					try      //////pick up order table
			        { 
			            //DefaultTableModel dt = (DefaultTableModel) pickOrderTable.getModel();
			            dt.setRowCount(0);
			            Connection con = jdbcConnection.getCon();
			            Statement st = con.createStatement();
			            ResultSet rs = st.executeQuery("select * from order_details where "
			            		+ "order_id in(select order_id from delivery_details where delivery_details.emp_pick='"+ename+"');");
			           
			            while(rs.next())
			            {
			            	 //System.out.println("resultset");
			            dt.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)
			            		,rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(14),
			            		rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18)});		            		     
			            }
			        }
			        catch(Exception e1)
			        {
			            JOptionPane.showMessageDialog(null, e1);
			        }
					
					/////////////////////////////////order delivered table
					
					orderDeliveredTable.setModel(new DefaultTableModel(
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
						orderDeliveredTable.getColumnModel().getColumn(0).setMinWidth(50);
						orderDeliveredTable.getColumnModel().getColumn(1).setMinWidth(50);
						orderDeliveredTable.getColumnModel().getColumn(2).setMinWidth(50);
						orderDeliveredTable.getColumnModel().getColumn(3).setMinWidth(50);
						orderDeliveredTable.getColumnModel().getColumn(4).setPreferredWidth(100);
						orderDeliveredTable.getColumnModel().getColumn(4).setMinWidth(100);
						orderDeliveredTable.getColumnModel().getColumn(5).setPreferredWidth(100);
						orderDeliveredTable.getColumnModel().getColumn(5).setMinWidth(100);
						orderDeliveredTable.getColumnModel().getColumn(6).setMinWidth(50);
						orderDeliveredTable.getColumnModel().getColumn(7).setMinWidth(50);
						orderDeliveredTable.getColumnModel().getColumn(8).setMinWidth(50);
						orderDeliveredTable.getColumnModel().getColumn(9).setMinWidth(50);
						orderDeliveredTable.getColumnModel().getColumn(10).setMinWidth(50);
						orderDeliveredTable.getColumnModel().getColumn(11).setMinWidth(50);
						orderDeliveredTable.getColumnModel().getColumn(12).setMinWidth(50);
						orderDeliveredTable.getColumnModel().getColumn(13).setMinWidth(50);
						orderDeliveredTable.getColumnModel().getColumn(14).setMinWidth(50);
						scrollPane_3.setViewportView(orderDeliveredTable);
						
						DefaultTableModel d_dt = (DefaultTableModel) orderDeliveredTable.getModel();
						try      //////pick up order table
				        { 
				            //DefaultTableModel d_dt = (DefaultTableModel) pickOrderTable.getModel();
				            d_dt.setRowCount(0);
				            Connection con = jdbcConnection.getCon();
				            Statement st = con.createStatement();
				            ResultSet rs = st.executeQuery("select * from order_details where "
				            		+ "order_id in(select order_id from delivery_details where delivery_details.emp_deli='"+ename+"');");
				           
				            while(rs.next())
				            {
				            	 //System.out.println("resultset");
				            d_dt.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)
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
		
		JPanel viewEmpProfile = new JPanel();
		viewEmpProfile.setBackground(new Color(245, 245, 220));
		emp_tabbedPane.addTab("New tab", null, viewEmpProfile, null);
		viewEmpProfile.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("EMPLOYEE PROFILE - "+ename);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(152, 11, 473, 24);
		viewEmpProfile.add(lblNewLabel_1_1);
		
		JLabel txt_eProfile = new JLabel();
		txt_eProfile.setVerticalAlignment(SwingConstants.TOP);
		txt_eProfile.setText("");
		txt_eProfile.setHorizontalAlignment(SwingConstants.CENTER);
		txt_eProfile.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txt_eProfile.setBounds(137, 39, 345, 232);
		viewEmpProfile.add(txt_eProfile);
		
		String e_profile="";
		try {
			Connection con = jdbcConnection.getCon();
			Statement st= con.createStatement();
			String query= "select * from employee_details where emp_name='"+ename+"'";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
			     e_profile="<html><b>Employee Name  : </b>"+rs.getString("emp_name")+
			    		 "<br><br><b>Employee ID     : </b>"+rs.getInt("emp_id")
			     		+" <br><br><b> Age      : </b>"+rs.getString("emp_age")
						+"<br><br><b> Gender      : </b>"+rs.getString("emp_gender")+
						"<br><br><b>Branch      : </b>"+rs.getString("emp_branch")+
			     		" <br><br><b>Mail ID  : </b>"+rs.getString("emp_mail")+
			     		" <br><br><b> Mobile   : </b>" +rs.getString("emp_mobile")+"<br><br>"
						+ " </html>";
				
			}
			txt_eProfile.setText(e_profile);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
			
			JPanel update_emp_panel = new JPanel();
			update_emp_panel.setBackground(new Color(245, 245, 220));
			update_emp_panel.setBounds(10, 300, 650, 136);
			viewEmpProfile.add(update_emp_panel);
			update_emp_panel.setVisible(false);
			update_emp_panel.setLayout(null);
			
			JLabel lblNewLabel_3_4_1_2 = new JLabel("Employee ID : ");
			lblNewLabel_3_4_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblNewLabel_3_4_1_2.setBounds(10, 0, 103, 24);
			update_emp_panel.add(lblNewLabel_3_4_1_2);
			
			update_eid = new JTextField();
			update_eid.setEditable(false);
			update_eid.setColumns(10);
			update_eid.setBackground(new Color(245, 245, 220));
			update_eid.setBounds(103, 4, 142, 20);
			update_emp_panel.add(update_eid);
			
			JLabel lblNewLabel_3_4_1_1_1 = new JLabel("Name : ");
			lblNewLabel_3_4_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblNewLabel_3_4_1_1_1.setBounds(48, 36, 48, 24);
			update_emp_panel.add(lblNewLabel_3_4_1_1_1);
			
			update_ename = new JTextField();
			update_ename.setEditable(false);
			update_ename.setColumns(10);
			update_ename.setBackground(new Color(245, 245, 220));
			update_ename.setBounds(103, 39, 142, 20);
			update_emp_panel.add(update_ename);
			
			JLabel lblNewLabel_3_4_6_2_1 = new JLabel("Mail id : ");
			lblNewLabel_3_4_6_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblNewLabel_3_4_6_2_1.setBounds(48, 70, 65, 24);
			update_emp_panel.add(lblNewLabel_3_4_6_2_1);
			
			update_eEmail = new JTextField();
			update_eEmail.setColumns(10);
			update_eEmail.setBackground(Color.WHITE);
			update_eEmail.setBounds(103, 74, 142, 20);
			update_emp_panel.add(update_eEmail);
			
			JLabel lblNewLabel_3_4_1_3 = new JLabel("Branch : ");
			lblNewLabel_3_4_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblNewLabel_3_4_1_3.setBounds(345, 0, 65, 24);
			update_emp_panel.add(lblNewLabel_3_4_1_3);
			
			update_ebranch = new JTextField();
			update_ebranch.setEditable(false);
			update_ebranch.setColumns(10);
			update_ebranch.setBackground(new Color(245, 245, 220));
			update_ebranch.setBounds(410, 3, 151, 20);
			update_emp_panel.add(update_ebranch);
			
			JLabel lblNewLabel_3_4_1_1_2 = new JLabel("Age : ");
			lblNewLabel_3_4_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblNewLabel_3_4_1_1_2.setBounds(355, 36, 48, 24);
			update_emp_panel.add(lblNewLabel_3_4_1_1_2);
			
			update_eage = new JTextField();
			update_eage.setColumns(10);
			update_eage.setBackground(Color.WHITE);
			update_eage.setBounds(410, 38, 151, 20);
			update_emp_panel.add(update_eage);
			
			JLabel lblNewLabel_3_4_6_3 = new JLabel("Mobile : ");
			lblNewLabel_3_4_6_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblNewLabel_3_4_6_3.setBounds(345, 70, 73, 24);
			update_emp_panel.add(lblNewLabel_3_4_6_3);
			
			update_emobile = new JTextField();
			update_emobile.setColumns(10);
			update_emobile.setBackground(Color.WHITE);
			update_emobile.setBounds(410, 73, 151, 20);
			update_emp_panel.add(update_emobile);
			
			JButton btn_updateEmployee = new JButton("Update");
			btn_updateEmployee.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "Are you sure to update profile");
				      switch (result) {
				         case JOptionPane.YES_OPTION:{
				        	 try {
									Connection con = jdbcConnection.getCon();
									Statement st= con.createStatement();
									String query="update employee_details set emp_age='"+update_eage.getText()+
											"' , emp_mobile='"+update_emobile.getText()+"' , emp_mail='"+update_eEmail.getText()+"'"
													+ "where emp_id='"+update_eid.getText()+"'";
									st.executeUpdate(query);
									JOptionPane.showMessageDialog(getRootPane(), "Employee Details Updated!!");
									update_emp_panel.setVisible(false);
								
								} catch (SQLException e1) {
									e1.printStackTrace();
								}				         
				         break;
				    }    }
				      String e_profile="";
						try {
							Connection con = jdbcConnection.getCon();
							Statement st= con.createStatement();
							String query= "select * from employee_details where emp_name='"+ename+"'";
							ResultSet rs = st.executeQuery(query);
							
							while(rs.next())
							{
							     e_profile="<html><b>Employee Name  : </b>"+rs.getString("emp_name")+
							    		 "<br><br><b>Employee ID     : </b>"+rs.getInt("emp_id")
							     		+" <br><br><b> Age      : </b>"+rs.getString("emp_age")
										+"<br><br><b> Gender      : </b>"+rs.getString("emp_gender")+
										"<br><br><b>Branch      : </b>"+rs.getString("emp_branch")+
							     		" <br><br><b>Mail ID  : </b>"+rs.getString("emp_mail")+
							     		" <br><br><b> Mobile   : </b>" +rs.getString("emp_mobile")+"<br><br>"
										+ " </html>";
								
							}
							txt_eProfile.setText(e_profile);
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
				}
			});
			btn_updateEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			btn_updateEmployee.setBackground(new Color(136, 189, 188));
			btn_updateEmployee.setBounds(229, 105, 132, 23);
			update_emp_panel.add(btn_updateEmployee);
			
			JButton btn_updateEmployee_1 = new JButton("Update Profile");
			btn_updateEmployee_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					update_emp_panel.setVisible(true);
					try {
						Connection con = jdbcConnection.getCon();
						Statement st= con.createStatement();
						String query= "select * from employee_details where emp_name='"+ename+"'";
						ResultSet rs = st.executeQuery(query);
						
						while(rs.next())
						{
							update_ename.setText(rs.getString("emp_name"));
							update_eid.setText(rs.getString("emp_id"));
							update_ebranch.setText(rs.getString("emp_branch"));
							update_eage.setText(rs.getString("emp_age"));
							update_emobile.setText(rs.getString("emp_mobile"));
							update_eEmail.setText(rs.getString("emp_mail"));						     							
						}
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			});
			btn_updateEmployee_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			btn_updateEmployee_1.setBackground(new Color(136, 189, 188));
			btn_updateEmployee_1.setBounds(246, 274, 132, 23);
			viewEmpProfile.add(btn_updateEmployee_1);
		
		
		btn_pick_status.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
		        {
					if(pickUpStatus.getSelectedItem().toString().equals(pickOrderTable.getValueAt(pickOrderTable.getSelectedRow(), 12))) 
					{JOptionPane.showMessageDialog(null, "Change order status");}
					else {
						int o_id=0;
		            Connection con = jdbcConnection.getCon();
		            Statement st = con.createStatement();
//		            ResultSet rs = st.executeQuery("select * from order_details where order_id = '"+p_orderId.getText()+"'");
//		            while(rs.next())
//		            {
//		            	o_id=rs.getInt("order_id");
//		            }
//		            System.out.println(o_id+ " "+pickUpStatus.getSelectedItem().toString());
		            st.executeUpdate("update order_details set status='"+pickUpStatus.getSelectedItem().toString()
		            	 +"' where order_id='"+p_orderId.getText()+"';");
		            st.executeUpdate("update delivery_details set emp_pick='"+ename+"' , status='"+pickUpStatus.getSelectedItem().toString()+"' where order_id='"+p_orderId.getText()+"';");
		            JOptionPane.showMessageDialog(null, "Status Updated");
		            
		            if(pickUpStatus.getSelectedItem().toString().equals("In Transit")) {
		            sendMail pickMail=new sendMail(p_userMail.getText(),"Order Picked Up","Your order : "+p_orderId.getText()
		            +"\nHas been picked up by "+ename+"\n\n--Track your order by order id--");
		            }
		            p_orderId.setText("");
		            p_name.setText("");
		            p_shipMode.setText("");
		            p_pickAddress.setText("");
		            p_deliAddress.setText("");
		            pickUpStatus.setSelectedIndex(0);
		            p_userMail.setText("");
		            p_userMobile.setText("");
		            dt.removeRow(pickOrderTable.getSelectedRow());		            		            		            
		      	            
		        }}
		        catch(Exception e1)
		        {
		            JOptionPane.showMessageDialog(null, e1);
		        }
			}
		});
		
		JPanel changeEmpPassword = new JPanel();
		changeEmpPassword.setBackground(new Color(245, 245, 220));
		emp_tabbedPane.addTab("New tab", null, changeEmpPassword, null);
		changeEmpPassword.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("CHANGE PASSWORD");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(219, 27, 229, 26);
		changeEmpPassword.add(lblNewLabel_1);
		
		e_newPassword = new JPasswordField();
		e_newPassword.setBounds(310, 122, 155, 28);
		changeEmpPassword.add(e_newPassword);
		
		JLabel lblNewLabel_3_5 = new JLabel("New Password :");
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_5.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_3_5.setBounds(164, 120, 143, 28);
		changeEmpPassword.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("Re-type Password :");
		lblNewLabel_3_5_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3_5_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_5_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_3_5_1.setBounds(139, 161, 172, 28);
		changeEmpPassword.add(lblNewLabel_3_5_1);
		
		e_re_newPassword = new JPasswordField();
		e_re_newPassword.setBounds(309, 161, 155, 28);
		changeEmpPassword.add(e_re_newPassword);
		
		JLabel lblNewLabel_3_5_2 = new JLabel("Old Password  :");
		lblNewLabel_3_5_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3_5_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_5_2.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_3_5_2.setBounds(164, 81, 143, 28);
		changeEmpPassword.add(lblNewLabel_3_5_2);
		
		old_password = new JPasswordField();
		old_password.setBounds(310, 83, 155, 28);
		changeEmpPassword.add(old_password);
		
		JButton btnNewButton = new JButton("Change Password");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass="";
			if(old_password.getText().equals("") || e_newPassword.getText().equals("") || e_re_newPassword.getText().equals(""))	
			{
				JOptionPane.showMessageDialog(null, "Enter Paswword to change");
			}
			else if(!e_newPassword.getText().equals(e_re_newPassword.getText()) ){
				JOptionPane.showMessageDialog(null, "Passwords doesn't match");
			}
			else {
			try
		        {
		            Connection con = jdbcConnection.getCon();
		            Statement st = con.createStatement();
		            ResultSet rs = st.executeQuery("select * from employee_details where emp_name = '"+ename+"'");
		            while(rs.next())
		            {
		            	pass=rs.getString("emp_password");
		            }
		            if(old_password.getText().equals(pass)) {
		            	 st.executeUpdate("update employee_details set emp_password='"+e_newPassword.getText()
		            	 +"' where emp_name='"+ename+"';");
		            	 JOptionPane.showMessageDialog(null, "Password Updated Successfully");
		            	 old_password.setText("");
		            	 e_newPassword.setText("");
		            	 e_re_newPassword.setText("");
		            }
		            else {
		            	JOptionPane.showMessageDialog(null, "Incorrect existing password");
		            }
		            
		        }
		        catch(Exception e1)
		        {
		            JOptionPane.showMessageDialog(null, e1);
		        }

			}}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(271, 234, 163, 28);
		changeEmpPassword.add(btnNewButton);
		
		JCheckBox chck_showPass = new JCheckBox("Show Password");
		chck_showPass.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (!chck_showPass.isSelected())  {
	                old_password.setEchoChar('•'); 
	                e_newPassword.setEchoChar('•');
	                e_re_newPassword.setEchoChar('•');
	            } else {  
	                old_password.setEchoChar((char) 0);
	                e_newPassword.setEchoChar((char) 0);
	                e_re_newPassword.setEchoChar((char) 0);
	            }
			}
		});
		chck_showPass.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		chck_showPass.setBounds(355, 196, 110, 23);
		changeEmpPassword.add(chck_showPass);
		
		btn_empMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emp_tabbedPane.setSelectedIndex(0);
			}
		});
		btn_pickOrders.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emp_tabbedPane.setSelectedIndex(1);
			}
		});
		btn_deliverOrders.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emp_tabbedPane.setSelectedIndex(2);
			}
		});
		btn_deliveryDetails.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emp_tabbedPane.setSelectedIndex(3);
			}
		});
		btn_viewEmpProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emp_tabbedPane.setSelectedIndex(4);
			}
		});
	}
}
