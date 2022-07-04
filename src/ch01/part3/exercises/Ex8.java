package ch01.part3.exercises;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex8 {
    public static void main(String[] args) {
        // it was - the best - of times - - - it was - the - -
        // remaining : 'it' - 1 item
        StackExercises<String> stack = new StackExercises<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        for (String s : stack) {
            StdOut.print(s + " ");
        }
        StdOut.print("\n Total items: " + stack.size());
    }
}
