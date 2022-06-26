package ch01.part3.notes;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayStack<T> implements Iterable<T> {
    private T[] a;
    private int N;

    // This variable is added for checking ConcurrentModificationException exceptions during For-Each iteration
    private int operations;

    public ArrayStack() {
        this.a = (T[]) new Object[1];
        this.N = 0;
        this.operations = 0;
    }

    public boolean isEmpty() {
        return this.N == 0;
    }

    public int size() {
        return this.N;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow error");
        }

        return a[N];
    }


    private void resize(int max) {
        T[] temp = (T[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(T item) {
        if (N == a.length) {
            resize(2 * a.length);
        }
        a[N++] = item;
        operations++;
    }

    public T pop() {
        T item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        operations++;
        return item;
    }


    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<T> {
        private int i;
        private int ops;

        public StackIterator() {
            this.i = N;
            this.ops = operations;
        }

        public boolean hasNext() {
            if (ops != operations) {
                throw new ConcurrentModificationException("No pushing/popping during iteration");
            }
            return i > 0;
        }

        public T next() {
            if (ops != operations) {
                throw new ConcurrentModificationException("No pushing/popping during iteration");
            }
            if (i == 0) {
                throw new NoSuchElementException();
            }
            return a[--i];
        }
    }
}
