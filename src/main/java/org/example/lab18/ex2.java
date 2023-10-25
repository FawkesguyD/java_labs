package org.example.lab18;

import java.security.cert.Extension;
import java.util.Scanner;

public class ex2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (NumberFormatException e) {
            System.out.println("Catch the exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ex2 ex2 = new ex2();
        ex2.exceptionDemo();
    }
}
