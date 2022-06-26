package ch01.part3.exercises;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Parentheses {

    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            String userString = StdIn.readString();
            StdOut.println(validateParentheses(userString));
        }

    }

    public static boolean validateParentheses(String s) {
        Stack<Character> leftBrackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                leftBrackets.push(s.charAt(i));
            } else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if (leftBrackets.isEmpty()) {
                    return false;
                }
                char l = leftBrackets.pop();
                char r = s.charAt(i);
                String joined = l + "" + r;
                if (!joined.equals("()") && !joined.equals("[]") && !joined.equals("{}")) {
                    return false;
                }
            }
        }
        return leftBrackets.isEmpty();


    }


}
