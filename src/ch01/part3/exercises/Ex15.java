package ch01.part3.exercises;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.NoSuchElementException;

public class Ex15 {

    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        Stack<String> stack = new Stack();
        while (!StdIn.isEmpty()) {
            stack.push(StdIn.readString());
        }
        StdOut.println(getNthFromLastEntry(stack, k));


    }

    public static String getNthFromLastEntry(Stack<String> stack, int k) {
        if (k > stack.size()) {
            throw new NoSuchElementException("k is larger than stack size");
        }
        int n = k;
        while (n > 1) {
            stack.pop();
            n--;
        }
        return stack.pop();
    }
}
