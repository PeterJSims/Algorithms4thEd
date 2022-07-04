package ch01.part3.exercises;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex5 {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            int num = StdIn.readInt();
            printBinaryRepresentation(num);
        }
    }

    public static void printBinaryRepresentation(int n) {
        Stack<Integer> stack = new Stack<>();

        // Accounting for negative numbers
        int absNum = Math.abs(n);
        while (absNum > 0) {
            stack.push(absNum % 2);
            absNum = absNum / 2;
        }
        // Printing a number to represent negative or positive in binary
        if (n > 0) {
            StdOut.print(0);
        } else {
            StdOut.print(1);
        }
        ;
        // Providing a representation for if n == 0
        if (n == 0) StdOut.print(0);

        for (int d : stack) {
            StdOut.print(d);
        }
        StdOut.println();
    }

}
