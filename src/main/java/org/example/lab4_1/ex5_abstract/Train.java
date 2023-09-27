package org.example.lab4_1.ex5_abstract;

public class Train extends Vehicle {
    private double ticketPricePerKilometer;
    private double cargoPricePerKilogram;

    public Train(String name, int passengerCapacity, int cargoCapacity, double ticketPricePerKilometer, double cargoPricePerKilogram) {
        super(name, passengerCapacity, cargoCapacity);
        this.ticketPricePerKilometer = ticketPricePerKilometer;
        this.cargoPricePerKilogram = cargoPricePerKilogram;
    }

    @Override
    public double calculatePassengerTransportCost(int distance) {
        return distance * ticketPricePerKilometer;
    }

    @Override
    public double calculateCargoTransportCost(int distance) {
        return distance * cargoPricePerKilogram;
    }

    @Override
    public double calculateTravelTime(int distance) {
        return distance / 120.0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
