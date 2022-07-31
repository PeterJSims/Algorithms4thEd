package ch01.part3.exercises;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Ex5 {
    public static void main(String[] args) {
        // Mystery Method prints a binary string -- see ch1 Ex9 for a more robust implementation
    }

    public static void mysteryMethod(int n) {
        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }
        for (int d : stack) StdOut.print(d);
        StdOut.println();
    }
}
