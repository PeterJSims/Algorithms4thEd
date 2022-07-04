package ch01.part3.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex14 {
    // see ResizingArrayQueueOfStrings.java
    public static void main(String[] args) {
        ResizingArrayQueueOfStrings q = new ResizingArrayQueueOfStrings();
        for (String s : "Hello world I am a string of words".split(" ")) {
            q.enqueue(s);
        }
        StdOut.println(q.size()); // 8
        StdOut.println(q.dequeue()); // Hello
        StdOut.println(q.dequeue()); // world
        StdOut.println(q.size()); // 6
    }
}
