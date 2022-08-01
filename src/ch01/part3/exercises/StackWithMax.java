package ch01.part3.exercises;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.NoSuchElementException;

public class StackWithMax extends StackExercises<Integer> {
    private Stack<Integer> maxStack;

    public StackWithMax() {
        this.maxStack = new Stack<>();
    }

    public Integer pop() {
        int item = super.pop();
        maxStack.pop();
        return item;
    }

    public void push(int item) {
        super.push(item);
        if (maxStack.isEmpty()) maxStack.push(item);
        else maxStack.push(maxStack.peek() > item ? maxStack.peek() : item);
    }

    public int max() {
        if (maxStack.isEmpty()) throw new NoSuchElementException("Stack underflow error");
        return maxStack.peek();
    }

    public static void main(String[] args) {
        StackWithMax stack = new StackWithMax();
        for (int i = 0; i < 30; i++) {
            stack.push(StdRandom.uniform(100));
        }

        while (!stack.isEmpty()) {
            StdOut.println("Max Item: " + stack.max() + " Top of Stack: " + stack.pop());
        }
    }

}
