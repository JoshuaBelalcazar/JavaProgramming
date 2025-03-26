package javaoop.polymorphism;


// Exercise158.java

// Define a class named BankAccount
class BankAccount {
    private double balance;  // Private instance variable to store the account balance

    public BankAccount(double initialBalance) {  // Constructor to initialize the account balance
        this.balance = initialBalance;
    }

    public double getBalance() {  // Method to get the current balance
        return balance;
    }

    public void deposit(double amount) {  // Method to deposit an amount
        balance += amount;
    }

    public void withdraw(double amount) {  // Method to withdraw an amount
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

// Define a class named SavingsAccount that extends BankAccount
class SavingsAccount extends BankAccount {
    private final double withdrawalLimit;  // Private variable for withdrawal limit

    public SavingsAccount(double initialBalance, double withdrawalLimit) {
        super(initialBalance);  // Call the superclass constructor
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {  // Override the withdraw method
        if (amount <= withdrawalLimit) {
            super.withdraw(amount);  // Call the superclass method
        } else {
            System.out.println("Withdrawal limit exceeded.");
        }
    }
}

// Define a class named CheckingAccount that extends BankAccount
class CheckingAccount extends BankAccount {
    private final double overdraftFee;  // Private variable for overdraft fee

    public CheckingAccount(double initialBalance, double overdraftFee) {
        super(initialBalance);  // Call the superclass constructor
        this.overdraftFee = overdraftFee;
    }

    @Override
    public void withdraw(double amount) {  // Override the withdraw method
        if (amount <= getBalance()) {
            super.withdraw(amount);  // Call the superclass method
        } else {
            System.out.println("Overdraft fee applied.");
            super.withdraw(amount + overdraftFee);  // Apply the overdraft fee
        }
    }
}

// Main class definition
public class Exercise158 {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(2000, 650);  // Create a SavingsAccount object
        BankAccount checkingAccount = new CheckingAccount(1000, 100);  // Create a CheckingAccount object

        withdrawFromAccount(savingsAccount, 300);  // Withdraw from savings account
        withdrawFromAccount(checkingAccount, 250);  // Withdraw from checking account

        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }

    // Method to withdraw from a given account
    public static void withdrawFromAccount(BankAccount account, double amount) {
        account.withdraw(amount);
    }
}
