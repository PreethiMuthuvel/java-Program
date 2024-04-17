package com.test.zoomanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
    private List<Animal> animals;
    private Map<String, Integer> animalCount;

    public Zoo() {
        this.animals = new ArrayList<>();
        this.animalCount = new HashMap<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        String animalType = animal.getClass().getSimpleName();
        animalCount.put(animalType, animalCount.getOrDefault(animalType, 0) + 1);
    }

    public void displayAnimals() {
        System.out.println("Zoo Animals:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void displayAnimalCount() {
        System.out.println("Animal Count in the Zoo:");
        for (Map.Entry<String, Integer> entry : animalCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
