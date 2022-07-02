package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdDraw;

public class RightTriangle {

    public static void main(String[] args) {
        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.line(.3, .4, .5, .6);
        StdDraw.line(.3, .4, .5, .4);
        StdDraw.line(.5, .4, .5, .6);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.circle(.5, .4, .2);
    }
}
