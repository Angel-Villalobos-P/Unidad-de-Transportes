
package funciones;
/**
 *
 * @author M Fer
 */

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class EnviarCorreo {
    private static String Username="ferlanza14@gmail.com";
    private static String Password="";
    String Mensage;
    String To;
    String Subject;

    public EnviarCorreo(String Mensage, String To, String Subject) {
        this.Mensage = Mensage;
        this.To = To;
        this.Subject = Subject;
       
    }
  

 public void SendMail() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(Username, Password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(To));
            message.setSubject(Subject);
            message.setText(Mensage);

            Transport.send(message);
            

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
   
}
 

