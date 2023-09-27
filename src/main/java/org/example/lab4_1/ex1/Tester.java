package org.example.lab4_1.ex1;

public class Tester {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape square = new Square(3.0);

        // Используем родительскую ссылку для вызова методов
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
