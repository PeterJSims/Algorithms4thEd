package ch01.part3.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex1 {
    public static void main(String[] args) {
//        see FixedCapacityStackExercises for isFull() method
        FixedCapacityStackExercises<Integer> fixedNumStack = new FixedCapacityStackExercises<>(4);
        for (int i = 0; i < 4; i++) {
            fixedNumStack.push(i);
        }
        StdOut.println(fixedNumStack.size());
        StdOut.println(fixedNumStack.isFull());
        fixedNumStack.push(5);
    }
}
