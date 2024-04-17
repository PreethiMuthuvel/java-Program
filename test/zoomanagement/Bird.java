package com.test.zoomanagement;

public abstract class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean canFly() {
        return canFly;
    }

    @Override
    public String toString() {
        return "Bird " + super.toString() + ", canFly=" + canFly;
    }
}
