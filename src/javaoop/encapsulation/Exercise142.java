package javaoop.encapsulation;

/*
Exercise 142:
Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
Provide public getter and setter methods to access and modify these variables.

Expected Output:
Account Number: SB-09876
Balance: 2000.0
*/

// BankAccount.java
// BankAccount Class
class BankAccount {
    // Private instance variables for account number and balance
    private String accountNumber;
    private double balance;

    // Constructor to initialize account number and balance
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter method for account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Main.java
// Main Class
public class Exercise142 {
    public static void main(String[] args) {
        // Create an instance of BankAccount with initial values
        BankAccount account = new BankAccount("SB-09876", 2000.0);

        // Display initial account details
        account.displayAccountDetails();

        // Modify the account details using setter methods
        account.setAccountNumber("SB-12345");
        account.setBalance(5000.0);

        System.out.println("\nAfter updating account details:");

        // Display updated account details
        account.displayAccountDetails();
    }
}

