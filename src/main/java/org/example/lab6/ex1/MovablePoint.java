package org.example.lab6.ex1;

public class MovablePoint implements Movable {
    private int x;
    private int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void moveUp() {
        this.y -=5;
    }

    @Override
    public void moveDown() {
        this.y += 5;
    }

    @Override
    public void moveLeft() {
        this.x -= 5;
    }

    @Override
    public void moveRight() {
        this.x += 5;
    }
}
