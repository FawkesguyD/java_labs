package org.example.lab4_1.ex5_abstract;

public abstract class Vehicle {
    private int distance = 1000;
    private String name;
    private int passengerCapacity;
    private int cargoCapacity;

    public Vehicle(String name, int passengerCapacity, int cargoCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
    }

    public abstract double calculatePassengerTransportCost(int distance);
    public abstract double calculateCargoTransportCost(int distance);
    public abstract double calculateTravelTime(int distance);

    public String getName() {
        return name;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public String toString() {
        return "Vehicle: " + getName() +
                "\nPassenger Transport Cost: $" + calculatePassengerTransportCost(distance) +
                "\nCargo Transport Cost: $" + calculateCargoTransportCost(distance) +
                "\nTravel Time: " + calculateTravelTime(distance) + " hours\n";
    }

    public static void main(String[] args) {
        Car car = new Car("Car", 4, 500, 10.0, 2.0);
        Airplane airplane = new Airplane("Airplane", 150, 2000, 20.0, 10.0);
        Train train = new Train("Train", 300, 10000, 0.5, 0.05);
        Ship ship = new Ship("Ship", 1000, 50000, 50.0, 0.2);

        System.out.println(car);
        System.out.println(airplane);
        System.out.println(train);
        System.out.println(ship);
    }
}
