package com.preethi.test;

class Address7 implements Cloneable {
    private String city;

    public Address7(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address7{" +
                "city='" + city + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person7 implements Cloneable {
    private String name;
     Address7 address;

    public Person7(String name, Address7 address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address7 getAddress() {
        return address;
    }

    public void setAddress(Address7 address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person7{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person7 clonedPerson = (Person7) super.clone();
        clonedPerson.address = (Address7) address.clone(); // Perform deep copy for Address object
        return clonedPerson;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address7 address = new Address7("New York");
        Person7 original = new Person7("John", address);

        // Deep copy
        Person7 cloned = (Person7) original.clone();

        // Modify the address in the cloned object
        cloned.getAddress().setCity("Los Angeles");

        // Output both original and cloned objects after modification
        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);
    }
}
