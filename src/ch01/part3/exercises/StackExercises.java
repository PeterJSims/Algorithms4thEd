package ch01.part3.exercises;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackExercises<Item> implements Iterable<Item> {
    private Item a[];
    private int n;
    private int operations;

    public StackExercises() {
        this.a = (Item[]) new Object[1];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    private void resize(int newMax) {
        Item[] newArr = (Item[]) new Object[newMax];
        for (int i = 0; i < n; i++) {
            newArr[i] = a[i];
        }
        a = newArr;
    }


    public void push(Item item) {
        if (n == a.length) resize(2 * a.length);
        a[n++] = item;
        operations++;
    }

    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow error");
        }
        return a[n - 1];
    }

    public Item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow error");
        }
        Item item = a[--n];
        a[n] = null;
        if (n > 0 && a.length == n / 4) resize(a.length / 2);
        operations++;
        return item;
    }

    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Item> {
        int i = n - 1;
        int parentOperations = operations;

        public boolean hasNext() {
            if (parentOperations != operations) {
                throw new ConcurrentModificationException("Collection was edited during iteration");
            }
            return i >= 0;
        }

        public Item next() {
            if (i < 0) {
                throw new NoSuchElementException();
            }
            if (parentOperations != operations) {
                throw new ConcurrentModificationException("Collection was edited during iteration");
            }
            return a[i--];
        }
    }


}
