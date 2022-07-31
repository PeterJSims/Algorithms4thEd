package ch01.part3.exercises;


import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Ex12 {

    public static void main(String[] args) {
        Stack<Integer> firstStack = new Stack<>();
        for (int i = 0; i < 8; i++) {
            firstStack.push(i);
        }
        Stack<Integer> newStack = copyStack(firstStack);
        for (int i : firstStack) {
            StdOut.println(i);
        }
        StdOut.println("***");
        for (int i : newStack) {
            StdOut.println(i);
        }

    }

    public static Stack<Integer> copyStack(Stack<Integer> original) {
        Stack<Integer> newStack = new Stack<>();
        Stack<Integer> tempReverse = new Stack<>();
        for (int i : original) {
            tempReverse.push(i);
        }
        for (int i : tempReverse) {
            newStack.push(i);
        }
        return newStack;
    }


}
