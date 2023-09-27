package org.example.lab4_1.ex1;

public class Shape {
    public String getType() {
        return "Figure";
    }
    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Type:      " + getType() +
                "\nSquare:    " + getArea() +
                "\nPerimeter: " + getPerimeter() + "\n";
    }
}
