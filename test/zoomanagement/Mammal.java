package com.test.zoomanagement;

public abstract class Mammal extends Animal {
    private boolean isWarmBlooded;

    public Mammal(String name, int age, boolean isWarmBlooded) {
        super(name, age);
        this.isWarmBlooded = isWarmBlooded;
    }

    public boolean isWarmBlooded() {
        return isWarmBlooded;
    }

    @Override
    public String toString() {
        return "Mammal " + super.toString() + ", isWarmBlooded=" + isWarmBlooded;
    }
}
