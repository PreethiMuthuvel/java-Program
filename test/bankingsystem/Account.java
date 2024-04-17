package com.test.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountId;
    private String accountHolder;
    private double balance;
    private List<Transaction> transactions;

    public Account(int accountId, String accountHolder, double balance) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount));
        } else {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        }
    }

    public void displayTransactions() {
        System.out.println("Transaction History for Account ID " + accountId + ":");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
