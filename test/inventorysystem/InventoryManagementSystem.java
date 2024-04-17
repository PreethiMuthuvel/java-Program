package com.test.inventorysystem;

import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Inventory inventory = new Inventory();

        // Adding initial products to inventory
        inventory.addProduct(new Product(1, "Laptop", 999.99));
        inventory.addProduct(new Product(2, "Smartphone", 499.99));
        inventory.addProduct(new Product(3, "Headphones", 79.99));

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display Inventory");
            System.out.println("2. Add Product");
            System.out.println("3. Remove Product");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inventory.displayInventory();
                    break;
                case 2:
                    System.out.print("Enter product ID: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter product price: $");
                    double price = scanner.nextDouble();
                    Product newProduct = new Product(productId, productName, price);
                    inventory.addProduct(newProduct);
                    System.out.println("Product added to inventory.");
                    break;
                case 3:
                    System.out.print("Enter product ID to remove: ");
                    int productIdToRemove = scanner.nextInt();
                    inventory.removeProduct(productIdToRemove);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

