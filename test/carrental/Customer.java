package com.test.carrental;

public class Customer {
    private String name;
    private String licenseNumber;

    public Customer(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public String toString() {
        return "Customer: " + name + " (License: " + licenseNumber + ")";
    }
}
