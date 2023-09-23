package org.example.lab2.ex3;

public class Tester {
        private final Circle[] circles;
        private int count;

    public Tester( int size){
            circles = new Circle[size];
            count = 0;
        }

        public void addCircle (Circle circle){
            if (count < circles.length) {
                circles[count] = circle;
                count++;
            } else {
                System.out.println("Массив объектов Circle полон.");
            }
        }

        public void printCircles () {
            for (int i = 0; i < count; i++) {
                System.out.println("Круг " + (i + 1) + ":");
                System.out.println("Центр: (" + circles[i].getCenter().getX() + ", " + circles[i].getCenter().getY() + ")");
                System.out.println("Радиус: " + circles[i].getRadius());
                System.out.println();
            }
        }
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

