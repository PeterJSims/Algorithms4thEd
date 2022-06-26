package ch01.part3.exercises;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

public class Josephus {
    public static void main(String[] args) {


        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        Queue<Integer> q = new Queue<>();
        for (int i = 0; i < n; i++) {
            q.enqueue(i);
        }

        while (!q.isEmpty()) {
            for (int i = 0; i < m - 1; i++) {
                q.enqueue(q.dequeue());
            }
            StdOut.print(q.dequeue() + " ");
        }
    }

}
