package org.example.lab2.ex6;

public class CircleTest {
    public static void main(String[] args) {
        // Создаем две окружности
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.0);

        // Проверяем геттер и сеттер для радиуса
        System.out.println("Радиус circle1: " + circle1.getRadius());
        System.out.println("Радиус circle2: " + circle2.getRadius());

        circle1.setRadius(10.0);
        System.out.println("Новый радиус circle1: " + circle1.getRadius());

        // Расчет площади и длины окружности
        System.out.println("Площадь circle1: " + circle1.calculateArea());
        System.out.println("Длина окружности circle1: " + circle1.calculateCircumference());

        // Сравнение двух окружностей
        if (circle1.equals(circle2)) {
            System.out.println("circle1 и circle2 равны.");
        } else {
            System.out.println("circle1 и circle2 разные.");
        }
    }
}

