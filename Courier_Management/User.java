package Courier_Management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JDesktopPane;
import javax.swing.JCheckBox;
import java.awt.Choice;
import java.awt.Label;
import java.awt.Canvas;
import javax.swing.JProgressBar;
import java.awt.Checkbox;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class User extends JFrame {

	private JPanel contentPane;
	private JComboBox from_pincode;
	private JComboBox to_pincode;
	private JTextField weight;
	private JTextField length;
	private JTextField breadth;
	private JTextField height;
	
	static JButton btn_bill;
	static JButton btn_placeOrder;
	
	static int len,bred,heigh;
	static int weigh;
	static String to_pin,from_pin;
	static String from_add,to_add,s_mode,s_type,s_content,service_type,payment_mode;
	static double price;
	static int ser_value=1,ser_days=1;
	static String ser_type;
	
	String basictxt,supertxt,premiumtxt;
	private JComboBox t_order_id;
	private JTextField update_ufname;
	private JTextField update_ulname;
	private JTextField update_umobile;
	private JTextField update_uid;
	private JTextField update_uname;
	private JTextField update_umail;
	
	
public static double getPrice() {
		return price;
	}

	public static void setPrice(double price) {
		User.price = price;
	}

/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User("hello");
					//frame.setTitle();
					frame.setLocationRelativeTo(null); 
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//public User() {}
	/**
	 * Create the frame.
	 * @param uname 
	 */
	
	public User(String uname) {
		
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(136, 189, 188));
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 836, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblXpressCourier = new JLabel("XPRESS COURIER");
		lblXpressCourier.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblXpressCourier.setBounds(10, 11, 257, 42);
		panel.add(lblXpressCourier);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\jayashree.s\\eclipse-workspace\\Training_Java\\src\\Courier_Management\\images\\xpressLogo.png"));
		lblNewLabel_7.setBounds(726, 5, 100, 42);
		panel.add(lblNewLabel_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(136, 189, 188));
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(0, 56, 189, 467);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel btn_newOrder = new JLabel("New Order");
		btn_newOrder.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		btn_newOrder.setHorizontalAlignment(SwingConstants.CENTER);
		btn_newOrder.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn_newOrder.setBounds(10, 141, 169, 43);
		panel_1.add(btn_newOrder);
		
		JLabel btn_trackOrder = new JLabel("Track Order");
		btn_trackOrder.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		btn_trackOrder.setHorizontalAlignment(SwingConstants.CENTER);
		btn_trackOrder.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn_trackOrder.setBounds(10, 193, 169, 43);
		panel_1.add(btn_trackOrder);
		
		JLabel btn_viewProfile = new JLabel("View Profile");
		btn_viewProfile.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		btn_viewProfile.setHorizontalAlignment(SwingConstants.CENTER);
		btn_viewProfile.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn_viewProfile.setBounds(10, 247, 169, 43);
		panel_1.add(btn_viewProfile);
		
		JLabel btn_newOrder_1 = new JLabel("Main Menu");
		
		btn_newOrder_1.setHorizontalAlignment(SwingConstants.CENTER);
		btn_newOrder_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn_newOrder_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btn_newOrder_1.setBounds(10, 87, 169, 43);
		panel_1.add(btn_newOrder_1);
		
		JButton btnNewButton_1_2 = new JButton("Logout");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage home=new HomePage();
				home.setVisible(true);
				home.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1_2.setBackground(new Color(136, 189, 188));
		btnNewButton_1_2.setBounds(20, 412, 137, 27);
		panel_1.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(64, 21, 55, 55);
		panel_1.add(lblNewLabel_5);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\jayashree.s\\eclipse-workspace\\Training_Java\\src\\Courier_Management\\images\\userLogo.png"));
		
		JTabbedPane user_menu = new JTabbedPane(JTabbedPane.TOP);
		user_menu.setBounds(191, 36, 645, 487);
		contentPane.add(user_menu);
		btn_newOrder_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				user_menu.setSelectedIndex(0);
			}
		});
		btn_newOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				user_menu.setSelectedIndex(1);
			}
		});
		btn_trackOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				user_menu.setSelectedIndex(2);
			}
		});
		btn_viewProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				user_menu.setSelectedIndex(3);
			}
		});		
		
		JPanel user_menu_pane = new JPanel();
		user_menu_pane.setBackground(new Color(245, 245, 220));
		user_menu.addTab("New tab", null, user_menu_pane, null);
		user_menu_pane.setLayout(null);
		
		JButton btnNewButton = new JButton("New Order");
		btnNewButton.setBackground(new Color(136, 189, 188));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user_menu.setSelectedIndex(1);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(392, 78, 158, 81);
		user_menu_pane.add(btnNewButton);
		
		JButton btnTrackOrder = new JButton("Track Order");
		btnTrackOrder.setBackground(new Color(136, 189, 188));
		btnTrackOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user_menu.setSelectedIndex(2);
			}
		});
		btnTrackOrder.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnTrackOrder.setBounds(392, 183, 164, 81);
		user_menu_pane.add(btnTrackOrder);
		
		JButton btnViewProfile = new JButton("View Profile");
		btnViewProfile.setBackground(new Color(136, 189, 188));
		btnViewProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user_menu.setSelectedIndex(3);
			}
		});
		btnViewProfile.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnViewProfile.setBounds(392, 285, 164, 81);
		user_menu_pane.add(btnViewProfile);
		
		JLabel lblNewLabel = new JLabel("WELCOME "+uname+" !!");
		lblNewLabel.setBackground(new Color(245, 245, 220));
		lblNewLabel.setBounds(99, 11, 422, 42);
		user_menu_pane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\jayashree.s\\eclipse-workspace\\Training_Java\\src\\Courier_Management\\images\\user.gif"));
		lblNewLabel_4.setBounds(0, 0, 670, 450);
		user_menu_pane.add(lblNewLabel_4);
		
		JPanel newOrderPane = new JPanel();
		newOrderPane.setBackground(new Color(245, 245, 220));
		newOrderPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		user_menu.addTab("New tab", null, newOrderPane, null);
		newOrderPane.setLayout(null);
		
		JPanel panel_order = new JPanel();
		panel_order.setBackground(new Color(245, 245, 220));
		panel_order.setBounds(5, 0, 630, 310);
		newOrderPane.add(panel_order);
		panel_order.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ORDER DETAILS");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(215, 11, 178, 24);
		panel_order.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(131, 46, 73, 14);
		panel_order.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Destination");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(394, 47, 98, 14);
		panel_order.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("From City : ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(38, 78, 85, 24);
		panel_order.add(lblNewLabel_3);
		
		JLabel from_city = new JLabel();
		from_city.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		from_city.setBounds(256, 84, 85, 14);
		panel_order.add(from_city);
		
		JLabel to_city = new JLabel();
		to_city.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		to_city.setBounds(541, 84, 85, 14);
		panel_order.add(to_city);
		
		from_pincode = new JComboBox();
		from_pincode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				try{Connection con=jdbcConnection.getCon();
				Statement st= con.createStatement();
				String query= "select * from cities where name_of_city='"+from_pincode.getSelectedItem().toString()+"';";				
				ResultSet rs=st.executeQuery(query);
				while(rs.next()) {
					from_city.setText(rs.getString("state_name"));	
				}	
			}
			catch(Exception e1) {
				JOptionPane.showMessageDialog(getRootPane(), e1);
			}
						}
		});
		from_pincode.setBounds(133, 81, 120, 20);
		panel_order.add(from_pincode);
		
		JLabel lblNewLabel_3_1 = new JLabel("To City : ");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(351, 78, 73, 24);
		panel_order.add(lblNewLabel_3_1);
		
		to_pincode = new JComboBox();
		to_pincode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				try{Connection con=jdbcConnection.getCon();
				Statement st= con.createStatement();
				String query= "select * from cities where name_of_city='"+to_pincode.getSelectedItem().toString()+"';";				
				ResultSet rs=st.executeQuery(query);
				while(rs.next()) {
					to_city.setText(rs.getString("state_name"));	
				}	
			}
			catch(Exception e1) {
				JOptionPane.showMessageDialog(getRootPane(), e1);
			}

			}
		});
		to_pincode.setBounds(426, 81, 113, 20);
		panel_order.add(to_pincode);
		
		from_pincode.addItem("--select--");
		to_pincode.addItem("--select--");
		
