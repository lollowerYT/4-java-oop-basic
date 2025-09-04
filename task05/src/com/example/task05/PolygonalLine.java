package com.example.task05;
import java.util.ArrayList;

public class PolygonalLine {
    private final ArrayList<Point> line;

    public PolygonalLine() {
        line = new ArrayList<>();
    }

    public void setPoints(Point[] points) {
        for (Point p : points) {
            addPoint(p);
        }
    }

    public void addPoint(Point point) {
        line.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        line.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < line.size() - 1; i++) {
            Point first = line.get(i);
            Point second = line.get(i + 1);
            length += first.getLength(second);
        }
        return length;
    }
}
