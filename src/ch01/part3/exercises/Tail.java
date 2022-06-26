package ch01.part3.exercises;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Tail {

    public static void main(String[] args) {
        Stack<String> lines = new Stack<>();
        Stack<String> reverseStack = new Stack<>();

        while (!StdIn.isEmpty()) {
            String line = StdIn.readString();
            lines.push(line);
        }
        int count = Integer.parseInt(args[0]);
        for (int i = 0; i < count; i++) {
            reverseStack.push(lines.pop());
        }

        for (String s : reverseStack) {
            StdOut.println(s);
        }
    }
}
