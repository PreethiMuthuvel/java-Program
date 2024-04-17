package com.test.zoomanagement;

public class Lion extends Mammal {
    public Lion(String name, int age) {
        super(name, age, true);
    }

    @Override
    public String makeSound() {
        return "Roar!";
    }
}
