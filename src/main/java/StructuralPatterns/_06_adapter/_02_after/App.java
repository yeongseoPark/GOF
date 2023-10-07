package StructuralPatterns._06_adapter._02_after;

import StructuralPatterns._06_adapter._02_after.security.LoginHandler;
import StructuralPatterns._06_adapter._02_after.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("yeongseo", "yeongseo");
        System.out.println(login);
    }
}
