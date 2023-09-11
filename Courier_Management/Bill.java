package Courier_Management;

import java.awt.EventQueue;
import java.text.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bill extends User  {

	private JPanel contentPane;
	JTextField mode;
	JTextField type;
	JTextField content;
	JTextField service;
	JTextField pickPin;
	JTextField deliPin;
	JTextField wei;
	JTextField leng;
	JTextField bre;
	JTextField hei;
	JTextArea pickAdd;
	JTextArea deliAdd;
	private JTextField paidAmt;
	private JTextField est_delivery;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill frame = new Bill("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 * @param uname 
	 */
	
	public Bill(String uname) {
		
		super(uname);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//estimated date
		DateFormat dform = new SimpleDateFormat("dd-MM-yyyy");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		//Date curr_date=new Date();
		//Date deli_date=new Date();
		//deli_date.plusDays(1);
		
		LocalDate curr_date =  LocalDate.now();
        LocalDate deli_date = curr_date.plusDays(ser_days);
        //System.out.println(curr_date+" "+deli_date);
	    //System.out.println(formatter.format(curr_date));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(136, 189, 188));
		panel.setBounds(10, 11, 816, 88);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("XPRESS COURIERS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(289, 0, 283, 39);
		panel.add(lblNewLabel);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBounds(0, 99, 836, 403);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Pick-up City : ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(477, 47, 120, 24);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("Pick-up Address:");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(66, 47, 120, 24);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Delivery City : ");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(503, 99, 120, 24);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Delivery Address:");
		lblNewLabel_3_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2_1.setBounds(66, 99, 120, 24);
		panel_1.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Shipment mode :");
		lblNewLabel_3_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2_2.setBounds(66, 155, 120, 24);
		panel_1.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Weight (in kgs) :");
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(503, 155, 120, 24);
		panel_1.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_2_2_1 = new JLabel("Shipment type :");
		lblNewLabel_3_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2_2_1.setBounds(66, 185, 120, 24);
		panel_1.add(lblNewLabel_3_2_2_1);
		
		JLabel lblNewLabel_3_2_2_1_1 = new JLabel("Content : ");
		lblNewLabel_3_2_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2_2_1_1.setBounds(66, 211, 118, 24);
		panel_1.add(lblNewLabel_3_2_2_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("BILL - ORDER SUMMARY");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(259, 11, 266, 24);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Length(in cms) :");
		lblNewLabel_3_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_3_1.setBounds(503, 185, 120, 24);
		panel_1.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("Breadth(in cms) :");
		lblNewLabel_3_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_3_2.setBounds(503, 211, 113, 24);
		panel_1.add(lblNewLabel_3_3_2);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("Height(in cms) :");
		lblNewLabel_3_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_3_3.setBounds(503, 240, 120, 24);
		panel_1.add(lblNewLabel_3_3_3);
		
		JLabel lblNewLabel_3_2_2_1_2 = new JLabel("Service Type :");
		lblNewLabel_3_2_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2_2_1_2.setBounds(66, 240, 112, 24);
		panel_1.add(lblNewLabel_3_2_2_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(185, 48, 187, 44);
		panel_1.add(scrollPane);
		
		JTextArea pickAdd_1 = new JTextArea();
		pickAdd_1.setBorder(null);
		scrollPane.setViewportView(pickAdd_1);
		pickAdd_1.setEditable(false);
		pickAdd_1.setText("hi hello");
		pickAdd_1.setLineWrap(true);
		
		pickAdd_1.setText(from_add);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(185, 100, 187, 44);
		panel_1.add(scrollPane_1);
		
		JTextArea deliAdd_1 = new JTextArea();
		deliAdd_1.setBorder(null);
		scrollPane_1.setViewportView(deliAdd_1);
		deliAdd_1.setEditable(false);
		deliAdd_1.setLineWrap(true);
		deliAdd_1.setText(to_add);
		
		mode = new JTextField();
		mode.setBorder(null);
		mode.setBackground(new Color(255, 255, 255));
		mode.setEditable(false);
		mode.setForeground(new Color(0, 0, 0));
		mode.setBounds(185, 158, 187, 20);
		panel_1.add(mode);
		mode.setColumns(10);
		
		type = new JTextField();
		type.setBorder(null);
		type.setBackground(new Color(255, 255, 255));
		type.setEditable(false);
		type.setColumns(10);
		type.setBounds(185, 188, 187, 20);
		panel_1.add(type);
		
		content = new JTextField();
		content.setBorder(null);
		content.setBackground(new Color(255, 255, 255));
		content.setEditable(false);
		content.setColumns(10);
		content.setBounds(185, 214, 187, 20);
		panel_1.add(content);
		
		service = new JTextField();
		service.setBorder(null);
		service.setBackground(new Color(255, 255, 255));
		service.setEditable(false);
		service.setColumns(10);
		service.setBounds(185, 243, 187, 20);
		panel_1.add(service);
		
		pickPin = new JTextField();
		pickPin.setBackground(new Color(255, 255, 255));
		pickPin.setEditable(false);
		pickPin.setBorder(null);
		pickPin.setColumns(10);
		pickPin.setBounds(619, 50, 187, 20);
		panel_1.add(pickPin);
		
		deliPin = new JTextField();
		deliPin.setBorder(null);
		deliPin.setBackground(new Color(255, 255, 255));
		deliPin.setEditable(false);
		deliPin.setColumns(10);
		deliPin.setBounds(619, 102, 187, 20);
		panel_1.add(deliPin);
		
		wei = new JTextField();
		wei.setBorder(null);
		wei.setBackground(new Color(255, 255, 255));
		wei.setEditable(false);
		wei.setColumns(10);
		wei.setBounds(619, 158, 187, 20);
		panel_1.add(wei);
		
		leng = new JTextField();
		leng.setBorder(null);
		leng.setBackground(new Color(255, 255, 255));
		leng.setEditable(false);
		leng.setColumns(10);
		leng.setBounds(619, 188, 187, 20);
		panel_1.add(leng);
		
		bre = new JTextField();
		bre.setBorder(null);
		bre.setBackground(new Color(255, 255, 255));
		bre.setEditable(false);
		bre.setColumns(10);
		bre.setBounds(619, 214, 187, 20);
		panel_1.add(bre);
		
		hei = new JTextField();
		hei.setBorder(null);
		hei.setBackground(new Color(255, 255, 255));
		hei.setEditable(false);
		hei.setColumns(10);
		hei.setBounds(619, 243, 187, 20);
		panel_1.add(hei);
				
		paidAmt = new JTextField();
		paidAmt.setBorder(null);
		paidAmt.setBackground(new Color(255, 255, 255));
		paidAmt.setEditable(false);
		paidAmt.setText((String) null);
		paidAmt.setForeground(new Color(0, 0, 0));
		paidAmt.setColumns(10);
		paidAmt.setBounds(185, 289, 187, 20);
		panel_1.add(paidAmt);
		
		JLabel lblNewLabel_3_2_2_2 = new JLabel("Amount Paid :");
		if(Payment.getPay_mode().equals("cod")) {
			lblNewLabel_3_2_2_2.setText("Amount to be paid :");
		}
		lblNewLabel_3_2_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2_2_2.setBounds(41, 286, 145, 24);
		panel_1.add(lblNewLabel_3_2_2_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(50, 275, 756, 3);
		panel_1.add(separator);
		
		est_delivery = new JTextField();
		est_delivery.setBorder(null);
		est_delivery.setBackground(new Color(255, 255, 255));
		est_delivery.setEditable(false);
		est_delivery.setText((String) null);
		est_delivery.setForeground(new Color(0, 0, 0));
		est_delivery.setColumns(10);
		est_delivery.setBounds(619, 288, 187, 20);
		panel_1.add(est_delivery);
		
		JLabel lblNewLabel_3_2_2_3 = new JLabel("Estimated Arrival :");
		lblNewLabel_3_2_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2_2_3.setBounds(500, 285, 120, 24);
		panel_1.add(lblNewLabel_3_2_2_3);
		
		JLabel lblNewLabel_2 = new JLabel("-------------------------Thank You !! -----------------------------");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(259, 362, 385, 14);
		panel_1.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_2_1 = new JLabel("ORDER PLACED...!!");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(358, 337, 158, 14);
		panel_1.add(lblNewLabel_2_1);
		
		try {
			
			Connection con=jdbcConnection.getCon();
			Statement st= con.createStatement();
			String query= "insert into order_details ( user_name,from_city,to_city,from_address,to_address,ship_mode ,ship_type,ship_content,"
					+ "weight,length,breadth,height,service_type,pay_mode,status,ordered_date ,estimated_delivery) values ("
					+"'"+uname+"',"
					+"'"+from_pin+"',"
					+"'"+to_pin+"',"
					+"'"+from_add+"',"
					+"'"+to_add+"',"
					+"'"+s_mode+"',"
					+"'"+s_type+"',"
					+"'"+s_content+"',"
					+"'"+weigh+"',"
					+"'"+len+"',"
					+"'"+bred+"',"
					+"'"+heigh+"',"
					+"'"+ser_type+"',"
					+"'"+Payment.getPay_mode()+"',"
					+"'"+"Order Placed"+"',"
					+"'"+String.valueOf(curr_date)+"',"
					+"'"+String.valueOf(deli_date)+"'"
					+ ")";
			st.executeUpdate(query);
			System.out.println(query);
			
			

		System.out.println(query);	
		System.out.println("order details added");
		}
		catch(Exception e1) {
			JOptionPane.showMessageDialog(getRootPane(), e1);
		}
		int order_id=9000;
		try
        {
            Connection con = jdbcConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from order_details ORDER BY order_id DESC LIMIT 1");
            while(rs.next())
            {
            	order_id=rs.getInt("order_id");
            }
            //adding to delivery details table;
			st.executeUpdate("insert into delivery_details (order_id,u_name,from_city,to_city,status) values "
					+ "('"+order_id+"','"+uname+"','"+from_pin+"','"+to_pin+"','Order Placed')");
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null, e1);
        }
		
		String orderMailtxt="Hi "+uname+"\nPlease find your order details\nOrder ID :"+order_id
				+"\nOrder Date      : "+curr_date
				+"\nPick-Up City    : "+from_pin
				+"\nPick-Up Address : "+from_add
				+"\nDelivery City   : "+to_pin
				+"\nDelivery Address: "+to_add
				+"\nShipment Mode   : "+s_mode
				+"\nShipment Type   : "+s_type
				+"\nShipment Content: "+s_content
				+"\nWeight : "+weigh+"\tLength : "+len+"\tBreadth : "+bred+"\tHeight : "+heigh
				+"\nService type opted: "+ser_type
				;
		if(Payment.getPay_mode().equals("cod")) {orderMailtxt+="\nAmount to be Paid : ";}
		else if(Payment.getPay_mode().equals("card")) {orderMailtxt+="\nAmount Paid(thr card) : ";}
		orderMailtxt+=""+price+"\nEstimated Delivery : "+deli_date+"\n----Use Order ID to track your order----"
				+ "\n\nThank you... Your Order is Taken!!";
		
		//sendmail(orderMailtxt,uname);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME : "+uname+"                                    ORDER ID :"+order_id+"                                         ORDER DATE:29/08/2023");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(23, 46, 803, 31);
		panel.add(lblNewLabel_1);
		
		pickPin.setText(String.valueOf(from_pin));
		deliPin.setText(String.valueOf(to_pin));
		pickAdd_1.setText(from_add);
		deliAdd_1.setText(to_add);
		mode.setText(s_mode);
		type.setText(s_type);
		content.setText(s_content);
		service.setText(ser_type);
		leng.setText(String.valueOf(len));
		bre.setText(String.valueOf(bred));
		hei.setText(String.valueOf(heigh));
		wei.setText(String.valueOf(weigh));
		paidAmt.setText(String.valueOf(price));
		est_delivery.setText(formatter.format(deli_date));
		
		JButton btnGoToUserMenu = new JButton("Go to User menu");
		btnGoToUserMenu.setBackground(new Color(136, 189, 188));
		btnGoToUserMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User user=new User(uname);
				user.setVisible(true);
				user.setLocationRelativeTo(null);
			}
		});
		btnGoToUserMenu.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnGoToUserMenu.setBounds(674, 359, 132, 23);
		panel_1.add(btnGoToUserMenu);
		
			
     String mail_id="";
		
		try
        {
            Connection con = jdbcConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from user_details where uname = '"+uname+"'");
            while(rs.next())
            {
            	mail_id=rs.getString("mailid");
            }
            sendMail orderMail = new sendMail(mail_id,"Order Details",orderMailtxt);
            JOptionPane.showMessageDialog(null, "Order Summary has been sent to your registered mail");
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null, e1);
        }
	
}	
}
