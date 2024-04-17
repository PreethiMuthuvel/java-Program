package com.test.inventorysystem;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product findProductById(int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null; // Product not found
    }

    public void removeProduct(int productId) {
        Product productToRemove = findProductById(productId);
        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println("Product removed from inventory.");
        } else {
            System.out.println("Product not found in inventory.");
        }
    }
}
