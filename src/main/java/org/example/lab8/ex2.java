package org.example.lab8;

import java.util.Scanner;

public class ex2 {
    public static int rec(int n) {
        if (n > 0) {
            rec(n - 1);
            System.out.println(n);
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        rec(in.nextInt());
    }
}
