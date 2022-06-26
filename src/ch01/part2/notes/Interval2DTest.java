package ch01.part2.notes;

import edu.princeton.cs.algs4.*;

public class Interval2DTest {
    public static void main(String[] args) {
        double xMin = Double.parseDouble(args[0]);
        double xMax = Double.parseDouble(args[1]);
        double yMin = Double.parseDouble(args[2]);
        double yMax = Double.parseDouble(args[3]);
        int trials = Integer.parseInt(args[4]);

        Interval1D xInt = new Interval1D(xMin, xMax);
        Interval1D yInt = new Interval1D(yMin, yMax);
        Interval2D box = new Interval2D(xInt, yInt);
        box.draw();

        Counter counter = new Counter("hits");

        for (int i = 0; i < trials; i++) {
            double x = StdRandom.uniform(0.0, 1.0);
            double y = StdRandom.uniform(0.0, 1.0);
            Point2D p = new Point2D(x, y);
            if (box.contains(p)) {
                counter.increment();
            } else {
                p.draw();
            }
        }

        StdOut.println(counter);
        StdOut.printf("area = %2.2f\n", box.area());
    }
}
