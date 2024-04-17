package com.test.inventorysystem;

public class Product {
    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Price: $" + price;
    }
}
