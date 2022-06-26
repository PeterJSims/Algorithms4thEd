package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.math.BigInteger;

public class Ex19 {

    public static BigInteger fib(int n) {
        BigInteger current = BigInteger.ZERO;
        BigInteger nextNum = BigInteger.ONE;

        for (int i = 0; i < n; i++) {
            BigInteger temp = nextNum;
            nextNum = current.add(nextNum);
            current = temp;
        }
        return current;
    }

    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            int n = StdIn.readInt();
            StdOut.println(fib(n));
        }
    }
}
