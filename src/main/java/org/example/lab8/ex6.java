package org.example.lab8;

import java.util.Scanner;

public class ex6 {

    public static boolean rec(int n, int del) {
        if (del >= n) {
            return true;
        }
        if (n % del == 0) {
            return false;
        } else {
            return rec(n, del + 1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isprime = rec(in.nextInt(), 2);
        System.out.println("is it prime?");
        if(isprime)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
