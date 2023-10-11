package StructuralPatterns._010_facade.after;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {
    private EmailSettings emailSettings;

    public EmailSender(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }

    public void sendEmail(EmailMessage emailMessage) {
        // 의존성 모아놓음(장점이자 단점)

        Properties properties = System.getProperties();
        properties.setProperty("mali.smtp.host", emailSettings.getHost());

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailMessage.getFrom()));
            message.addRecipients(Message.RecipientType.TO, String.valueOf(new InternetAddress(emailMessage.getTo())));
            message.setSubject(emailMessage.getSubject());
            message.setText(emailMessage.getText());

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
