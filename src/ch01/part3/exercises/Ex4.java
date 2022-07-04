package ch01.part3.exercises;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex4 {
    // see Parenthesis.java

    public static void main(String[] args) {
        Parenthesis check = new Parenthesis();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            StdOut.println(check.checkParenthesis(s));
        }

    }
}
