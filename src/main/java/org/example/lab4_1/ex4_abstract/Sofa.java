package org.example.lab4_1.ex4_abstract;

public class Sofa extends Furniture {
    private boolean isSleeper;

    public Sofa(String name, double price, boolean isSleeper) {
        super(name, price);
        this.isSleeper = isSleeper;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + getName());
        System.out.println("Price: " + getPrice() + " rub.");
        System.out.println("Sleeping place: " + (isSleeper ? "yes" : "no") + "\n");
    }
}