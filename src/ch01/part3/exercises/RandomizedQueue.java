package ch01.part3.exercises;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private Item[] items;
    private int size;

    public RandomizedQueue() {
        this.items = (Item[]) new Object[4];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private int getRandomIndex() {
        return StdRandom.uniform(0, size);
    }

    private void resize(int capacity) {
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            copy[i] = items[i];
        }
        items = copy;
    }

    public void enqueue(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Please provide an item to enqueue");
        }
        if (size == items.length) {
            resize(2 * items.length);
        }
        items[size++] = item;

    }

    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int randomIndex = getRandomIndex();
        Item item = items[randomIndex];
        items[randomIndex] = items[size - 1];
        items[size - 1] = null;
        size--;

        if (size > 0 && size == items.length / 4) {
            resize(items.length / 2);
        }
        return item;
    }

    public Item sample() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return items[getRandomIndex()];
    }


    public Iterator<Item> iterator() {
        return new RandomQueueIterator();
    }

    private class RandomQueueIterator implements Iterator<Item> {
        private int current;

        private RandomQueueIterator() {
            this.current = 0;
        }

        public boolean hasNext() {
            return current != size;
        }

        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more items to iterate");
            }
            Item item = items[current];
            current++;
            return item;
        }


        public void remove() {
            throw new UnsupportedOperationException("remove() method not implemented");
        }
    }

    public static void main(String[] args) {
        RandomizedQueue<Integer> q = new RandomizedQueue<>();
        for (int i = 0; i < 10; i++) {
            q.enqueue(i);
        }
        for (int i : q) {
            StdOut.print(i + " ");
        }
        StdOut.println();
        // StdOut.println(q.size() + " ***");
        for (int i = 0; i < 10; i++) {
            StdOut.println(q.dequeue());
        }
    }
}
