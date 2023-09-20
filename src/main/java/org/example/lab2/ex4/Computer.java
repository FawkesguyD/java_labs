package org.example.lab2.ex4;

public class Computer {
        private String model;
        private double price;

        public Computer(String model, double price) {
            this.model = model;
            this.price = price;
        }

        public String getModel() {
            return model;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Computer [model=" + model + ", price=" + price + "]";
        }
}
