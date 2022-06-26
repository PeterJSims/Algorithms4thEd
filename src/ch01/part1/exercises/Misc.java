package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Misc {

    public static void main(String[] args) {
//        ex5(0.3, 0.8);
//        ex5(0.3, 1.0);
    }


    public static void ex5(double x, double y) {
        StdOut.println(x > 0 && x < 1 && y > 0 && y < 1);
    }

    public static void ex6() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

}
