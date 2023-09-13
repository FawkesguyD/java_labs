package org.example;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter lengh: ");
        int lengh = in.nextInt();
        int arr[] = new int[lengh];

        int sum = 0;

        for (int i = 0; i < lengh; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.out.println("sum of numbers " + sum + '\n' + "average " + sum/lengh);

    }
}