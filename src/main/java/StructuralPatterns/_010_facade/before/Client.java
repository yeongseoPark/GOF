package StructuralPatterns._010_facade.before;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Client {
    public static void main(String[] args) {
        /* 이메일 라이브러리에 대한 높은 의존성 */

        String to = "1park4170@gmail.com";
        String from = "fake@gmail.com";
        String host = "127.0.0.1";

        Properties properties = System.getProperties();
        properties.setProperty("mali.smtp.host", host); // 서버와 포트 , 의존성

        Session session = Session.getDefaultInstance(properties); // 자바 메일 세션, 의존성

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipients(Message.RecipientType.TO, String.valueOf(new InternetAddress(to)));
            message.setSubject("Test mail from java");
            message.setText("message");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
