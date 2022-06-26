package ch01.part3.notes;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListQueue<T> implements Iterable<T> {
    private Node first;
    private Node last;
    private int N;

    private class Node {
        Node next;
        T item;

        public Node(T item) {
            this.item = item;
            this.next = null;
        }
    }

    public LinkedListQueue() {
        this.N = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }


    public void enqueue(T item) {
        Node oldLast = last;
        last = new Node(item);
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        N++;
    }

    public T dequeue() {
        if (first == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        T item = first.item;
        first = first.next;
        N--;
        if (isEmpty()) {
            last = null;
        }
        return item;

    }

    public Iterator<T> iterator() {
        return new LinkedListQueueIterator();
    }

    private class LinkedListQueueIterator implements Iterator<T> {
        private Node current;

        public LinkedListQueueIterator() {
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
        LinkedListQueue<String> q = new LinkedListQueue<>();
        q.enqueue("hello");
        StdOut.println(q.dequeue());
        StdOut.println(q.isEmpty());
        StdOut.println(q.dequeue());
    }
}
