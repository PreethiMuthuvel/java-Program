package com.test.zoomanagement;

public class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age, true);
    }

    @Override
    public String makeSound() {
        return "Squawk!";
    }
}
