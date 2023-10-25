package org.example.lab20;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {3, 7, 1, 9, 4, 2};
        Double[] doubleArray = {2.5, 5.3, 1.1, 3.8};

        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        MinMax<Double> doubleMinMax = new MinMax<>(doubleArray);

        System.out.println("Min in intArray: " + intMinMax.findMin());
        System.out.println("Max in intArray: " + intMinMax.findMax());
        System.out.println("Min in doubleArray: " + doubleMinMax.findMin());
        System.out.println("Max in doubleArray: " + doubleMinMax.findMax() + '\n');

        int a = 10, b = 5;
        double x = 7.5, y = 3.2;

        System.out.println("Sum of a and b: " + Calculator.sum(a, b));
        System.out.println("Product of x and y: " + Calculator.multiply(x, y));
        System.out.println("Division of a by b: " + Calculator.divide(a, b));
        System.out.println("Subtraction of x and y: " + Calculator.subtract(x, y));
    }
}
