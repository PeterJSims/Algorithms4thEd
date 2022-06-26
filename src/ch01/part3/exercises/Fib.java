package ch01.part3.exercises;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

public class Fib {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.enqueue(0);
        q.enqueue(1);

        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            int a = q.dequeue();
            int b = q.dequeue();
            q.enqueue(b);
            q.enqueue(a + b);
//            System.out.println(a);
        }
        StdOut.println(q.dequeue());
    }
}
