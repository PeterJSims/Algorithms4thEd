package ch01.part3.exercises;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex5 {

    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            int num = StdIn.readInt();
            printBinary(num);
        }
    }

    public static void printBinary(int n) {
        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }
        for (int i : stack) {
            StdOut.print(i);
        }
        StdOut.println();

    }

}
