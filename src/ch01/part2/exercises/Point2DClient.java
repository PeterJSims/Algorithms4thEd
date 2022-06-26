package ch01.part2.exercises;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Point2DClient {

    public static void minDist(int N) {

        // draw points
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.1);
        Point2D[] points = new Point2D[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point2D(StdRandom.uniform(), StdRandom.uniform());
            points[i].draw();
        }
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setPenRadius(0.005);
        double minDist = Double.MAX_VALUE;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                Point2D pointI = points[i];
                Point2D pointJ = points[j];
                double dis = pointJ.distanceTo(pointI);
                pointJ.drawTo(pointI);

                // draw distance
                StdDraw.text((pointJ.x() + pointI.x()) / 2, (pointJ.y() + pointI.y()) / 2, String.format("%.3f", dis));

                //
                StdOut.printf("%d %d %.3f\n", i, j, dis);
                if (dis < minDist) {
                    minDist = dis; // min distance
                }
            }
        }
        StdOut.printf("Min distance is %.3f\n", minDist);
    }

}
