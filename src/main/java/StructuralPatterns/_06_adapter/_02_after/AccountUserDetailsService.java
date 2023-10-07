package StructuralPatterns._06_adapter._02_after;

import StructuralPatterns._06_adapter._02_after.security.UserDetails;
import StructuralPatterns._06_adapter._02_after.security.UserDetailsService;

/* Adapter 1 */
public class AccountUserDetailsService implements UserDetailsService {
    AccountService accountService; // adaptee

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account acountByUsername = accountService.findAcountByUsername(username);
        return new AccountUserDetails(acountByUsername);
    }
}
