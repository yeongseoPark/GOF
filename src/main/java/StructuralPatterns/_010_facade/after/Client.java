package StructuralPatterns._010_facade.after;

public class Client {
    /* Facade Pattern : 클라이언트가 사용해야하는 복잡한 sub-system dependency를 간단한 Interface로 추상화 */
    // 물론 의존성을 가진 로직이 없어지진 않고 뒤로 가려질 뿐..
    public static void main(String[] args) {

        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("kee");
        emailMessage.setTo("white");
        emailMessage.setSubject("제목은");
        emailMessage.setText("안녕");
        emailSender.sendEmail(emailMessage);
    }


}
