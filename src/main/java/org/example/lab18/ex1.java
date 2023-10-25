package org.example.lab18;

public class ex1 {
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        ex1 ex1 = new ex1();
        ex1.exceptionDemo();
    }
}
