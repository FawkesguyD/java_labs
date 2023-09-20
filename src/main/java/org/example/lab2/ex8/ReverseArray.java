package org.example.lab2.ex8;

public class ReverseArray {
    public static void main(String[] args) {
        // Ваш исходный массив строк
        String[] originalArray = {"Это ", "предложение ", "должно ", "выводиться ", "наоборот."};

        // Меняем элементы массива в обратном порядке
        int length = originalArray.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = originalArray[i];
            originalArray[i] = originalArray[length - 1 - i];
            originalArray[length - 1 - i] = temp;
        }

        // Выводим измененный массив
        System.out.println("Измененный массив:");
        for (String element : originalArray) {
            System.out.print(element);
        }
    }
}

