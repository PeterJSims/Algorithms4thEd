package ch01.part3.notes;

import edu.princeton.cs.algs4.StdOut;

public class GenericBag<T> {
    private Node front;
    private int size;

    private class Node {
        T item;
        Node next;

        public Node(T item) {
            this.item = item;
        }
    }

    public GenericBag() {
        this.front = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void add(T item) {
        Node newNode = new Node(item);
        if (this.isEmpty()) {
            this.front = newNode;
        } else {
            Node temp = this.front;
            this.front = newNode;
            this.front.next = temp;
        }
        size++;
    }

    public static void main(String[] args) {
        GenericBag<Integer> bag = new GenericBag<>();
        StdOut.println(bag.size());
        bag.add(5);
        bag.add(5);
        bag.add(5);
        StdOut.println(bag.size());
        StdOut.println(bag.front.item);
    }
}
