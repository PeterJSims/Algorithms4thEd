package ch01.part3.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex1 {
    // see FixedCapacityStackExercises
    public static void main(String[] args) {
        FixedCapacityStackExercises<Integer> stack = new FixedCapacityStackExercises<>(1);
        stack.push(1);
        // "is full" works
        StdOut.println(stack.isFull());
        // throws "successful" exception
//        stack.push(5);

    }
}
