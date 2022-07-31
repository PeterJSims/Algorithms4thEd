package ch01.part3.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex7 {
    public static void main(String[] args) {
        // see StackExercises for .peek() method implementation
        StackExercises<Integer> stack = new StackExercises<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        StdOut.println(stack.peek());
        while (!stack.isEmpty()) stack.pop();

        StdOut.println(stack.peek()); // throws error as expected

    }
}
