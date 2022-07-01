package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

import java.math.BigInteger;

public class Ex19 {

    public static void main(String[] args) {
//        for (int i = 0; i < 90; i++) {
//            StdOut.println(i + " " + badFibonacci(i));
//        }
//        for (int i = 0; i < 20; i++) {
//            StdOut.println(i + " " + goodFibonacci(i));
//        }
        for (int i = 0; i < 90; i++) {
            StdOut.println(i + " " + bestFibonacci(i));
        }

    }

    public static long badFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return badFibonacci(n - 1) + badFibonacci(n - 2);
    }

    public static long goodFibonacci(int n) {
        long previous = 0;
        long next = 1;
        for (int i = 0; i < n; i++) {
            long temp = previous;
            previous = next;
            next = temp + next;
        }
        return previous;
    }


    public static BigInteger bestFibonacci(int n) {
        BigInteger previous = BigInteger.ZERO;
        BigInteger next = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            BigInteger temp = previous;
            previous = next;
            next = temp.add(next);
        }
        return previous;
    }
}
