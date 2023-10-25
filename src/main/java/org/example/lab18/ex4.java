package org.example.lab18;

import java.util.Scanner;

public class ex4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        try {
            // код будет выполнен если не будет ошибок
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (NumberFormatException e) {
            // код будет выполнен в случае возникновения ошибки
            System.out.println("Catch the exception: " + e.getMessage());
        } finally {
            // код будет выполнен в любом случае
            System.out.println("Блок finally выполнен");
        }
    }

    public static void main(String[] args) {
        ex4 ex4 = new ex4();
        ex4.exceptionDemo();
    }
}
