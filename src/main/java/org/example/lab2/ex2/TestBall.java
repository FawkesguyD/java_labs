package org.example.lab2.ex2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(234, 45);
        ball.setXY(10,20);
        System.out.println(ball);

        ball.move(100,200);
        System.out.println(ball);
    }
}
