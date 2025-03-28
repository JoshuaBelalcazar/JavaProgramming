package javaoop.oop_exercises;

/*
Exercise 172:
Write a Java program to create a class called "Customer" with attributes for name, email, and purchase history.
Implement methods to add purchases to the history and calculate total expenditure.
Create a subclass "LoyalCustomer" that adds a discount rate attribute and a method to apply the discount.
*/

// Exercise172.java

// Import necessary classes
import java.util.ArrayList;
import java.util.List;

// Define the Customer class
class Customer {
    private String name;
    private String email;
    private List<Double> purchaseHistory;

    // Constructor to initialize Customer with name and email
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();  // Initialize purchase history as an empty list
    }

    // Method to add a purchase to the purchase history
    public void addPurchase(double amount) {
        purchaseHistory.add(amount);
    }

    // Method to calculate total expenditure
    public double calculateTotalExpenditure() {
        double total = 0;
        for (double purchase : purchaseHistory) {
            total += purchase;
        }
        return total;
    }

    // Getter methods for name, email, and purchase history
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Double> getPurchaseHistory() {
        return purchaseHistory;
    }
}

// Define the LoyalCustomer subclass that extends Customer
class LoyalCustomer extends Customer {
    private double discountRate;

    // Constructor to initialize LoyalCustomer with name, email, and discount rate
    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

    // Method to apply discount to a given amount
    public double applyDiscount(double amount) {
        return amount - (amount * discountRate / 100);
    }

    // Override the addPurchase method to apply discount before adding the purchase
    @Override
    public void addPurchase(double amount) {
        double discountedAmount = applyDiscount(amount);
        super.addPurchase(discountedAmount);  // Call the superclass method to add the discounted amount
    }

    // Getter and Setter for discount rate
    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}

// Main class to test the Customer and LoyalCustomer classes
public class Exercise172 {
    public static void main(String[] args) {

        // Create a regular customer
        Customer customer1 = new Customer("Talisha Dion", "talisha@example.com");
        customer1.addPurchase(200);
        customer1.addPurchase(300);
        System.out.println("Total expenditure for " + customer1.getName() + ": " + customer1.calculateTotalExpenditure());

        // Create a loyal customer with a discount rate
        LoyalCustomer loyalCustomer = new LoyalCustomer("Fulchard Sofya", "fulchard@example.com", 10); // 10% discount
        loyalCustomer.addPurchase(200);
        loyalCustomer.addPurchase(300);
        System.out.println("Total expenditure for " + loyalCustomer.getName() + " after discount: " + loyalCustomer.calculateTotalExpenditure());
    }
}

