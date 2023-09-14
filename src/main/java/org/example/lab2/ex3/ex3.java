package org.example.lab2.ex3;

public class ex3 {
    public static void main(String[] args) {

            Point center1 = new Point(2.0, 3.0);
            Circle circle1 = new Circle(center1, 4.0);

            Point center2 = new Point(5.0, 7.0);
            Circle circle2 = new Circle(center2, 2.5);

            Tester tester = new Tester(2);
            tester.addCircle(circle1);
            tester.addCircle(circle2);

            tester.printCircles();
    }
}
