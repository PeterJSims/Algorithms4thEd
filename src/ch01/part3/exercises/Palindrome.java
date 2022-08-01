package ch01.part3.exercises;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Palindrome {

    public static void main(String[] args) {
        StdOut.println("Input strings to determine if they are a palindrome: ");

        while (!StdIn.isEmpty()) {
            String s = StdIn.readLine();
            StdOut.println("This string is " + (isPalindrome(s) ? "" : "not ") + "a palindrome.");
        }
    }

    public static boolean isPalindrome(String s) {
        Stack<Character> rightToLeft = new Stack<>();
        Queue<Character> leftToRight = new Queue<>();
//        int half = s.length() / 2; // how to determine without stripping whitespace/punctuation first

        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                rightToLeft.push(c);
                leftToRight.enqueue(c);
            }
        }
        while (!rightToLeft.isEmpty()) {
            if (!rightToLeft.pop().equals(leftToRight.dequeue())) return false;
        }

        return true;
    }
}
