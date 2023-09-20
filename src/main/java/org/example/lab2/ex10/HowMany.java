package org.example.lab2.ex10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String input = scanner.nextLine();

        int wordCount = countWords(input);

        System.out.println("Количество слов: " + wordCount);

        scanner.close();
    }

    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.split("\\s+");
        return words.length;
    }
}

