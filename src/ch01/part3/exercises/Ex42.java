package ch01.part3.exercises;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Ex42<Item> extends Stack<Item> {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        Stack<Integer> newStack = new Ex42<>(stack);
        for (int i : newStack) {
            StdOut.println(i);
        }

    }

    public Ex42(Stack<Item> stack) {
        Stack<Item> temp = new Stack<>();

        for (Item item : stack) {
            temp.push(item);
        }

        for (Item item : temp) {
            push(item);
        }
    }
}
