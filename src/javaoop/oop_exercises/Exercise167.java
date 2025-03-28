package javaoop.oop_exercises;

/*
Exercise 167:
Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.
*/

// Exercise167.java

import java.util.ArrayList;

// Define the Product class
class Product {
    private String name;    // Private field to store the name of the product
    private int quantity;    // Private field to store the quantity of the product

    // Constructor to initialize the name and quantity of the product
    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Getter method for the name field
    public String getName() {
        return name;
    }

    // Setter method for the name field
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the quantity field
    public int getQuantity() {
        return quantity;
    }

    // Setter method for the quantity field
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// Define the Inventory class
class Inventory {
    private ArrayList<Product> products;  // Private field to store a list of Product objects

    // Constructor to initialize the products field
    public Inventory() {
        products = new ArrayList<Product>();
    }

    // Method to add a Product to the products list
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to remove a Product from the products list
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Method to check for low inventory products
    public void checkLowInventory() {
        for (Product product : products) {
            if (product.getQuantity() <= 100) {
                System.out.println(product.getName() + " is running low on inventory. Current quantity: " + product.getQuantity());
            }
        }
    }
}

// Define the Exercise167 class
public class Exercise167 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Create new Product objects with name and quantity
        Product product1 = new Product("LED TV", 200);
        Product product2 = new Product("Mobile", 80);
        Product product3 = new Product("Tablet", 50);

        // Add products to inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Display low inventory items
        System.out.println("Checking low inventory:");
        inventory.checkLowInventory();

        // Remove a product from inventory
        System.out.println("\nRemoving Tablet from inventory.");
        inventory.removeProduct(product3);

        // Check low inventory again
        System.out.println("\nChecking low inventory again:");
        inventory.checkLowInventory();
    }
}

