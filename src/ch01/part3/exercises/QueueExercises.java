package ch01.part3.exercises;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueExercises<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int n;

    private class Node {
        Item item;
        Node next;
    }


    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }

        n++;
    }


    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        Item item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) last = null;
        return item;
    }

    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return first.item;
    }

    public Item peekLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return last.item;
    }

    public Item[] toArray() {
        int size = n;
        Item[] arr = (Item[]) new Object[n];
        for (int i = 0; i < size; i++) {
            Item temp = this.dequeue();
            arr[i] = temp;
            this.enqueue(temp);
        }
        return arr;
    }


    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            if (current == null) {
                throw new NoSuchElementException("Queue is empty");
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
//        Queue<String> q = new Queue<>();
//        while (!StdIn.isEmpty()) {
//            String item = StdIn.readString();
//            if (!item.equals("-")) {
//                q.enqueue(item);
//            } else if (!q.isEmpty()) {
//                StdOut.print(q.dequeue() + " ");
//            }
//        }
//        StdOut.println("(" + q.size() + " left on queue)");

        QueueExercises<Integer> q = new QueueExercises<>();
        for (int i = 0; i < 10; i++) {
            q.enqueue(i * 2);
        }
        StdOut.println(Arrays.toString(q.toArray()));
        for (Integer n : q) StdOut.print(n + " ");

    }
}
