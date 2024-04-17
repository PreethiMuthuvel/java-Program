package com.test.carrental;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Car> cars;
    private List<Customer> customers;

    public RentalAgency() {
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayAvailableCars() {
        System.out.println("Available Cars:");
        for (Car car : cars) {
            if (!car.isRented()) {
                System.out.println(car);
            }
        }
    }

    public void rentCar(Customer customer, Car car) {
        if (customers.contains(customer) && cars.contains(car) && !car.isRented()) {
            car.rentCar();
            System.out.println(customer.getName() + " rented " + car);
        } else {
            System.out.println("Unable to process the rental request.");
        }
    }

    public void returnCar(Customer customer, Car car) {
        if (customers.contains(customer) && cars.contains(car) && car.isRented()) {
            car.returnCar();
            System.out.println(customer.getName() + " returned " + car);
        } else {
            System.out.println("Unable to process the return request.");
        }
    }

    public void displayRentedCars() {
        System.out.println("Rented Cars:");
        for (Car car : cars) {
            if (car.isRented()) {
                System.out.println(car);
            }
        }
    }

    public void displayCustomers() {
        System.out.println("Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
