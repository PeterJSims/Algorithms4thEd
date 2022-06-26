package ch01.part3.exercises;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Ex6 {

    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        Stack<String> stack = new Stack<>();
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");


        while (!q.isEmpty()) {
            stack.push(q.dequeue());
        }

        while (!stack.isEmpty()) {
            q.enqueue(stack.pop());
        }

        for (String s : q) {
            StdOut.print(s + " ");
        }


    }
}
