package com.test.bankingsystem;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        // Adding initial accounts to the bank
        bank.addAccount(new Account(1, "John Doe", 1000.0));
        bank.addAccount(new Account(2, "Jane Smith", 500.0));

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display All Accounts");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Transactions");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bank.displayAllAccounts();
                    break;
                case 2:
                    performTransaction(scanner, bank, "Deposit");
                    break;
                case 3:
                    performTransaction(scanner, bank, "Withdraw");
                    break;
                case 4:
                    System.out.print("Enter account ID: ");
                    int accountId = scanner.nextInt();
                    Account account = bank.getAccount(accountId);
                    if (account != null) {
                        account.displayTransactions();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void performTransaction(Scanner scanner, Bank bank, String transactionType) {
        System.out.print("Enter account ID: ");
        int accountId = scanner.nextInt();
        Account account = bank.getAccount(accountId);
        if (account != null) {
            System.out.print("Enter amount to " + transactionType.toLowerCase() + ": $");
            double amount = scanner.nextDouble();
            if (transactionType.equals("Deposit")) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
            System.out.println(transactionType + " successful.");
        } else {
            System.out.println("Account not found.");
        }
    }
}
