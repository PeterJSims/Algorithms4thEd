package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex7 {

    public static void main(String[] args) {
        printA(); // 3.00009
        printB(); // 499500
        printC(); // 10000
    }

    public static void printA() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > 0.001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);
    }

    public static void printB() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

    public static void printC() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

}
