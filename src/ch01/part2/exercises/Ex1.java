package ch01.part2.exercises;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex1 {


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Point2D[] points = new Point2D[n];

        for (int i = 0; i < n; i++) {
            double x = StdRandom.uniform(0.0, 1.0);
            double y = StdRandom.uniform(0.0, 1.0);
            points[i] = new Point2D(x, y);
            StdDraw.setPenRadius(.05);
            points[i].draw();

        }
        StdDraw.setPenRadius(.0005);

        double shortestDistance = Double.POSITIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                points[i].drawTo(points[j]);
                double distance = points[i].distanceTo(points[j]);
                StdOut.println(distance);
                if (distance < shortestDistance) {
                    shortestDistance = distance;
                }
            }
        }
        StdOut.println("Shortest distance between any two points is " + shortestDistance);
    }
}
