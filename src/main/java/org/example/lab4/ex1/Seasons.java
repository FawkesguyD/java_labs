package org.example.lab4.ex1;

import java.util.Scanner;

public class Seasons {
    // Создаем перечисление времен года
    enum Season {
        Весна("прохладное время года", 15),
        Лето("теплое время года", 25),
        Осень("прохладное время года", 20),
        Зима("холодное время года", 0);

        private final String description;
        private final int averageTemperature;

        // Конструктор для установки описания и средней температуры
        Season(String description, int averageTemperature) {
            this.description = description;
            this.averageTemperature = averageTemperature;
        }

        // Метод для получения описания времени года
        public String getDescription() {
            if (this == Лето) {
                return "Теплое время года";
            }
            return description;
        }

        // Метод, который выводит информацию о времени года
        public void printInfo() {
            System.out.println("Время года: " + this.name());
            System.out.println("Средняя температура: " + averageTemperature + "°C");
            System.out.println("Описание: " + getDescription());
            System.out.println();
        }
    }
        public static void main(String[] args) {
            // Создаем переменную с любимым временем года
            Season favoriteSeason = Season.Лето;

            // Выводим информацию о любимом времени года
            System.out.println("-Мое любимое время года-");
            favoriteSeason.printInfo();

            // Используем оператор switch для вывода информации о времени года
            Scanner in = new Scanner(System.in);
            System.out.print("введите свое любимое время года: ");
            String season = in.nextLine();
            switch (season) {
                case "Лето":
                    System.out.println("Я люблю лето");
                    break;
                case "Осень":
                    System.out.println("Я люблю осень");
                    break;
                case "Зима":
                    System.out.println("Я люблю зиму");
                    break;
                case "Весна":
                    System.out.println("Я люблю весну");
                    break;
            }

            // Выводим информацию о всех временах года в цикле
            System.out.println("Информация о всех временах года:");
            for (Season seasons : Season.values()) {
                seasons.printInfo();
            }
        }
}
