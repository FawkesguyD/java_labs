package org.example.lab4_1.ex4_abstract;

public class Table extends Furniture {
    private int numberOfSeats;

    public Table(String name, double price, int numberOfSeats) {
        super(name, price);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + getName());
        System.out.println("Price: " + getPrice() + " rub.");
        System.out.println("Seats: " + numberOfSeats + "\n");
    }
}
