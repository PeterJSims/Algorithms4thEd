package ch01.part3.exercises;

import edu.princeton.cs.algs4.Stack;

public class Parenthesis {

    public boolean checkParenthesis(String s) {
        Stack<Character> left = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                left.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (left.isEmpty()) return false;
                char leftChar = left.pop();
                String joined = leftChar + "" + c;
                if (!joined.equals("()") && !joined.equals("[]") && !joined.equals("{}")) return false;
            }
        }
        return left.isEmpty();
    }
}
