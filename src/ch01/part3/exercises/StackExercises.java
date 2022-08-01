package ch01.part3.exercises;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackExercises<T> implements Iterable<T> {
    private Node first;
    private int n;

    private class Node {
        T item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void push(T item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        n++;
    }

    public T peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack is currently empty");
        return first.item;
    }

    public void dup() {
        this.push(this.peek());
    }

    public void exch() {
        T one = this.pop();
        T two = this.pop();
        this.push(one);
        this.push(two);
    }

    public T pop() {
        T item = first.item;
        first = first.next;
        n--;
        return item;
    }

    public T[] multiPop(int k) {
        if (k > n) throw new NoSuchElementException("Not enough items on stack");
        T[] returnArr = (T[]) new Object[k];
        for (int i = 0; i < k; i++) {
            returnArr[i] = this.pop();
        }
        return returnArr;
    }


    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private Node current = first;
        private int itemCount = n;

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            if (current == null) {
                throw new NoSuchElementException("Stack is empty");
            }

            if (itemCount != n) throw new ConcurrentModificationException();

            T item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        StackExercises<String> stack = new StackExercises<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                StdOut.print(stack.pop() + " ");
            }
        }
        StdOut.println("(" + stack.size() + " left on stack)");
    }

}

