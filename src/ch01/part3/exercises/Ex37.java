package ch01.part3.exercises;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

public class Ex37 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        StdOut.println(josephus(m, n));

    }

    public static String josephus(int m, int n) {

        Queue<Integer> queue = new Queue<>();
        for (int i = 0; i < n; i++)
            queue.enqueue(i);
        String josephusAnswer = "";
        while (!queue.isEmpty()) {
            for (int i = 0; i < m - 1; i++)
                queue.enqueue(queue.dequeue());
            josephusAnswer += (queue.dequeue() + " ");
        }
        return josephusAnswer;
    }
}
