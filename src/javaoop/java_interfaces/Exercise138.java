package javaoop.java_interfaces;

/*
Exercise 138:
Write a Java program to create a banking system with four components:
1. An interface Account with methods deposit(), withdraw(), and getBalance().
2. A SavingsAccount class that implements Account and includes a method applyInterest() to update the balance based on an interest rate.
3. A CurrentAccount class that implements Account and supports an overdraft limit.
4. A Bank class that maintains a list of Account objects and provides methods to add accounts, deposit, withdraw, and print account balances.
The main method demonstrates the functionality by creating instances of SavingsAccount and CurrentAccount, performing deposits and withdrawals, and displaying the account balances before and after applying interest.

Expected Output:

Savings A/c: Initial Balance: $1000.0
Now deposit $100 to Savings Account.
Deposit of $100.0 successful. Current balance: $1100.0
Withdraw $150 from Savings Account.
Withdrawal of $150.0 successful. Current balance: $950.0

Try to withdraw: $1600.0
Insufficient funds. Withdrawal failed.

Current A/c: Initial Balance: $5000.0
Now deposit $500 to Current Account.
Deposit of $500.0 successful. Current balance: $5500.0
Withdraw $3000 from Current Account.
Withdrawal of $3000.0 successful. Current balance: $2500.0

Try to withdraw: $6000.0
Insufficient funds. Withdrawal failed.
*/

import java.util.ArrayList;
import java.util.List;

public class Exercise138 {
    public static void main(String[] args) {
        // Create a Bank instance
        Bank bank = new Bank();

        // Create a SavingsAccount with initial deposit $1000.00 and interest rate 1.25%
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000.0, 1.25);
        System.out.println("Savings A/c: Initial Balance: $" + savingsAccount.getBalance());

        // Create a CurrentAccount with initial deposit $5000.00 and overdraft limit $1000.00
        CurrentAccount currentAccount = new CurrentAccount("CA001", 5000.0, 1000.0);
        System.out.println("\nCurrent A/c: Initial Balance: $" + currentAccount.getBalance());

        // Add both accounts to the bank
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Demonstrate deposits
        System.out.println("\nNow deposit $100 to Savings Account.");
        bank.deposit(savingsAccount, 100.0);

        System.out.println("Now deposit $500 to Current Account.");
        bank.deposit(currentAccount, 500.0);

        // Demonstrate withdrawals on SavingsAccount
        System.out.println("\nWithdraw $150 from Savings Account.");
        bank.withdraw(savingsAccount, 150.0);

        System.out.println("\nTry to withdraw: $1600.0 from Savings Account.");
        bank.withdraw(savingsAccount, 1600.0);

        // Print current balances
        System.out.println("\nSavings A/c and Current A/c. Balances:");
        bank.printAccountBalances();

        // Apply interest to SavingsAccount
        savingsAccount.applyInterest();
        System.out.println("\nAfter applying interest on Savings A/c for 1 year:");
        System.out.println("Savings A/c and Current A/c. Balances:");
        bank.printAccountBalances();

        // Demonstrate withdrawals on CurrentAccount
        System.out.println("\nWithdraw $3000 from Current Account.");
        bank.withdraw(currentAccount, 3000.0);

        System.out.println("\nTry to withdraw: $6000.0 from Current Account.");
        bank.withdraw(currentAccount, 6000.0);
    }

    // Private static interface Account to avoid conflicts
    private interface Account {
        void deposit(double amount);

        void withdraw(double amount);

        double getBalance();
    }

    // Private static inner class SavingsAccount implementing Account
    private static class SavingsAccount implements Account {
        private final String accountNumber;
        private double balance;
        private final double interestRate; // in percentage

        public SavingsAccount(String accountNumber, double initialDeposit, double interestRate) {
            this.accountNumber = accountNumber;
            this.balance = initialDeposit;
            this.interestRate = interestRate;
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. Current balance: $" + balance);
        }

        @Override
        public void withdraw(double amount) {
            if (balance - amount < 100) {
                System.out.println("Insufficient funds. Withdrawal failed.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + balance);
            }
        }

        @Override
        public double getBalance() {
            return balance;
        }

        // Method to apply interest for one year
        public void applyInterest() {
            balance += balance * interestRate / 100;
        }
    }

    // Private static inner class CurrentAccount implementing Account
    private static class CurrentAccount implements Account {
        private final String accountNumber;
        private double balance;
        private double overdraftLimit;

        public CurrentAccount(String accountNumber, double initialDeposit, double overdraftLimit) {
            this.accountNumber = accountNumber;
            this.balance = initialDeposit;
            this.overdraftLimit = overdraftLimit;
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. Current balance: $" + balance);
        }

        @Override
        public void withdraw(double amount) {
            if (balance + overdraftLimit >= amount) {
                balance -= amount;
                System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + balance);
            } else {
                System.out.println("Insufficient funds. Withdrawal failed.");
            }
        }

        @Override
        public double getBalance() {
            return balance;
        }

        // Method to set overdraft limit if needed
        public void setOverdraftLimit(double overdraftLimit) {
            this.overdraftLimit = overdraftLimit;
        }
    }

    // Private static inner class Bank that manages a list of Account objects
    private static class Bank {
        private final List<Account> accounts;

        public Bank() {
            accounts = new ArrayList<>();
        }

        public void addAccount(Account account) {
            accounts.add(account);
        }

        public void removeAccount(Account account) {
            accounts.remove(account);
        }

        public void deposit(Account account, double amount) {
            account.deposit(amount);
        }

        public void withdraw(Account account, double amount) {
            account.withdraw(amount);
        }

        public void printAccountBalances() {
            for (Account account : accounts) {
                System.out.println("Account balance: " + account.getBalance());
            }
        }
    }
}

