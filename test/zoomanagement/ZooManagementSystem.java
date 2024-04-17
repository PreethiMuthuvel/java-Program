package com.test.zoomanagement;

import java.util.Comparator;

public class ZooManagementSystem {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        // Adding animals to the zoo
        zoo.addAnimal(new Lion("Simba", 5));
        zoo.addAnimal(new Parrot("Polly", 2));
        zoo.addAnimal(new Lion("Nala", 3));
        zoo.addAnimal(new Parrot("Alex", 1));

        // Displaying animals in the zoo
        zoo.displayAnimals();

        // Displaying animal count in the zoo
        zoo.displayAnimalCount();

        // Sorting animals by age using Comparator
        zoo.getAnimals().sort(Comparator.comparingInt(Animal::getAge));

        // Displaying sorted animals
        System.out.println("\nSorted Animals by Age:");
        zoo.displayAnimals();
    }
}
