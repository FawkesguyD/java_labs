package org.example.lab2.ex6;

import java.util.Objects;

public class Circle {
    private double radius;

    // Конструктор для создания объекта Circle с заданным радиусом
    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        this.radius = radius;
    }

    // Геттер для получения радиуса окружности
    public double getRadius() {
        return radius;
    }

    // Сеттер для изменения радиуса окружности
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        this.radius = radius;
    }

    // Метод для расчета площади круга
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Метод для расчета длины окружности
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Метод для сравнения двух окружностей
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    // Метод для вычисления хеш-кода окружности
    public int hashCode() {
        return Objects.hash(radius);
    }
}
