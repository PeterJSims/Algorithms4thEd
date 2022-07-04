package ch01.part3.exercises;

import java.util.NoSuchElementException;

public class FixedCapacityStackExercises<Item> {
    private Item[] a;
    private int n;

    public FixedCapacityStackExercises(int capacity) {
        a = (Item[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public boolean isFull() {
        return a.length == n;
    }

    public int size() {
        return n;
    }

    public void push(Item item) {
        if (isFull()) {
            throw new StackOverflowError("Stack overflow error - stack is full");
        }
        a[n++] = item;
    }

    public Item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow error - stack is empty");
        }
        return a[--n];
    }

    public static void main(String[] args) {
//        FixedCapacityStackExercises<String> stack = new FixedCapacityStackExercises<>(100);
//
//        while (!StdIn.isEmpty()) {
//            String item = StdIn.readString();
//            if (!item.equals("-")) {
//                stack.push(item);
//            } else if (!stack.isEmpty()) {
//                StdOut.print(stack.pop() + " ");
//            }
//        }
//        StdOut.println("(" + stack.size() + " left on stack)");

    }
}
