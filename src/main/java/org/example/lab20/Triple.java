package org.example.lab20;

public class Triple<T, V, K> {
    private T firstValue;
    private V secondValue;
    private K thirdValue;

    public Triple(T firstValue, V secondValue, K thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public V getSecondValue() {
        return secondValue;
    }

    public K getThirdValue() {
        return thirdValue;
    }

    public void setFirstValue(T firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(V secondValue) {
        this.secondValue = secondValue;
    }

    public void setThirdValue(K thirdValue) {
        this.thirdValue = thirdValue;
    }

    public void displayValue() {
        System.out.println("FirstValue: " + firstValue +
                           "\nSecondValue: " + secondValue +
                           "\nThirdValue: " + thirdValue);
    }

    public static void main(String[] args) {
        Triple<String, Integer, Double> triple = new Triple<>("Hello", 40, 56.0);

        triple.displayValue();
        System.out.println();

        triple.setFirstValue("Bye");
        triple.setSecondValue(1000000);
        triple.setThirdValue(5656.3453);

        triple.displayValue();
    }
}
