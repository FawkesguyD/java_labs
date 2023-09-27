package org.example.lab4_1.ex4_abstract;

public class Chair extends Furniture {
    private int numberOfLegs;

    public Chair(String name, double price, int numberOfLegs) {
        super(name, price);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + getName());
        System.out.println("Price: " + getPrice() + " rub.");
        System.out.println("Number of legs: " + numberOfLegs + "\n");
    }
}
