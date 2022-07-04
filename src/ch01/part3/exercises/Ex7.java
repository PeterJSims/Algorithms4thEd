package ch01.part3.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex7 {
    // see StackExercises
    public static void main(String[] args) {
        StackExercises<String> stack = new StackExercises<>();
        StdOut.println(stack.isEmpty());
        stack.push("a");
        StdOut.println(stack.peek());
        StdOut.println(stack.pop());

    }
}
