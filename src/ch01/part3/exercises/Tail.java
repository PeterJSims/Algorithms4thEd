package ch01.part3.exercises;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Tail {

    public static void main(String[] args) {
        Stack<String> lines = new Stack<>();
        int k = Integer.parseInt(args[0]);

        while (!StdIn.isEmpty()) {
            lines.push(StdIn.readLine());
        }

        while (k > 0) {
            StdOut.println(lines.pop());
            k--;
        }
    }
}
