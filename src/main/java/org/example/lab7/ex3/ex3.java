package org.example.lab7.ex3;

interface MathCalculable {
    double power(double base, double exponent);
    double modulus(double real, double imaginary);
    double PI = 3.14159265359; // Задаем значение константы π
}

class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double modulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // Мы используем константу PI из интерфейса
    public double calculateCircleLength(double radius) {
        return 2 * PI * radius;
    }
}

class Main {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();
        double result1 = mathFunc.power(2, 3); // Возвести 2 в степень 3
        double result2 = mathFunc.modulus(3, 4); // Найти модуль комплексного числа 3 + 4i
        double circleLength = mathFunc.calculateCircleLength(5); // Вычислить длину окружности с радиусом 5

        System.out.println("2^3 = " + result1);
        System.out.println("|3 + 4i| = " + result2);
        System.out.println("Длина окружности с радиусом 5 = " + circleLength);
    }
}

