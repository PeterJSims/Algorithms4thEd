package ch01.part3.exercises;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Palindrome {

    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            StdOut.println(verifyPalindrome(s));
        }
    }

    public static boolean verifyPalindrome(String s) {
        Stack<Character> chars = new Stack<>();
        s = s.replaceAll("\\s", "");
        for (int i = 0; i < s.length(); i++) {
            chars.push(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (!chars.pop().equals(s.charAt(i))) {
                return false;
            }
        }


        return true;
    }
}
