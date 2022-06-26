package ch01.part3.notes;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FixedCapacityStack<T> implements Iterable<T> {
    private T a[];
    private int N;
    private int max;

    public FixedCapacityStack(int max) {
        this.a = (T[]) new Object[max];
        this.max = max;

    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean isFull() {
        return N == max;
    }

    public int size() {
        return N;
    }

    public void push(T item) {
        if (isFull()) {
            throw new StackOverflowError("Stack overflow");
        }
        a[N++] = item;
    }

    public T pop() {
        if (N <= 0) {
            throw new NoSuchElementException("Stack underflow");
        }
        return a[--N];
    }

    public Iterator<T> iterator() {
        return null;
    }

    public class StackIterator implements Iterator<T> {
        private int i;

        public StackIterator(int i) {
            this.i = N;
        }

        public boolean hasNext() {
            return i > 0;
        }

        public T next() {
            if (i == 0) {
                throw new NoSuchElementException();
            }
            return a[--i];
        }
    }


    public static void main(String[] args) {
        FixedCapacityStack<Integer> stack = new FixedCapacityStack<>(2);
        stack.push(5);
        stack.push(4);
//        stack.push(6);
    }
}
