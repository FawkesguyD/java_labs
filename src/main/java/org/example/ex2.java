package org.example;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter lengh: ");
        int lengh = in.nextInt();
        int arr[] = new int[lengh];

        for (int i = 0; i < lengh; i++) { // заполнение
            arr[i] = in.nextInt();
        }

        int size = 0;
        int sum = 0;
        int min = arr[0];
        int max = 0;
        while(size != lengh) {
            if (arr[size] > max) max = arr[size];
            if (arr[size] < min) min = arr[size];
            sum += arr[size];
            size++;
        }
        System.out.println("min " + min + "\nmax " + max + "\nsum " + sum);
    }
}
