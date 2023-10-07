package StructuralPatterns._06_adapter._02_after;

import StructuralPatterns._06_adapter._02_after.security.UserDetails;

/* Adapter 2 */
public class AccountUserDetails implements UserDetails {
    private Account account; // adaptee

    public AccountUserDetails(Account account) {
        this.account = account;
    }


    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
