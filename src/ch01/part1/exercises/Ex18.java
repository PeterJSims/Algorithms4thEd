package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex18 {
    public static void main(String[] args) {
        StdOut.println(mystery1(3, 4));
        StdOut.println(mystery2(10, 3));
    }

    public static int mystery1(int a, int b) {
        //Multiplication!
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery1(a + a, b / 2);
        return mystery1(a + a, b / 2) + a;
    }

    public static int mystery2(int a, int b) {
        //Exponents!
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery1(a * a, b / 2);
        return mystery1(a * a, b / 2) * a;
    }

}
