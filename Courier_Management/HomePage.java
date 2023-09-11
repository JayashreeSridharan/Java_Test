package Courier_Management;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.border.LineBorder;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeToXpress;
	private JTextField u_name;
	private JPasswordField u_password;
	private JTextField fname;
	private JTextField lname;
	private JTextField phone;
	private JTextField mail;
	private JTextField username;
	private JPasswordField newPassword;
	private JPasswordField re_newPassword;
	private JTextField a_name;
	private JPasswordField a_password;
	private JTextField e_name;
	private JPasswordField e_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null); 
					frame.setTitle("Courier Management");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePage() {
		
		setBackground(new Color(136, 189, 188));
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBorder(new LineBorder(new Color(0, 0, 0)));
		header.setBackground(new Color(136, 189, 188));
		header.setBounds(0, 0, 836, 68);
		contentPane.add(header);
		header.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("COURIER MANAGEMENT SYSTEM");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		lblNewLabel_6.setBounds(118, 11, 499, 46);
		header.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\jayashree.s\\eclipse-workspace\\Training_Java\\src\\Courier_Management\\images\\xpressLogo.png"));
		lblNewLabel_7.setBounds(10, 11, 100, 42);
		header.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(176, 68, 670, 450);
		header.add(lblNewLabel_8);
		
		JPanel sidePane = new JPanel();
		sidePane.setBorder(new LineBorder(new Color(0, 0, 0)));
		sidePane.setBackground(new Color(136, 189, 188));
		sidePane.setBounds(0, 67, 175, 456);
		contentPane.add(sidePane);
		sidePane.setLayout(null);
		
		JPanel user_pane = new JPanel();
		user_pane.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		user_pane.setBackground(new Color(136, 189, 188));
		
		user_pane.setBounds(10, 120, 155, 46);
		sidePane.add(user_pane);
		user_pane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(47, 11, 54, 24);
		user_pane.add(lblNewLabel);
		
		JPanel admin_pane = new JPanel();
		
		admin_pane.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		admin_pane.setBackground(new Color(136, 189, 188));
		admin_pane.setLayout(null);
		admin_pane.setBounds(10, 177, 155, 46);
		sidePane.add(admin_pane);
		
		JLabel lblAdmin = new JLabel("ADMIN");
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAdmin.setBounds(35, 11, 79, 24);
		admin_pane.add(lblAdmin);
		
		JPanel employee_pane = new JPanel();
		
		employee_pane.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		employee_pane.setBackground(new Color(136, 189, 188));
		employee_pane.setLayout(null);
		employee_pane.setBounds(10, 234, 155, 46);
		sidePane.add(employee_pane);
		
		JLabel lblEmployee = new JLabel("EMPLOYEE");
		lblEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployee.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEmployee.setBounds(23, 11, 107, 24);
		employee_pane.add(lblEmployee);
		
		JPanel user_pane_1 = new JPanel();
		
		user_pane_1.setLayout(null);
		user_pane_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		user_pane_1.setBackground(new Color(136, 189, 188));
		user_pane_1.setBounds(10, 63, 155, 46);
		sidePane.add(user_pane_1);
		
		JLabel lblHome = new JLabel("HOME");
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblHome.setBounds(47, 11, 54, 24);
		user_pane_1.add(lblHome);
		
		JTabbedPane Tabs = new JTabbedPane(JTabbedPane.TOP);
		Tabs.setBounds(172, 39, 664, 484);
		contentPane.add(Tabs);
		
		JPanel welcome = new JPanel();
		welcome.setBackground(new Color(245, 245, 220));
		Tabs.addTab("New tab", null, welcome, null);
		welcome.setLayout(null);
		
		txtWelcomeToXpress = new JTextField();
		txtWelcomeToXpress.setBorder(null);
		txtWelcomeToXpress.setEditable(false);
		txtWelcomeToXpress.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToXpress.setText("WELCOME TO XPRESS COURIER");
		txtWelcomeToXpress.setFont(new Font("Harrington", Font.BOLD, 30));
		txtWelcomeToXpress.setOpaque(false);
		txtWelcomeToXpress.setBounds(92, 151, 475, 54);
		welcome.add(txtWelcomeToXpress);
		txtWelcomeToXpress.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBackground(new Color(136, 189, 188));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\jayashree.s\\eclipse-workspace\\Training_Java\\src\\Courier_Management\\images\\homepage.gif"));
		lblNewLabel_1.setBounds(0, 5, 670, 449);
		welcome.add(lblNewLabel_1);
		
		JPanel user = new JPanel();
		user.setBackground(new Color(255, 229, 180));
		Tabs.addTab("New tab", null, user, null);
		user.setLayout(null);
		
		JTabbedPane user_tabs = new JTabbedPane(JTabbedPane.TOP);
		user_tabs.setBounds(0, -26, 659, 482);
		user.add(user_tabs);
		
		user_pane_1.addMouseListener(new MouseAdapter() { //go to home tab
			@Override
			public void mouseClicked(MouseEvent e) {
				Tabs.setSelectedIndex(0);
			}
			
			
		});
		user_pane.addMouseListener(new MouseAdapter() {  //go to user tab
			@Override
			public void mouseClicked(MouseEvent e) {
				Tabs.setSelectedIndex(1);
				user_tabs.setSelectedIndex(0);
				
			}
		});
		
		admin_pane.addMouseListener(new MouseAdapter() { //go to admin tab
			@Override
			public void mouseClicked(MouseEvent e) {
				Tabs.setSelectedIndex(2);
			}
		});
		
		employee_pane.addMouseListener(new MouseAdapter() { //go to employee tab
			@Override
			public void mouseClicked(MouseEvent e) {
				Tabs.setSelectedIndex(3);
			}
		});
		
		
		JPanel login_form = new JPanel();
		login_form.setBackground(new Color(245, 245, 220));
		user_tabs.addTab("New tab", null, login_form, null);
		login_form.setLayout(null);
		
		u_name = new JTextField();
		u_name.setBounds(365, 98, 216, 33);
		login_form.add(u_name);
		u_name.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("USERNAME : ");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4.setBounds(254, 97, 139, 35);
		login_form.add(lblNewLabel_4);
		
		u_password = new JPasswordField();
		u_password.setBounds(365, 155, 216, 33);
		login_form.add(u_password);
		
		JLabel lblNewLabel_4_1 = new JLabel("PASSWORD :");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4_1.setBounds(254, 153, 139, 35);
		login_form.add(lblNewLabel_4_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(136, 189, 188));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname= u_name.getText();
				String pswd=u_password.getText();
				if(uname.equals("") || u_password.equals(""))
				{
					JOptionPane.showMessageDialog(getRootPane(), "Enter valid username & password");
				}
				else {
					Connection con;
					try {
						con = jdbcConnection.getCon();
						Statement st= con.createStatement();
						String query= "select * from user_details where uname='"+uname+"'";
						ResultSet rs = st.executeQuery(query);
						int f=0;
						while(rs.next())
						{
							f=1;
							if(rs.getString("u_password").equals(u_password.getText()))
							{
								JOptionPane.showMessageDialog(getRootPane(), "Login Successful");
								User user=new User(uname);
								user.setTitle(uname);
								user.setVisible(true);
								user.setLocationRelativeTo(null); 
								dispose();
							}
							else {
								JOptionPane.showMessageDialog(getRootPane(), "Incorrect Password");
							}
						}
						if(f==0) {JOptionPane.showMessageDialog(getRootPane(), "User doesn't exists");}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}																
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(365, 238, 216, 33);
		login_form.add(btnNewButton);
		
		JLabel Signup_direct = new JLabel("New User? Click To Sign Up");
		Signup_direct.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				user_tabs.setSelectedIndex(1);
				fname.setText("");lname.setText("");phone.setText("");mail.setText("");newPassword.setText("");
				re_newPassword.setText("");username.setText("");
			}
		});
		Signup_direct.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Signup_direct.setBounds(375, 273, 233, 33);
		login_form.add(Signup_direct);
		
		JCheckBox showPassword = new JCheckBox("Show Password");
		showPassword.setBackground(new Color(245, 245, 220));
		showPassword.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		showPassword.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (!showPassword.isSelected())  {
	                u_password.setEchoChar('•'); 
	            } else {  
	                u_password.setEchoChar((char) 0);  
	            }
			}
		});
		showPassword.setBounds(478, 195, 103, 23);
		login_form.add(showPassword);
		
		JLabel lblNewLabel_4_4 = new JLabel("USER LOGIN");
		lblNewLabel_4_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4_4.setBounds(347, 33, 146, 42);
		login_form.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\jayashree.s\\eclipse-workspace\\Training_Java\\src\\Courier_Management\\images\\userLogin.jpg"));
		lblNewLabel_5.setBounds(0, 0, 670, 450);
		login_form.add(lblNewLabel_5);
		
		JPanel signup_form = new JPanel();
		signup_form.setBackground(new Color(245, 245, 220));
		user_tabs.addTab("New tab", null, signup_form, null);
		signup_form.setLayout(null);
		
		fname = new JTextField();
		fname.setBounds(251, 52, 155, 28);
		signup_form.add(fname);
		fname.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("First Name  : ");
		lblNewLabel_3.setBackground(new Color(240, 240, 240));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_3.setBounds(133, 50, 130, 28);
		signup_form.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Last Name  : ");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_3_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_3_1.setBounds(133, 89, 130, 28);
		signup_form.add(lblNewLabel_3_1);
		
		lname = new JTextField();
		lname.setColumns(10);
		lname.setBounds(251, 91, 155, 28);
		signup_form.add(lname);
		
		JLabel lblNewLabel_3_2 = new JLabel("Phone number :");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_3_2.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_3_2.setBounds(106, 130, 132, 28);
		signup_form.add(lblNewLabel_3_2);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(251, 130, 155, 28);
		signup_form.add(phone);
		
		JLabel lblNewLabel_3_3 = new JLabel("Email ID :");
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_3_3.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_3_3.setBounds(153, 167, 130, 28);
		signup_form.add(lblNewLabel_3_3);
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(251, 169, 155, 28);
		signup_form.add(mail);
		
		JLabel lblNewLabel_3_4 = new JLabel("User Name :");
		lblNewLabel_3_4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_3_4.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_3_4.setBounds(133, 206, 130, 28);
		signup_form.add(lblNewLabel_3_4);
		
		JLabel usernamevalid = new JLabel(" ");
		usernamevalid.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		usernamevalid.setBounds(409, 210, 87, 23);
		signup_form.add(usernamevalid);
		
		username = new JTextField();
		username.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String username1 = username.getText();
				int f=0;
                if(!username1.equals(""))
                {
                    usernamevalid.setVisible(true);
                    usernamevalid.setText("Available");             
                    try
                    {
                        Connection con = jdbcConnection.getCon();
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("select * from user_details where uname = '"+username1+"'");
                        while(rs.next())
                        {
                        	f=1;
                            usernamevalid.setText("Not Available");
                        }
                    }
                    catch(Exception e1)
                    {
                        JOptionPane.showMessageDialog(null, e1);
                    }
                }
                else
                {
                    usernamevalid.setText("Available");
                }
			}
		});
		
		username.setColumns(10);
		username.setBounds(251, 208, 155, 28);
		signup_form.add(username);
		
		JLabel lblNewLabel_3_5 = new JLabel("Password :");
		lblNewLabel_3_5.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_3_5.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_3_5.setBounds(153, 245, 110, 28);
		signup_form.add(lblNewLabel_3_5);
		
		newPassword = new JPasswordField();
		newPassword.setBounds(251, 247, 155, 28);
		signup_form.add(newPassword);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("Re-type Password :");
		lblNewLabel_3_5_1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_3_5_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_3_5_1.setBounds(81, 287, 172, 28);
		signup_form.add(lblNewLabel_3_5_1);
		
		re_newPassword = new JPasswordField();
		re_newPassword.setBounds(251, 287, 155, 28);
		signup_form.add(re_newPassword);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mailpattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
				String mobilePattern = "^[0-9]*$";
				if(fname.getText().equals(null) || lname.getText().equals(null) || username.getText().equals(null)) {
					JOptionPane.showMessageDialog(getRootPane(), "Enter valid names");
				}
				else if(!phone.getText().matches(mobilePattern)) {
					JOptionPane.showMessageDialog(getRootPane(), "Enter valid mobile number");
				}
				else if(!mail.getText().matches(mailpattern)) {
					JOptionPane.showMessageDialog(getRootPane(), "Enter valid mail id");
				}
				else if(newPassword.getText().equals("") || re_newPassword.getText().equals("")) {
					JOptionPane.showMessageDialog(getRootPane(), "Enter vaild Password");
				}
				else if(!newPassword.getText().equals(re_newPassword.getText())) {
					JOptionPane.showMessageDialog(getRootPane(), "Password doesn't match");
				}
				else {
					try {
						
						Connection con=jdbcConnection.getCon();
						Statement st= con.createStatement();
						String query= "insert into user_details (uname,fname,lname,u_password,mailid,mobile)"
								+ " values ('"+username.getText()+"','"+fname.getText()+"','"+lname.getText()+
								"','"+newPassword.getText()+"','"
								+mail.getText()+"','"+phone.getText()+"')";
						st.executeUpdate(query);
						System.out.println(query);

						
					JOptionPane.showMessageDialog(getRootPane(), "Registered Successfully\nLogin to continue");
					fname.setText("");lname.setText("");phone.setText("");mail.setText("");newPassword.setText("");
					re_newPassword.setText("");username.setText("");
					user_tabs.setSelectedIndex(0);
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(getRootPane(), e1);
					}
					
				}
				
				
			}
		});
		btnNewButton_1.setBackground(new Color(136, 189, 188));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(261, 331, 130, 20);
		signup_form.add(btnNewButton_1);
		
		JLabel login_direct = new JLabel("Already a user?Click to Sign in");
		login_direct.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				user_tabs.setSelectedIndex(0); 
				fname.setText("");lname.setText("");phone.setText("");mail.setText("");newPassword.setText("");
				re_newPassword.setText("");username.setText("");
				u_name.setText("");u_password.setText("");
}
		});
		login_direct.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		login_direct.setBounds(228, 362, 193, 23);
		signup_form.add(login_direct);
		
		JCheckBox reg_showPassword = new JCheckBox("Show Password");
		reg_showPassword.setBackground(new Color(245, 245, 220));
		reg_showPassword.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (!reg_showPassword.isSelected())  {
	                newPassword.setEchoChar('•'); 
	                re_newPassword.setEchoChar('•'); 
	            } else {  
	                newPassword.setEchoChar((char) 0);  
	                re_newPassword.setEchoChar((char) 0);
	            }
			}
		});
		reg_showPassword.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		reg_showPassword.setBounds(412, 293, 103, 23);
		signup_form.add(reg_showPassword);
		
		JLabel lblNewLabel_4_4_1 = new JLabel("USER SIGN UP");
		lblNewLabel_4_4_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4_4_1.setBounds(204, 11, 146, 42);
		signup_form.add(lblNewLabel_4_4_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\jayashree.s\\eclipse-workspace\\Training_Java\\src\\Courier_Management\\images\\userSignup.jpg"));
		lblNewLabel_2.setBounds(0, 2, 670, 450);
		signup_form.add(lblNewLabel_2);
		
		
		
		JPanel admin = new JPanel();
		admin.setBackground(new Color(192, 192, 192));
		Tabs.addTab("New tab", null, admin, null);
		admin.setLayout(null);
		
		JPanel admin_login = new JPanel();
		admin_login.setLayout(null);
		admin_login.setBackground(new Color(245, 245, 220));
		admin_login.setBounds(0, 0, 659, 456);
		admin.add(admin_login);
		
		a_name = new JTextField();
		a_name.setColumns(10);
		a_name.setBounds(304, 98, 216, 33);
		admin_login.add(a_name);
		
		JLabel lblNewLabel_4_2 = new JLabel("ADMIN LOGIN");
		lblNewLabel_4_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4_2.setBounds(297, 47, 177, 35);
		admin_login.add(lblNewLabel_4_2);
		
		a_password = new JPasswordField();
		a_password.setBounds(304, 154, 216, 33);
		admin_login.add(a_password);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("PASSWORD :");
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4_1_1.setBounds(200, 152, 139, 35);
		admin_login.add(lblNewLabel_4_1_1);
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.setBackground(new Color(136, 189, 188));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a_name.getText().equals("") || a_password.getText().equals("")) {
					JOptionPane.showMessageDialog(getRootPane(), "Enter valid name & password");
				}
				else if(a_name.getText().equals("admin") && a_password.getText().equals("admin123")){
					
					JOptionPane.showMessageDialog(getRootPane(), "Admin Login Successful");
					Admin admin=new Admin();
					admin.setVisible(true);
					dispose();
					
				}
				else { 	
					JOptionPane.showMessageDialog(getRootPane(), "Incorrect Admin name or password");
				}
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_2.setBounds(304, 228, 145, 33);
		admin_login.add(btnNewButton_2);
		
		JCheckBox a_showPassword = new JCheckBox("Show Password");
		a_showPassword.setBackground(new Color(245, 245, 220));
		a_showPassword.addChangeListener(new ChangeListener() {			
			public void stateChanged(ChangeEvent e) {
				if (!a_showPassword.isSelected())  {
	                a_password.setEchoChar('•'); 
	            } else {  
	                a_password.setEchoChar((char) 0);  
	            }
			}
		});
		a_showPassword.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		a_showPassword.setBounds(411, 194, 107, 23);
		admin_login.add(a_showPassword);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("ADMIN NAME : ");
		lblNewLabel_4_2_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4_2_1.setBounds(180, 98, 177, 35);
		admin_login.add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\jayashree.s\\eclipse-workspace\\Training_Java\\src\\Courier_Management\\images\\adminLogin.jpg"));
		lblNewLabel_9.setBounds(0, 5, 670, 450);
		admin_login.add(lblNewLabel_9);
		
		JPanel employee = new JPanel();
		Tabs.addTab("New tab", null, employee, null);
		employee.setLayout(null);
		
		JPanel employee_login = new JPanel();
		employee_login.setLayout(null);
		employee_login.setBackground(new Color(245, 245, 220));
		employee_login.setBounds(0, 0, 659, 456);
		employee.add(employee_login);
		
		e_name = new JTextField();
		e_name.setColumns(10);
		e_name.setBounds(230, 103, 216, 33);
		employee_login.add(e_name);
		
		JLabel lblNewLabel_4_3 = new JLabel("EMPLOYEE NAME :");
		lblNewLabel_4_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4_3.setBounds(66, 101, 186, 35);
		employee_login.add(lblNewLabel_4_3);
		
		e_password = new JPasswordField();
		e_password.setBounds(230, 159, 216, 33);
		employee_login.add(e_password);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("PASSWORD :");
		lblNewLabel_4_1_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4_1_2.setBounds(126, 157, 139, 35);
		employee_login.add(lblNewLabel_4_1_2);
		
		JButton btnNewButton_3 = new JButton("Login");
		btnNewButton_3.setBackground(new Color(136, 189, 188));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e_name.getText().equals("") || e_password.getText().equals("")) {
					JOptionPane.showMessageDialog(getRootPane(), "Enter valid name & password");
				}
				else {
					Connection con;
					try {
						con = jdbcConnection.getCon();
						Statement st= con.createStatement();
						String query= "select * from employee_details where emp_name='"+e_name.getText()+"'";
						ResultSet rs = st.executeQuery(query);
						int f=0;
						while(rs.next())
						{
							f=1;
							if(rs.getString("emp_password").equals(e_password.getText()))
							{
								JOptionPane.showMessageDialog(getRootPane(), "Employee Login Successful");
								Employee employee=new Employee(e_name.getText());
								employee.setVisible(true);
								dispose();
							
							}
							else {
								JOptionPane.showMessageDialog(getRootPane(), "Incorrect Password");
							}
						}
						if(f==0) {JOptionPane.showMessageDialog(getRootPane(), "Employee doesn't exists");}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
					//JOptionPane.showMessageDialog(getRootPane(), "Employee Login Successful");
				}
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_3.setBounds(256, 238, 139, 33);
		employee_login.add(btnNewButton_3);
		
		JCheckBox e_showPassword = new JCheckBox("Show Password");
		e_showPassword.setBackground(new Color(245, 245, 220));
		e_showPassword.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (!e_showPassword.isSelected())  {
	                e_password.setEchoChar('•'); 
	            } else {  
	                e_password.setEchoChar((char) 0);  
	            }
			}
		});
		e_showPassword.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		e_showPassword.setBounds(347, 199, 99, 23);
		employee_login.add(e_showPassword);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("EMPLOYEE LOGIN");
		lblNewLabel_4_3_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4_3_1.setBounds(154, 55, 232, 35);
		employee_login.add(lblNewLabel_4_3_1);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\jayashree.s\\eclipse-workspace\\Training_Java\\src\\Courier_Management\\images\\employeeLogin.jpg"));
		lblNewLabel_10.setBounds(0, 5, 670, 450);
		employee_login.add(lblNewLabel_10);
	}
}


/*Color codes   0,177,210
253,219,39
223,101,137
6,16,83*/