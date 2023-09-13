package org.example.lab1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int size = arr.length;
        int sum = 0;


        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i : arr) {
            sum += i;
        }


        System.out.println("sum of numbers " + sum + '\n' + "average " + sum/size);

    }
}