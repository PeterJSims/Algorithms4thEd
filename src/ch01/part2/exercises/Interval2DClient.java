package ch01.part2.exercises;


import edu.princeton.cs.algs4.*;

public class Interval2DClient {
    public static void show(int N, double min, double max) {

        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        Interval2D[] interval2DS = new Interval2D[N];
        for (int i = 0; i < N; i++) {
            double x1 = StdRandom.uniform(min, max);
            double x2 = StdRandom.uniform(x1, max);
            double y1 = StdRandom.uniform(min, max);
            double y2 = StdRandom.uniform(y1, max);
            StdOut.printf("%.3f %.3f %.3f %.3f\n", x1, x2, y1, y2);
            interval2DS[i] = new Interval2D(new Interval1D(x1, x2), new Interval1D(y1, y2));
            interval2DS[i].draw();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.setPenRadius(0.01);
                if (interval2DS[i].intersects(interval2DS[j])) {
                    interval2DS[i].draw();
                    interval2DS[j].draw();
                    StdOut.println("intersects: " + interval2DS[i] + " " + interval2DS[j]);
                }
            }
        }
    }
}
