package javaoop.oop_exercises;

// Exercise164.java

// Import the ArrayList class from the Java Collections Framework
import java.util.ArrayList;

// Define the Account class
class Account {
    // Declare private variables for name, account number, and balance
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor to initialize Account attributes
    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for account holder's name
    public String getName() {
        return name;
    }

    // Setter for account holder's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
        }
    }

    // Method to return account details as a formatted string
    public String getAccountInfo() {
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
    }
}

// Define the Bank class
class Bank {
    // Declare a list to store accounts
    private ArrayList<Account> accounts;

    // Constructor to initialize the accounts list
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Method to add an account to the bank
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to remove an account from the bank
    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    // Method to deposit money to an account
    public void depositMoney(Account account, double amount) {
        account.deposit(amount);
    }

    // Method to withdraw money from an account
    public void withdrawMoney(Account account, double amount) {
        account.withdraw(amount);
    }

    // Method to retrieve all accounts in the bank
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}

// Define the Exercise164 class
public class Exercise164 {
    public static void main(String[] args) {
        // Create a new bank
        Bank bank = new Bank();

        // Create three accounts
        Account account1 = new Account("Peter Irmgard", "C0011", 5000);
        Account account2 = new Account("Katja Ruedi", "C0121", 4500);
        Account account3 = new Account("Marcella Gebhard", "C0222", 20000);

        // Add accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        // Display all accounts
        for (Account account : bank.getAccounts()) {
            System.out.println(account.getAccountInfo());
        }

        // Deposit money to account1
        System.out.println("\nAfter depositing 1000 into account1:");
        bank.depositMoney(account1, 1000);
        System.out.println(account1.getAccountInfo());

        // Display account2 details (no transaction)
        System.out.println("No transaction in account2:");
        System.out.println(account2.getAccountInfo());

        // Withdraw money from account3
        System.out.println("After withdrawing 5000 from account3:");
        bank.withdrawMoney(account3, 5000);
        System.out.println(account3.getAccountInfo());
    }
}

