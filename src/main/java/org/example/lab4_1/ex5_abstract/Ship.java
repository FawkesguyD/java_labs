package org.example.lab4_1.ex5_abstract;

public class Ship extends Vehicle {
    private double passengerTicketPrice;
    private double cargoPricePerTon;

    public Ship(String name, int passengerCapacity, int cargoCapacity, double passengerTicketPrice, double cargoPricePerTon) {
        super(name, passengerCapacity, cargoCapacity);
        this.passengerTicketPrice = passengerTicketPrice;
        this.cargoPricePerTon = cargoPricePerTon;
    }

    @Override
    public double calculatePassengerTransportCost(int distance) {
        return passengerTicketPrice;
    }

    @Override
    public double calculateCargoTransportCost(int distance) {
        return cargoPricePerTon * (getCargoCapacity() / 1000.0);
    }

    @Override
    public double calculateTravelTime(int distance) {
        return distance / 30.0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}