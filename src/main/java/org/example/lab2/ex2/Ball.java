package org.example.lab2.ex2;

import com.sun.source.tree.UsesTree;

public class Ball {
    double x;
    double y;
    Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

   Ball() {}

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x = xDisp;
        this.y = yDisp;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
