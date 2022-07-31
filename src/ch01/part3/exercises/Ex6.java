package ch01.part3.exercises;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Ex6 {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        for (int i = 0; i < 5; i++) {
            q.enqueue(i);
        }
        for (int i : q) StdOut.print(i + " ");
        StdOut.println();

        queueReverse(q);
        for (int i : q) StdOut.print(i + " ");


    }

    public static <T> void queueReverse(Queue<T> q) {
        Stack<T> stack = new Stack<>();
        while (!q.isEmpty()) stack.push(q.dequeue());
        while (!stack.isEmpty()) q.enqueue(stack.pop());
    }
}
