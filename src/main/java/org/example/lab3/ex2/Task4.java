package org.example.lab3.ex2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Task4
{
    public static void output(int[] arr, int n )
    {
        System.out.print("Array: ");

        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int n = 0;
        int count = 0;
        boolean flag = true;
        while (flag)
        {
            System.out.print("enter size of array: ");
            n = scan.nextInt();
            if (n < 0)
            {
                System.out.println("incorrect input");
            }
            else {
                flag = false;
            }
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
        {
            array[i] = rand.nextInt(10);
            if (array[i] % 2 == 0)
            {
                count++;
            }
        }
        output(array, n);

        ArrayList<Integer>  even = new ArrayList<Integer>(count);
        for (int i: array)
        {
                if (i % 2 == 0)
                {
                    even.add(i);
                }
        }
        System.out.println();
        System.out.print("Sorted array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(even.get(i) + " ");
        }
    }
}
