package org.example.lab1;

import java.math.BigInteger;
import java.util.Scanner;

public class ex5 {

    public static void factorial(int n) {
        BigInteger multiplication = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            multiplication = multiplication.multiply(BigInteger.valueOf(i));

        }
        System.out.println("result - " + multiplication);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter count of numbers: ");
        int n = in.nextInt();
        factorial(n);
    }

}

