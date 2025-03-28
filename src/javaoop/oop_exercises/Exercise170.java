package javaoop.oop_exercises;

/*
Exercise 170:
Write a Java program to create a class called "BankAccount" with attributes for account number, account holder's name, and balance. Include methods for depositing and withdrawing money, as well as checking the balance. Create a subclass called "SavingsAccount" that adds an interest rate attribute and a method to apply interest.
*/

// Exercise170.java

// Define the BankAccount class
class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize BankAccount object
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to check the account balance
    public double checkBalance() {
        return balance;
    }

    // Getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method for account holder's name
    public String getAccountHolderName() {
        return accountHolderName;
    }
}

// Define the SavingsAccount subclass that extends BankAccount
class SavingsAccount extends BankAccount {

    private double interestRate;

    // Constructor to initialize SavingsAccount object
    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    // Method to apply interest to the balance
    public void applyInterest() {
        double interest = checkBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest applied: " + interest + ". New balance: " + checkBalance());
    }

    // Getter method for interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Setter method for interest rate
    public void setInterestRate(double interestRate) {
        if (interestRate > 0) {
            this.interestRate = interestRate;
        } else {
            System.out.println("Interest rate must be positive.");
        }
    }
}

// Define the Main class
public class Exercise170 {

    public static void main(String[] args) {

        // Create a BankAccount object
        BankAccount account = new BankAccount("123456789", "Henri Lionel", 1000.0);
        System.out.println("Current balance: " + account.checkBalance());

        account.deposit(4000.0); // Deposit money
        account.withdraw(3000.0); // Withdraw money
        System.out.println("Current balance: " + account.checkBalance());

        // Create a SavingsAccount object
        SavingsAccount savings = new SavingsAccount("888888888", "Amphitrite Jun", 2000.0, 5.0);
        savings.applyInterest(); // Apply interest
        System.out.println("Savings account balance: " + savings.checkBalance());
    }
}

