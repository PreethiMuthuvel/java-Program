package com.test.bankingsystem;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountId(), account);
    }

    public Account(int accountId) {
        return accounts.get(accountId);
    }
  
    public void displayAllAccounts() {
        System.out.println("All Accounts:");
        for (Account account : accounts.values()) {
            System.out.println("Account ID: " + account.getAccountId() + ", Holder: " + account.getAccountHolder() + ", Balance: $" + account.getBalance());
        }
    }
}
