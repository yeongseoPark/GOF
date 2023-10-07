package StructuralPatterns._07_bridge._01_java;

import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.transaction.PlatformTransactionManager;

public class BridgeInSpring {
    public static void main(String[] args) {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

        PlatformTransactionManager platformTransactionManager = new JdbcTransactionManager();
        // PlatformTransactionManager의 구현체중 하나인 JdbcTransactionManager
    }
}
