package com.test.carrental;

import java.util.Scanner;

public class CarRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalAgency rentalAgency = new RentalAgency();

        // Adding cars to the rental agency
        rentalAgency.addCar(new Car("Toyota", "Camry", 2022, 50.0));
        rentalAgency.addCar(new Car("Honda", "Accord", 2021, 55.0));
        rentalAgency.addCar(new Car("Ford", "Escape", 2022, 45.0));

        // Adding customers to the rental agency
        rentalAgency.addCustomer(new Customer("John Doe", "DL12345"));
        rentalAgency.addCustomer(new Customer("Jane Smith", "DL67890"));

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display Available Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Display Rented Cars");
            System.out.println("5. Display Customers");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    rentalAgency.displayAvailableCars();
                    break;
                case 2:
                    rentalAgency.displayCustomers();
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.next();
                    Customer customer = rentalAgency.getCustomerByName(customerName);
                    if (customer != null) {
                        rentalAgency.displayAvailableCars();
                        System.out.print("Enter car make to rent: ");
                        String carMake = scanner.next();
                        Car carToRent = rentalAgency.getAvailableCarByMake(carMake);
                        if (carToRent != null) {
                            rentalAgency.rentCar(customer, carToRent);
                        } else {
                            System.out.println("Car not available for rent.");
                        }
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;
                case 3:
                    rentalAgency.displayCustomers();
                    System.out.print("Enter customer name: ");
                    String returnCustomerName = scanner.next();
                    Customer returnCustomer = rentalAgency.getCustomerByName(returnCustomerName);
                    if (returnCustomer != null) {
                        rentalAgency.displayRentedCars();
                        System.out.print("Enter car make to return: ");
                        String returnCarMake = scanner.next();
                        Car carToReturn = rentalAgency.getRentedCarByMake(returnCarMake);
                        if (carToReturn != null) {
                            rentalAgency.returnCar(returnCustomer, carToReturn);
                        } else {
                            System.out.println("Car not rented by the customer.");
                        }
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;
                case 4:
                    rentalAgency.displayRentedCars();
                    break;
                case 5:
                    rentalAgency.displayCustomers();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
