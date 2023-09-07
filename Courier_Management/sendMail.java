package Courier_Management;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import Ships_Ports.Main;
public class sendMail
{


    // outgoing message information
    String mailTo = "iswaryaganesh17@gmail.com";
    String subject = "Shipping Details";
    String message = "Your order has been shipped";

	public void sendPlainTextEmail(String host, String port,
            final String userName, final String password, String toAddress,
            String subject, String message) throws AddressException,
            MessagingException {

        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.user", userName);

        // creates a new session, no Authenticator (will connect() later)
        Session session = Session.getDefaultInstance(properties);


        // creates a new e-mail message
        Message msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
        // set plain text message
        msg.setText(message);

        Transport t = session.getTransport("smtp");
        t.connect(userName, password);
        t.sendMessage(msg, msg.getAllRecipients());
        t.close();

    }	
	//public static void main(String[] args) {
	public sendMail(String mailTo,String subject,String message) {
        // SMTP server information
        String host = "smtp.gmail.com";
        String port = "587";
        
        String mailFrom="courierexpress178@gmail.com";
        String password="mmnwrjgwauwyqejg";
       

        //sendMail mailer = new sendMail();

        try {
            sendPlainTextEmail(host, port, mailFrom, password, mailTo,
                    subject, message);
            System.out.println("Email sent.");
        } catch (Exception ex) {
            System.out.println("Failed to sent email.");
            ex.printStackTrace();
        }
      
    }
//	public static void main(String[] args) {
//		sendMail m=new sendMail("srijag0602@gmail.com","Hi","Hello");
//	}

}


//String mailFrom = "ecommerce.shippingjava2023@gmail.com";
//String password = "fdhbefwvqukowyri";
//String mailFrom="visaa9234@gmail.com";
//String password="eqopazaiqutmgtvc";
//String mailFrom = "l6129049@gmail.com";
//String password="lqhvczpffaaojwnb";
