package constructors;
/*
Exercise 91:
Write a Java program to create a class called Account with instance variables accountNumber and balance.
Implement a parameterized constructor that initializes these variables with validation:
- accountNumber should be non-null and non-empty.
- balance should be non-negative.
Print an error message if the validation fails.

Expected Output:
Account 1 Number: 12340009
Account 1 Balance: 1000.0
Error: Account number cannot be null or empty.
Error: Balance cannot be negative.
*/

public class Exercise91 {
    public static void main(String[] args) {
        // Test with valid data
        Account account1 = new Account("12340009", 1000.00);
        if (account1.isValid()) {
            System.out.println("Account 1 Number: " + account1.getAccountNumber());
            System.out.println("Account 1 Balance: " + account1.getBalance());
        }
        System.out.println();

        // Test with invalid accountNumber (empty string)
        Account account2 = new Account("", 400.00);

        // Test with invalid balance (negative value)
        Account account3 = new Account("1230000873", -200.00);
    }

    // Private static inner class Account to avoid conflicts
    private static class Account {
        // Private instance variables
        private String accountNumber;
        private double balance;
        // Flag to indicate whether the account is valid
        private boolean valid;

        // Parameterized constructor with validation
        public Account(String accountNumber, double balance) {
            valid = true; // Assume valid until proven otherwise

            // Validate accountNumber
            if (accountNumber == null || accountNumber.isEmpty()) {
                System.err.println("Error: Account number cannot be null or empty.");
                valid = false;
                return;
            }

            // Validate balance
            if (balance < 0) {
                System.err.println("Error: Balance cannot be negative.");
                valid = false;
                return;
            }

            // If validations pass, initialize the instance variables
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Getter method for accountNumber
        public String getAccountNumber() {
            return accountNumber;
        }

        // Getter method for balance
        public double getBalance() {
            return balance;
        }

        // Method to check if the account object is valid
        public boolean isValid() {
            return valid;
        }
    }
}
