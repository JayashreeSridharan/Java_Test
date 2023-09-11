package Courier_Management;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.ItemSelectable;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Payment extends JFrame {

	private JPanel contentPane;
	private JTextField card_no;
	private JTextField cvv;
	
	private static String pay_mode;
	public static String getPay_mode() {
		return pay_mode;
	}
	public static void setPay_mode(String pay_mode) {
		Payment.pay_mode = pay_mode;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment(10.0);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});}
	/**
	 * Create the frame.
	 * @param price 
	 */
	public Payment(double price) {
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Payment mode");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(128, 32, 156, 22);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtn_cod = new JRadioButton("Cash on Delivery");
		rdbtn_cod.setBackground(new Color(245, 245, 220));
		rdbtn_cod.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtn_cod.setBounds(124, 55, 187, 23);
		contentPane.add(rdbtn_cod);
		
		JRadioButton rdbtn_card = new JRadioButton("Debit Card/Credit Card");
		rdbtn_card.setBackground(new Color(245, 245, 220));
		rdbtn_card.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtn_card.setBounds(124, 81, 187, 23);
		contentPane.add(rdbtn_card);
		
		ButtonGroup rdbtn_payment=new ButtonGroup();
		rdbtn_payment.add(rdbtn_card);
		rdbtn_payment.add(rdbtn_cod);
		
		JButton btnNewButton = new JButton("PAY");
		btnNewButton.setBackground(new Color(136, 189, 188));
		
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(166, 111, 89, 23);
		contentPane.add(btnNewButton);
		
		JPanel cardPayment = new JPanel();
		cardPayment.setBackground(new Color(245, 245, 220));
		cardPayment.setBounds(23, 138, 403, 125);
		cardPayment.setVisible(false);
		contentPane.add(cardPayment);
		cardPayment.setLayout(null);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtn_cod.isSelected()) {
					setPay_mode("cod");
					cardPayment.setVisible(false);
					JOptionPane.showMessageDialog(getRootPane(), "Pay On Getting the parcel");
					User.btn_bill.setEnabled(true);
					User.btn_placeOrder.setEnabled(false);
					User.setPrice(price);
					//dispose();
					setVisible(false);
				}
				else if(rdbtn_card.isSelected()) {
					setPay_mode("card");
					cardPayment.setVisible(true);	
				}
				else {
					JOptionPane.showMessageDialog(getRootPane(), "Select a Payment mode");
				}
			}
		});
		
		JLabel lblEnterCardDetails = new JLabel("Enter Card Details");
		lblEnterCardDetails.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEnterCardDetails.setBounds(117, 11, 156, 22);
		cardPayment.add(lblEnterCardDetails);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(5, 5, 383, 2);
		cardPayment.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Card Number : ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(50, 40, 104, 14);
		cardPayment.add(lblNewLabel_1);
		
		card_no = new JTextField();
		card_no.setBounds(159, 38, 156, 20);
		cardPayment.add(card_no);
		card_no.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("CVV :");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(101, 67, 48, 14);
		cardPayment.add(lblNewLabel_1_1);
		
		cvv = new JTextField();
		cvv.setColumns(10);
		cvv.setBounds(159, 65, 156, 20);
		cardPayment.add(cvv);
		
		JButton btnNewButton_1 = new JButton("PAY");
		btnNewButton_1.setBackground(new Color(136, 189, 188));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String card_Pattern = "^[0-9]*$";
				if(card_no.getText().equals("") || cvv.getText().equals("") || 
						!card_no.getText().matches(card_Pattern) || !cvv.getText().matches(card_Pattern))
				{
					JOptionPane.showMessageDialog(getRootPane(), "Enter Account number & CVV");
				}
				else if(!card_no.getText().matches(card_Pattern) || !cvv.getText().matches(card_Pattern)
						|| card_no.getText().length()!=16 || cvv.getText().length()!=3) {
					JOptionPane.showMessageDialog(getRootPane(), "Invalid Account number & CVV");
				}
				else {
					
					JOptionPane.showMessageDialog(getRootPane(), "Payment Successful");
					cardPayment.setVisible(false);
					setVisible(false);
					User.btn_bill.setEnabled(true);
					User.btn_placeOrder.setEnabled(false);
					User.setPrice(price);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBounds(159, 91, 89, 23);
		cardPayment.add(btnNewButton_1);
		
		String payTxt="AMOUNT TO BE PAID : "+price;
		JLabel lblAmountToBe = new JLabel(payTxt);
		lblAmountToBe.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAmountToBe.setBounds(95, 11, 231, 22);
		contentPane.add(lblAmountToBe);		
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setBackground(new Color(136, 189, 188));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_2.setBounds(336, 12, 73, 23);
		contentPane.add(btnNewButton_2);
	}
}
