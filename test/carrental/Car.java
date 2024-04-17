package com.test.carrental;

public class Car {
    private String make;
    private String model;
    private int year;
    private double dailyRate;
    private boolean rented;

    public Car(String make, String model, int year, double dailyRate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.dailyRate = dailyRate;
        this.rented = false;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isRented() {
        return rented;
    }

    public void rentCar() {
        if (!rented) {
            rented = true;
            System.out.println("Car rented successfully.");
        } else {
            System.out.println("Car is already rented.");
        }
    }

    public void returnCar() {
        if (rented) {
            rented = false;
            System.out.println("Car returned successfully.");
        } else {
            System.out.println("Car is not currently rented.");
        }
    }

    @Override
    public String toString() {
        return make + " " + model + " (" + year + ")";
    }
}
