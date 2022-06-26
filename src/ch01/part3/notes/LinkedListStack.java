package ch01.part3.notes;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListStack<T extends Comparable<T>> implements Iterable<T> {
    private Node first;
    private int N;
    private Stack<T> maxStack;
    private Stack<T> minStack;

    public LinkedListStack() {
        this.first = null;
        this.N = 0;
        this.maxStack = new Stack<>();
        this.minStack = new Stack<>();
    }

    private class Node {
        T item;
        Node next;

        public Node(T item) {
            this.item = item;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public int size() {
        return this.N;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow error");
        }
        return first.item;
    }

    public T max() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow error");
        }
        return maxStack.peek();
    }

    public T min() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow error");
        }
        return minStack.peek();
    }

    public void push(T item) {
        Node oldFirst = first;
        first = new Node(item);
        first.next = oldFirst;

        // Add either the new item or repeat the top item on the max stack
        if (N == 0) {
            maxStack.push(first.item);
            minStack.push(first.item);
        } else {
            if (first.item.compareTo(maxStack.peek()) > 0) {
                maxStack.push(first.item);
                minStack.push(minStack.peek());
            } else {
                maxStack.push(maxStack.peek());
                minStack.push(first.item);
            }
        }

        N++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow error");
        }
        T data = first.item;
        first = first.next;

        minStack.pop();
        maxStack.pop();

        N--;
        return data;
    }

    public void replaceAll(T from, T to) {
        Node temp = first;

        while (temp != null) {
            if (temp.item == from) {
                temp.item = to;
            }
            temp = temp.next;
        }
    }

    public void dup() {
        this.push(this.peek());
    }

    public void exch() {
        if (size() < 2) {
            throw new NoSuchElementException("Stack underflow error");
        }
        T oldTop = this.pop();
        T oldSecond = this.pop();
        this.push(oldTop);
        this.push(oldSecond);

    }


    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private Node current;

        public ListIterator() {
            this.current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            T data = current.item;
            current = current.next;
            return data;
        }
    }


    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(5);
        stack.replaceAll(5, 55);

        stack.exch();

        for (int i : stack) {
            StdOut.print(i + " ");
        }


    }

}
