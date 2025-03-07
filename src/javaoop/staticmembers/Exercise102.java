package javaoop.staticmembers;

/*
Exercise 102:
Write a Java program to create a class called "BankAccount" with instance variables 'accountNumber' and balance,
and static variables 'bankName' and 'interestRate'. Provide static methods to get and set the static variables.
Create several 'BankAccount' objects and print their details along with the static variables.

Expected Output:
Account Number: 123456789
Balance: 1000.0
Bank Name: National Bank
Interest Rate: 3.5%

Account Number: 987654321
Balance: 2000.0
Bank Name: National Bank
Interest Rate: 3.5%
*/

public class Exercise102 {
    public static void main(String[] args) {
        // Set static variables using static methods
        BankAccount.setBankName("National Bank");
        BankAccount.setInterestRate(3.5);

        // Create BankAccount objects using the parameterized constructor
        BankAccount account1 = new BankAccount("123456789", 1000.00);
        BankAccount account2 = new BankAccount("987654321", 2000.00);

        // Print the details of the BankAccount objects
        account1.printDetails();
        System.out.println();
        account2.printDetails();
    }

    // Private static inner class BankAccount to avoid conflicts
    private static class BankAccount {
        // Instance variables
        private String accountNumber;
        private double balance;

        // Static variables
        private static String bankName;
        private static double interestRate;

        // Parameterized constructor to initialize instance variables
        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Static method to get the bank name
        public static String getBankName() {
            return bankName;
        }

        // Static method to set the bank name
        public static void setBankName(String name) {
            bankName = name;
        }

        // Static method to get the interest rate
        public static double getInterestRate() {
            return interestRate;
        }

        // Static method to set the interest rate
        public static void setInterestRate(double rate) {
            interestRate = rate;
        }

        // Method to print the details of the BankAccount object along with static variables
        public void printDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
            System.out.println("Bank Name: " + bankName);
            System.out.println("Interest Rate: " + interestRate + "%");
        }
    }
}
