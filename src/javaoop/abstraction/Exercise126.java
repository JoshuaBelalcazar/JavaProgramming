package javaoop.abstraction;
/*
Exercise 126:
Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods
to handle deposits and withdrawals for each account type.

Expected Output:

Savings A/c: Initial Balance: $1000.0
Deposit of $500.0 successful. Current balance: $1500.0
Withdrawal of $250.0 successful. Current balance: $1250.0

Try to withdraw: $1600.0
Insufficient funds. Withdrawal failed.

Current A/c: Initial Balance: $5000.0
Deposit of $1000.0 successful. Current balance: $6000.0
Withdrawal of $3000.0 successful. Current balance: $3000.0

Try to withdraw: $6000.0
Insufficient funds. Withdrawal failed.
*/

public class Exercise126 {
    public static void main(String[] args) {
        double ibal, damt, wamt;

        // --- Demonstrate SavingsAccount functionality ---
        ibal = 1000.00;
        System.out.println("Savings A/c: Initial Balance: $" + ibal);
        SavingsAccount savingsAccount = new SavingsAccount("SA001", ibal);

        damt = 500.00;
        savingsAccount.deposit(damt);

        wamt = 250.00;
        savingsAccount.withdraw(wamt);

        wamt = 1600.00;
        System.out.println("\nTry to withdraw: $" + wamt);
        savingsAccount.withdraw(wamt);

        System.out.println();

        // --- Demonstrate CurrentAccount functionality ---
        ibal = 5000.00;
        System.out.println("Current A/c: Initial Balance: $" + ibal);
        CurrentAccount currentAccount = new CurrentAccount("CA001", ibal);

        // Deposit for CurrentAccount
        damt = 1000.00;
        currentAccount.deposit(damt);

        // Withdraw from CurrentAccount
        wamt = 3000.00;
        currentAccount.withdraw(wamt);

        wamt = 6000.00;
        System.out.println("\nTry to withdraw: $" + wamt);
        currentAccount.withdraw(wamt);
    }

    // Private static abstract inner class BankAccount to avoid conflicts
    private static abstract class BankAccount {
        private final String accountNumber;
        private double balance;

        // Constructor to initialize account number and balance
        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Getter method for balance
        public double getBalance() {
            return balance;
        }

        // Protected setter method for balance
        protected void setBalance(double balance) {
            this.balance = balance;
        }

        // Abstract method for depositing an amount
        public abstract void deposit(double amount);

        // Abstract method for withdrawing an amount
        public abstract void withdraw(double amount);
    }

    // Private static inner class SavingsAccount extending BankAccount
    private static class SavingsAccount extends BankAccount {
        public SavingsAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        // Implement deposit: add the deposit amount to the balance and print a message
        @Override
        public void deposit(double amount) {
            setBalance(getBalance() + amount);
            System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
        }

        // Implement withdraw: prevent withdrawal if balance would fall below $100
        @Override
        public void withdraw(double amount) {
            if (getBalance() - amount < 100) {
                System.out.println("Insufficient funds. Withdrawal failed.");
            } else {
                setBalance(getBalance() - amount);
                System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
            }
        }
    }

    // Private static inner class CurrentAccount extending BankAccount
    private static class CurrentAccount extends BankAccount {
        public CurrentAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        // Implement deposit: add the deposit amount to the balance and print a message
        @Override
        public void deposit(double amount) {
            setBalance(getBalance() + amount);
            System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
        }

        // Implement withdraw: check for sufficient funds before withdrawal
        @Override
        public void withdraw(double amount) {
            if (getBalance() >= amount) {
                setBalance(getBalance() - amount);
                System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
            } else {
                System.out.println("Insufficient funds. Withdrawal failed.");
            }
        }
    }
}
