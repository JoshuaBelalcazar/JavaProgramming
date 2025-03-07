package javaoop.inheritance;

/*
Exercise 118:
Write a Java program to create a class called "BankAccount" with methods called deposit() and withdraw().
Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
Demonstrate the functionality by creating a BankAccount object and two SavingsAccount objects, and performing deposit and withdrawal operations.

Expected Output:
Create a Bank Account object (A/c No. BA1234) with initial balance of $500:
Deposit $1000 into account BA1234:
New balance after depositing $1000: $1500.0
Withdraw $600 from account BA1234:
New balance after withdrawing $600: $900.0

Create a SavingsAccount object (A/c No. SA1234) with initial balance of $450:
Balance after trying to withdraw $300: $150.0

Create a SavingsAccount object (A/c No. SA1000) with initial balance of $300:
Try to withdraw $250 from SA1000!
Minimum balance of $100 required!
Balance after trying to withdraw $250: $300.0
*/

public class Exercise118 {
    public static void main(String[] args) {
        // Create a BankAccount object with initial balance of $500
        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of $500:");
        BankAccount BA1234 = new BankAccount("BA1234", 500);

        // Deposit $1000 into account BA1234
        System.out.println("Deposit $1000 into account BA1234:");
        BA1234.deposit(1000);
        System.out.println("New balance after depositing $1000: $" + BA1234.getBalance());

        // Withdraw $600 from account BA1234
        System.out.println("Withdraw $600 from account BA1234:");
        BA1234.withdraw(600);
        System.out.println("New balance after withdrawing $600: $" + BA1234.getBalance());

        System.out.println();

        // Create a SavingsAccount object with initial balance of $450
        System.out.println("Create a SavingsAccount object (A/c No. SA1234) with initial balance of $450:");
        SavingsAccount SA1234 = new SavingsAccount("SA1234", 450);
        // Withdraw $300 from SA1234
        SA1234.withdraw(300);
        System.out.println("Balance after trying to withdraw $300: $" + SA1234.getBalance());

        System.out.println();

        // Create a SavingsAccount object with initial balance of $300
        System.out.println("Create a SavingsAccount object (A/c No. SA1000) with initial balance of $300:");
        SavingsAccount SA1000 = new SavingsAccount("SA1000", 300);
        // Try to withdraw $250 from SA1000 (should fail because it will drop below $100)
        System.out.println("Try to withdraw $250 from SA1000!");
        SA1000.withdraw(250);
        System.out.println("Balance after trying to withdraw $250: $" + SA1000.getBalance());
    }

    // Private static inner class BankAccount to avoid conflicts
    private static class BankAccount {
        // Private instance variables for account number and balance
        private final String accountNumber;
        private double balance;

        // Constructor to initialize account number and balance
        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Method to deposit an amount into the account
        public void deposit(double amount) {
            balance += amount;
        }

        // Method to withdraw an amount from the account
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
        }

        // Getter for balance
        public double getBalance() {
            return balance;
        }
    }

    // Private static inner class SavingsAccount extending BankAccount
    private static class SavingsAccount extends BankAccount {
        // Constructor to initialize SavingsAccount by calling parent constructor
        public SavingsAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        // Override the withdraw method to ensure the balance does not fall below $100
        @Override
        public void withdraw(double amount) {
            if (getBalance() - amount < 100) {
                System.out.println("Minimum balance of $100 required!");
            } else {
                super.withdraw(amount);
            }
        }
    }
}
