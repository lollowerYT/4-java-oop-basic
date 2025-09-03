package com.example.task01;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    public double distance(Point point) {
        var a = Math.pow(x - point.x, 2);
        var b = Math.pow(y - point.y, 2);

        return Math.sqrt(a + b);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