try {
			
			Connection con=jdbcConnection.getCon();
			Statement st= con.createStatement();
			String query= "select * from cities order by name_of_city";
			
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				from_pincode.addItem(rs.getString("name_of_city"));
				to_pincode.addItem(rs.getString("name_of_city"));
			}	
		}
		catch(Exception e1) {
			JOptionPane.showMessageDialog(getRootPane(), e1);
		}
		
		JTextArea fromAddress = new JTextArea();
		fromAddress.setBounds(133, 112, 146, 56);
		panel_order.add(fromAddress);
		
		JLabel lblNewLabel_3_2 = new JLabel("Pick-up Address:");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(10, 113, 113, 24);
		panel_order.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Delivery Address:");
		lblNewLabel_3_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2_1.setBounds(297, 113, 120, 24);
		panel_order.add(lblNewLabel_3_2_1);
		
		JTextArea toAddress = new JTextArea();
		toAddress.setBounds(426, 113, 146, 56);
		panel_order.add(toAddress);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Shipment mode :");
		lblNewLabel_3_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2_2.setBounds(20, 184, 113, 24);
		panel_order.add(lblNewLabel_3_2_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 179, 574, 2);
		panel_order.add(separator);
		
		JComboBox ship_mode = new JComboBox();
		ship_mode.setModel(new DefaultComboBoxModel(new String[] {"--Select Mode--", "Air Freight", "Sea Freight", "Road Freight"}));
		ship_mode.setBounds(130, 186, 149, 22);
		panel_order.add(ship_mode);
		
		JLabel lblNewLabel_3_2_2_1 = new JLabel("Shipment type :");
		lblNewLabel_3_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2_2_1.setBounds(30, 217, 113, 24);
		panel_order.add(lblNewLabel_3_2_2_1);
		
		JComboBox ship_type = new JComboBox();
		ship_type.setModel(new DefaultComboBoxModel(new String[] {"--Select Type--", "Document", "Non-Document"}));
		ship_type.setBounds(130, 219, 149, 22);
		panel_order.add(ship_type);
		
		JLabel lblNewLabel_3_2_2_1_1 = new JLabel("Content : ");
		lblNewLabel_3_2_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2_2_1_1.setBounds(66, 252, 113, 24);
		panel_order.add(lblNewLabel_3_2_2_1_1);
		
		JComboBox ship_content = new JComboBox();
		ship_content.setModel(new DefaultComboBoxModel(new String[] {"--Select Non-Document--", "Document", "Auto parts", "Backup Battery", "Books", "Camera", "Clothing", "Computer Parts", "Ecommerce Content", "Electronic Item", "Furniture", "Food productd", "Gift Items", "Home Appliance"}));
		ship_content.setBounds(130, 254, 149, 22);
		panel_order.add(ship_content);
		
		JLabel lblNewLabel_3_3 = new JLabel("Weight (in kgs) :");
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(311, 184, 113, 24);
		panel_order.add(lblNewLabel_3_3);
		
		weight = new JTextField();
		weight.setColumns(10);
		weight.setBounds(426, 187, 146, 20);
		panel_order.add(weight);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Length(cms) :     Breadth(cms) :     Height(cms):");
		lblNewLabel_3_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_3_1.setBounds(321, 217, 299, 24);
		panel_order.add(lblNewLabel_3_3_1);
		
		length = new JTextField();
		length.setBounds(342, 243, 51, 20);
		panel_order.add(length);
		length.setColumns(10);
		
		breadth = new JTextField();
		breadth.setColumns(10);
		breadth.setBounds(441, 243, 51, 20);
		panel_order.add(breadth);
		
		height = new JTextField();
		height.setColumns(10);
		height.setBounds(541, 243, 51, 20);
		panel_order.add(height);
		
		JButton btn_getEstimate = new JButton("Get Estimate");
		btn_getEstimate.setBackground(new Color(136, 189, 188));
		btn_getEstimate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		btn_getEstimate.setBounds(464, 278, 140, 30);
		panel_order.add(btn_getEstimate);
		
		
		
		JPanel panel_order_place = new JPanel();
		panel_order_place.setBackground(new Color(245, 245, 220));
		panel_order_place.setBounds(5, 312, 630, 132);
		newOrderPane.add(panel_order_place);
		panel_order_place.setLayout(null);
		panel_order_place.setVisible(false);
		
		//-----------radio button----------//
		ButtonGroup service_rdbtn=new ButtonGroup();
		
		JLabel lblNewLabel_2_2 = new JLabel("Service Type :");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(10, 11, 101, 27);
		panel_order_place.add(lblNewLabel_2_2);
		
		JRadioButton rdbtnBasic = new JRadioButton();
		rdbtnBasic.setBackground(new Color(245, 245, 220));
		rdbtnBasic.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnBasic.setBounds(117, 13, 403, 23);
		panel_order_place.add(rdbtnBasic);
		
		JRadioButton rdbtnSuper = new JRadioButton();
		rdbtnSuper.setBackground(new Color(245, 245, 220));
		rdbtnSuper.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnSuper.setBounds(117, 40, 433, 23);
		panel_order_place.add(rdbtnSuper);
		
		JRadioButton rdbtnPremium = new JRadioButton();
		rdbtnPremium.setBackground(new Color(245, 245, 220));
		rdbtnPremium.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnPremium.setBounds(117, 66, 433, 23);
		panel_order_place.add(rdbtnPremium);
		
		service_rdbtn.add(rdbtnBasic);
		service_rdbtn.add(rdbtnSuper);
		service_rdbtn.add(rdbtnPremium);
		
		btn_getEstimate.addActionListener(new ActionListener() {//Get estimate button
			public void actionPerformed(ActionEvent e) {
				
				panel_order_place.setVisible(false);
				if(from_pincode.getSelectedItem().equals("--select--") || to_pincode.getSelectedItem().equals("--select--")) {
					System.out.println(from_pincode.getSelectedItem());
					JOptionPane.showMessageDialog(getRootPane(), "Enter Pincodes");
				}
				else if(fromAddress.getText().equals("") || toAddress.getText().equals("")) {
					JOptionPane.showMessageDialog(getRootPane(), "Enter Address");
				}
				else if(weight.getText().equals("")) {
					JOptionPane.showMessageDialog(getRootPane(), "Enter Weigth");
				}
				else if(length.getText().equals("") || breadth.getText().equals("") || height.getText().equals("")
						) {
					JOptionPane.showMessageDialog(getRootPane(), "Enter Length,Breadth,Height and Weigth");
				}
				
				else if(ship_mode.getSelectedItem().equals("--Select Mode--")) {
					JOptionPane.showMessageDialog(getRootPane(), "Select shipment mode");
				}
				else if(ship_type.getSelectedItem().equals("--Select Type--")) {
					JOptionPane.showMessageDialog(getRootPane(), "Select shipment type");
				}
				else {
					to_pin=to_pincode.getSelectedItem().toString();
					from_pin=from_pincode.getSelectedItem().toString();
					len=Integer.parseInt(length.getText());
					bred=Integer.parseInt(breadth.getText());
					heigh=Integer.parseInt(height.getText());
					weigh=Integer.parseInt(weight.getText());
					from_add=fromAddress.getText();
					to_add=toAddress.getText();
					s_mode=ship_mode.getSelectedItem().toString();
					s_type=ship_type.getSelectedItem().toString();
					s_content=ship_content.getSelectedItem().toString();
					panel_order_place.setVisible(true);
				}
				double mode_point = 0;
				switch(s_mode) {
				    case "Air Freight": mode_point = 50.0;break;
				    case "Sea Freight": mode_point = 30.0;break;
				    case "Road Freight": mode_point = 10.0;break;
				}
				setPrice(mode_point*weigh);		
				
				basictxt=  "Basic     ----Delivery Time : 5 days ---- Amount : Rs. "+(getPrice());
				supertxt=  "Super     ----Delivery Time : 3 days ---- Amount : Rs. "+(getPrice()*2);
				premiumtxt="Premium ----Delivery Time : 1 days ---- Amount : Rs. "+(getPrice()*3);
				//System.out.println(basictxt+" "+supertxt+" "+premiumtxt);
				
				rdbtnBasic.setText(basictxt);
				rdbtnSuper.setText(supertxt);
				rdbtnPremium.setText(premiumtxt);
				
			}
		});
			
		//static JButton 
		btn_placeOrder = new JButton(" Proceed to Pay");
		btn_placeOrder.setBackground(new Color(136, 189, 188));
		
		btn_placeOrder.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_placeOrder.setBounds(308, 96, 148, 27);
		panel_order_place.add(btn_placeOrder);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 11, 588, 2);
		panel_order_place.add(separator_1);
		
		//static JButton 
		btn_bill = new JButton("Generate Bill");
		btn_bill.setBackground(new Color(136, 189, 188));
		
		btn_placeOrder.addActionListener(new ActionListener() {  //place order button
			public void actionPerformed(ActionEvent e) {
				
				
				if(!rdbtnBasic.isSelected() && !rdbtnSuper.isSelected() && !rdbtnPremium.isSelected()) {
					JOptionPane.showMessageDialog(getRootPane(), "Select Service Type");

				}
				else{
					if(rdbtnBasic.isSelected()) {ser_value=1;ser_type="Basic";ser_days=5;}
				
				     else if(rdbtnSuper.isSelected()) {ser_value=2;ser_type="Super";ser_days=3;}
				     
				     else if(rdbtnPremium.isSelected()) {ser_value=3;ser_type="Premium";ser_days=1;}
								
				//setPrice(getPrice()*ser_value);
				double price_set=getPrice()*ser_value;
				//service_type=service_rdbtn.getSelection().toString();
				//Payment pay=new Payment(getPrice());
				Payment pay=new Payment(price_set);
				pay.setVisible(true);
				pay.setLocationRelativeTo(null); 
//				btn_bill.setEnabled(true);
//				btn_placeOrder.setEnabled(false);
			
				
//				payment_mode=Payment.getPay_mode();
//				if(payment_mode.equals("cod") || payment_mode.equals("card")) {
//					btn_bill.setEnabled(true);
//					btn_placeOrder.setEnabled(false);
//				}
				
				}
				
			}
		});
		
		
		btn_bill.addActionListener(new ActionListener() { //printing bill
			public void actionPerformed(ActionEvent e) {
				
				Bill bill=new Bill(uname);
				bill.setVisible(true);
				bill.setLocationRelativeTo(null);
				payment_mode=Payment.getPay_mode();
				
				//System.out.println(payment_mode);
				
				/*System.out.print(from_add+" "+from_pin+" "+to_add+" "+to_pin);
				bill.pickAdd.setText(from_add);
				bill.pickPin.setText(String.valueOf(from_pin));
				bill.deliAdd.setText(to_add);
				bill.deliPin.setText(String.valueOf(to_pin));
				bill.mode.setText(s_mode);
				bill.type.setText(s_type);
				bill.content.setText(s_content);
				bill.service.setText(service_type);
				bill.len.setText(String.valueOf(len));
				bill.bre.setText(String.valueOf(bred));
				bill.hei.setText(String.valueOf(heigh));
				bill.wei.setText(String.valueOf(weigh)); */								
			}
		});
		btn_bill.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_bill.setBounds(462, 94, 148, 27);
		btn_bill.setEnabled(false);
		panel_order_place.add(btn_bill);
		
		JPanel trackOrderPane = new JPanel();
		trackOrderPane.setBackground(new Color(245, 245, 220));
		user_menu.addTab("New tab", null, trackOrderPane, null);
		trackOrderPane.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(" TRACK YOUR ORDERS");
		lblNewLabel_1_1_1.setBounds(198, 25, 232, 24);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		trackOrderPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_3_4 = new JLabel("Order ID : ");
		lblNewLabel_3_4.setBounds(198, 60, 73, 24);
		lblNewLabel_3_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		trackOrderPane.add(lblNewLabel_3_4);
		
		t_order_id = new JComboBox();
		t_order_id.setBounds(267, 60, 163, 20);
		t_order_id.addItem("--select order id--");
		trackOrderPane.add(t_order_id);
        try {
			
			Connection con=jdbcConnection.getCon();
			Statement st= con.createStatement();
			String query= "select * from order_details where user_name='"+uname+"';";
			
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				t_order_id.addItem(rs.getString("order_id"));
			}	
		}
		catch(Exception e1) {
			JOptionPane.showMessageDialog(getRootPane(), e1);
		}
		
		JPanel track_txt_panel = new JPanel();
		track_txt_panel.setBackground(new Color(245, 245, 220));
		track_txt_panel.setBorder(null);
		track_txt_panel.setBounds(10, 88, 620, 350);
		trackOrderPane.add(track_txt_panel);
		track_txt_panel.setLayout(null);
		track_txt_panel.setVisible(false);
		
		JLabel track_txt = new JLabel("");
		track_txt.setHorizontalAlignment(SwingConstants.CENTER);
		track_txt.setFont(new Font("Times New Roman", Font.BOLD, 12));
		track_txt.setBounds(413, 11, 197, 276);
		track_txt_panel.add(track_txt);
		
		JProgressBar track_progress = new JProgressBar();
		track_progress.setForeground(new Color(136, 189, 188));
		track_progress.setStringPainted(true);
		track_progress.setBounds(10, 298, 600, 18);
		track_txt_panel.add(track_progress);
		
		JCheckBox chck_placed = new JCheckBox("Order Placed");
		chck_placed.setOpaque(false);
		chck_placed.setBorder(null);
		chck_placed.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chck_placed.setBounds(20, 59, 126, 23);
		track_txt_panel.add(chck_placed);
		
		JCheckBox chckPicked = new JCheckBox("Picked Up");
		chckPicked.setBorder(null);
		chckPicked.setOpaque(false);
		chckPicked.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckPicked.setBounds(20, 118, 99, 23);
		track_txt_panel.add(chckPicked);
		
		JCheckBox chckTransit = new JCheckBox("In Transit");
		chckTransit.setBorder(null);
		chckTransit.setOpaque(false);
		chckTransit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckTransit.setBounds(20, 175, 99, 23);
		track_txt_panel.add(chckTransit);
		
		JCheckBox chckDelivered = new JCheckBox("Delivered");
		chckDelivered.setBorder(null);
		chckDelivered.setOpaque(false);
		chckDelivered.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckDelivered.setBounds(20, 234, 99, 23);
		track_txt_panel.add(chckDelivered);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(24, 30, 4, 250);
		track_txt_panel.add(separator_2);
		
		JLabel track_txt_details = new JLabel("");
		track_txt_details.setHorizontalAlignment(SwingConstants.CENTER);
		track_txt_details.setFont(new Font("Times New Roman", Font.BOLD, 12));
		track_txt_details.setBounds(141, 11, 273, 276);
		track_txt_panel.add(track_txt_details);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setBounds(141, 30, 4, 250);
		track_txt_panel.add(separator_2_1);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setOrientation(SwingConstants.VERTICAL);
		separator_2_2.setBounds(413, 37, 4, 250);
		track_txt_panel.add(separator_2_2);
		
		JButton btn_Track = new JButton("Track");
		btn_Track.setBackground(new Color(136, 189, 188));
		btn_Track.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t_order_id.getSelectedItem().toString().equals("--select order id--")){
					JOptionPane.showMessageDialog(getRootPane(), "Select Order ID");
				}
				else {
				track_txt_panel.setVisible(true);
				String o_id=t_order_id.getSelectedItem().toString();
				String tr_txt,curr_status;
				System.out.println(o_id);
				try {
					Connection con = jdbcConnection.getCon();
					Statement st= con.createStatement();
					String query= "select * from delivery_details where order_id="+Integer.parseInt(o_id)+";";
					ResultSet rs = st.executeQuery(query);
					System.out.println(query);
					while(rs.next())
					{
					     tr_txt="<html>Order ID  : "+o_id+"<br><br>Pick-up City     : "+rs.getString("from_city")
					     		+ " <br><br>Deliver City  : "+rs.getString("to_city")+" <br><br> Picked By   : "
					    		 +rs.getString("emp_pick")+"<br><br>"
								+ "Delivered By      : "+rs.getString("emp_deli")+" <br><br> Order Status      : "+rs.getString("status")+" </html>";
						curr_status=rs.getString("status");
						track_txt.setText(tr_txt);
						
						if(curr_status.equals("Order Placed")) {
							track_progress.setValue(25);
							track_progress.setString(curr_status);
							chck_placed.setSelected(true);
							chckPicked.setSelected(false);
							chckTransit.setSelected(false);
							chckDelivered.setSelected(false);
							
						}
						else if(curr_status.equals("In Transit")) {
							track_progress.setValue(50);
							track_progress.setString(curr_status);
							chck_placed.setSelected(true);
							chckPicked.setSelected(true);
							chckTransit.setSelected(true);
							chckDelivered.setSelected(false);
							
						}
						else if(curr_status.equals("Delivered")) {
							track_progress.setValue(100);
							track_progress.setString(curr_status+" !!");
							chck_placed.setSelected(true);
							chckPicked.setSelected(true);
							chckTransit.setSelected(true);
							chckDelivered.setSelected(true);
						}
						
					}
					tr_txt="";
					rs=st.executeQuery("select * from order_details where order_id='"+Integer.parseInt(o_id)+"';");
					while(rs.next()) {
						tr_txt="<html><b><center>ORDER DETAILS : </center></b><br>Pickup Address : "+rs.getString("from_address")
					+"<br><br>Delivery Address : "+rs.getString("to_address")
								+"<br><br>Shipment Mode : "+rs.getString("ship_mode")
					+"<br><br>Shipment type : "+rs.getString("ship_type")
								+"<br><br>Shipment Content : "+rs.getString("ship_content")
					+"<br><br>Weight :  "+rs.getString("weight")
								+"<br><br>Service Type : "+rs.getString("service_type")
					+"<br><br>Payment Mode : "+rs.getString("pay_mode")+"</html>";
					}
					track_txt_details.setText(tr_txt);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}}
		});
		btn_Track.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btn_Track.setBounds(440, 59, 78, 23);
		trackOrderPane.add(btn_Track);
      
		
		String u_profile="";
		JPanel viewProfilePane = new JPanel();
		viewProfilePane.setBackground(new Color(245, 245, 220));
		user_menu.addTab("New tab", null, viewProfilePane, null);
		viewProfilePane.setLayout(null);
		
		
		JLabel txt_uProfile = new JLabel();
		txt_uProfile.setVerticalAlignment(SwingConstants.TOP);
		txt_uProfile.setHorizontalAlignment(SwingConstants.CENTER);
		txt_uProfile.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txt_uProfile.setBounds(138, 42, 345, 205);
		viewProfilePane.add(txt_uProfile);
		/////get user profile from db
		
		Connection con;
		try {
			con = jdbcConnection.getCon();
			Statement st= con.createStatement();
			String query= "select * from user_details where uname='"+uname+"'";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
			     u_profile="<html><b>User Name      :    </b>  </t>"+rs.getString("uname")+
			    		     "<br><br><b>User ID        :	 </b>  "+rs.getInt("u_id")
			     		+    "<br><br><b>First Name     : 	</b>  "+rs.getString("fname")+
			     		    "<b><br> <br>Last name      : 	</b>  " +rs.getString("lname")+"<br><br>"
						+       "<b>Mobile Number   : 	</b>  "+rs.getString("mobile")+
						  " <br><br> <b>Mail id         :	 </b>  "+rs.getString("mailid")+" </html>";
				
			}
			txt_uProfile.setText(u_profile);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}	
		
				
		JLabel lblNewLabel_1_1 = new JLabel("USER PROFILE - "+uname);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(150, 11, 408, 24);
		viewProfilePane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("Update Profile");
		
		btnNewButton_1.setBackground(new Color(136, 189, 188));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1.setBounds(239, 258, 132, 23);
		viewProfilePane.add(btnNewButton_1);
		
		JPanel user_update_panel = new JPanel();
		user_update_panel.setBackground(new Color(245, 245, 220));
		user_update_panel.setBounds(10, 292, 620, 156);
		viewProfilePane.add(user_update_panel);
		user_update_panel.setVisible(false);
		user_update_panel.setLayout(null);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("First Name : ");
		lblNewLabel_3_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_1.setBounds(332, 11, 80, 24);
		user_update_panel.add(lblNewLabel_3_4_1);
		
		update_ufname = new JTextField();
		update_ufname.setColumns(10);
		update_ufname.setBackground(new Color(245, 245, 220));
		update_ufname.setBounds(422, 14, 151, 20);
		user_update_panel.add(update_ufname);
		
		JLabel lblNewLabel_3_4_1_1 = new JLabel("Last Name : ");
		lblNewLabel_3_4_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_1_1.setBounds(332, 46, 80, 24);
		user_update_panel.add(lblNewLabel_3_4_1_1);
		
		update_ulname = new JTextField();
		update_ulname.setColumns(10);
		update_ulname.setBackground(Color.WHITE);
		update_ulname.setBounds(422, 49, 151, 20);
		user_update_panel.add(update_ulname);
		
		JLabel lblNewLabel_3_4_6 = new JLabel("Mobile : ");
		lblNewLabel_3_4_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_6.setBounds(357, 81, 73, 24);
		user_update_panel.add(lblNewLabel_3_4_6);
		
		update_umobile = new JTextField();
		update_umobile.setColumns(10);
		update_umobile.setBackground(Color.WHITE);
		update_umobile.setBounds(422, 84, 151, 20);
		user_update_panel.add(update_umobile);
		
		JLabel lblNewLabel_3_4_1_2 = new JLabel("User ID : ");
		lblNewLabel_3_4_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_1_2.setBounds(49, 11, 60, 24);
		user_update_panel.add(lblNewLabel_3_4_1_2);
		
		update_uid = new JTextField();
		update_uid.setEditable(false);
		update_uid.setColumns(10);
		update_uid.setBackground(new Color(245, 245, 220));
		update_uid.setBounds(113, 15, 142, 20);
		user_update_panel.add(update_uid);
		
		JLabel lblNewLabel_3_4_1_1_1 = new JLabel("Username : ");
		lblNewLabel_3_4_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_1_1_1.setBounds(35, 46, 80, 24);
		user_update_panel.add(lblNewLabel_3_4_1_1_1);
		
		update_uname = new JTextField();
		update_uname.setEditable(false);
		update_uname.setColumns(10);
		update_uname.setBackground(new Color(245, 245, 220));
		update_uname.setBounds(113, 50, 142, 20);
		user_update_panel.add(update_uname);
		
		JLabel lblNewLabel_3_4_6_2 = new JLabel("Mail id : ");
		lblNewLabel_3_4_6_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4_6_2.setBounds(60, 81, 73, 24);
		user_update_panel.add(lblNewLabel_3_4_6_2);
		
		update_umail = new JTextField();
		update_umail.setColumns(10);
		update_umail.setBackground(Color.WHITE);
		update_umail.setBounds(113, 85, 142, 20);
		user_update_panel.add(update_umail);
		
		JButton btnNewButton_1_1 = new JButton("Update");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Are you sure to update profile");
			      switch (result) {
			         case JOptionPane.YES_OPTION:{
			        	 try {
								Connection con = jdbcConnection.getCon();
								Statement st= con.createStatement();
								String query= "update user_details set fname='"+update_ufname.getText()+"', lname='"+update_ulname.getText()+
										"' , mobile= '"+update_umobile.getText()+"' ,mailid = '"+update_umail.getText()+"' where u_id='"+update_uid.getText()+"';";
								st.executeUpdate(query);
								JOptionPane.showMessageDialog(getRootPane(), "User Details Updated!!");
								user_update_panel.setVisible(false);
								
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
			         
			         break;
			         } 
			      }
			      Connection con;
					try {
						con = jdbcConnection.getCon();
						Statement st= con.createStatement();
						String query= "select * from user_details where uname='"+uname+"'";
						ResultSet rs = st.executeQuery(query);
						String u_profile="";
						while(rs.next())
						{
						     u_profile="<html><b>User Name      :    </b>  </t>"+rs.getString("uname")+
						    		     "<br><br><b>User ID        :	 </b>  "+rs.getInt("u_id")
						     		+    "<br><br><b>First Name     : 	</b>  "+rs.getString("fname")+
						     		    "<b><br> <br>Last name      : 	</b>  " +rs.getString("lname")+"<br><br>"
									+       "<b>Mobile Number   : 	</b>  "+rs.getString("mobile")+
									  " <br><br> <b>Mail id         :	 </b>  "+rs.getString("mailid")+" </html>";
							
						}
						txt_uProfile.setText(u_profile);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1_1.setBackground(new Color(136, 189, 188));
		btnNewButton_1_1.setBounds(241, 116, 132, 23);
		user_update_panel.add(btnNewButton_1_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user_update_panel.setVisible(true);
				try {
					Connection con = jdbcConnection.getCon();
					Statement st= con.createStatement();
					String query= "select * from user_details where uname='"+uname+"'";
					ResultSet rs = st.executeQuery(query);
					
					while(rs.next())
					{
						update_uid.setText(rs.getString("u_id"));
						update_uname.setText(rs.getString("uname"));
						update_ufname.setText(rs.getString("fname"));
						update_ulname.setText(rs.getString("lname"));
						update_umobile.setText(rs.getString("mobile"));
						update_umail.setText(rs.getString("mailid"));
						
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}	
			}
		});
		
	}
}
