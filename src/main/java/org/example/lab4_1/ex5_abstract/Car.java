package org.example.lab4_1.ex5_abstract;

public class Car extends Vehicle {
    private double fuelEfficiency;
    private double fuelCostPerLiter;

    public Car(String name, int passengerCapacity, int cargoCapacity, double fuelEfficiency, double fuelCostPerLiter) {
        super(name, passengerCapacity, cargoCapacity);
        this.fuelEfficiency = fuelEfficiency;
        this.fuelCostPerLiter = fuelCostPerLiter;
    }

    @Override
    public double calculatePassengerTransportCost(int distance) {
        return (distance / fuelEfficiency) * fuelCostPerLiter;
    }

    @Override
    public double calculateCargoTransportCost(int distance) {
        return calculatePassengerTransportCost(distance);
    }

    @Override
    public double calculateTravelTime(int distance) {
        return distance / 100.0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
