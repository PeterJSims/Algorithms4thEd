package ch01.part3.exercises;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> {
    private Node head;
    private Node tail;
    private int size;


    private class Node {
        Node prev;
        Node next;
        Item item;

        public Node(Item item) {
            this.item = item;
        }
    }

    public Deque() {
        head = null;
        tail = null;
        size = 0;
    }


    // is the deque empty?
    public boolean isEmpty() {
        return head == null;
    }

    // return the number of items on the deque
    public int size() {
        return size;
    }

    // add the item to the front
    public void addFirst(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Provide an item to enqueue");
        }
        Node oldHead = head;
        head = new Node(item);
        head.next = oldHead;

        if (oldHead != null) {
            oldHead.prev = head;
        }
        if (size() == 0) {
            tail = head;
        }
        size++;

    }

    // add the item to the back
    public void addLast(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Provide an item to enqueue");
        }

        Node oldTail = tail;
        tail = new Node(item);
        tail.prev = oldTail;

        if (oldTail != null) {
            oldTail.next = tail;
        }
        if (size() == 0) {
            head = tail;
        }
        size++;


    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        Item item = head.item;
        size--;

        if (isEmpty()) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return item;
    }

    // remove and return the item from the back
    public Item removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        Item item = tail.item;
        size--;

        if (isEmpty()) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        return item;
    }

    public Iterator<Item> iterator() {
        return new DequeIterator();
    }

    private class DequeIterator implements Iterator<Item> {
        private Node current;

        private DequeIterator() {
            this.current = head;
        }

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more items to iterate");
            }
            Item item = current.item;
            current = current.next;
            return item;

        }

        public void remove() {
            throw new UnsupportedOperationException("remove() method not implemented");
        }
    }

}
