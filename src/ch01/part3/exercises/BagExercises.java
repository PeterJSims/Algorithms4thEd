package ch01.part3.exercises;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BagExercises<T> implements Iterable<T> {
    T[] items;
    int n;

    public BagExercises() {
        items = (T[]) new Object[4];
    }

    private void resize(int s) {
        T[] newArr = (T[]) new Object[s];
        for (int i = 0; i < n; i++) {
            newArr[i] = items[i];
        }
        items = newArr;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void add(T item) {
        if (n == items.length) resize(items.length * 2);
        items[n++] = item;
    }


    public Iterator<T> iterator() {
        return new randomBagIterator();
    }

    private class randomBagIterator implements Iterator<T> {
        int pointer = n;

        public boolean hasNext() {
            return pointer > 0;
        }

        public T next() {
            if (pointer == 0) {
                throw new NoSuchElementException("Bag is empty");
            }
            int randomIndex = StdRandom.uniform(pointer);
            T temp = items[randomIndex];
            items[randomIndex] = items[pointer - 1];
            items[pointer - 1] = temp;
            return items[--pointer];
        }
    }

    public static void main(String[] args) {
        BagExercises<Integer> bag = new BagExercises<>();
        for (int i = 0; i < 50; i++) {
            bag.add(i);
        }
        for (int i : bag) StdOut.print(i + " ");


    }
}
