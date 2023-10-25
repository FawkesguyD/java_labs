package org.example.lab20;

public class Classes<T, V, K> {
    private T firstValue;
    private V secondValue;
    private K thirdValue;

    public Classes(T firstValue, V secondValue, K thirdValue) {
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

    public void printClassNames() {
        System.out.println("Class name for the first value: " + firstValue.getClass().getName());
        System.out.println("Class name for the second value: " + secondValue.getClass().getName());
        System.out.println("Class name for the third value: " + thirdValue.getClass().getName());
    }

    public static void main(String[] args) {
        Classes<Integer, String, Double> obj = new Classes<>(42, "Hello", 3.14);
        obj.printClassNames();
    }
}

