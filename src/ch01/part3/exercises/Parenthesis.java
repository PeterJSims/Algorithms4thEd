package ch01.part3.exercises;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Parenthesis {

    public static void takeAndCheckParenthesis() {
        StdOut.println("Please enter your parenthesis strings:");
        while (!StdIn.isEmpty()) {
            String parenthesis = StdIn.readLine();
            String isBalancedResponse = validateParenthesis(parenthesis) ? "is" : "is *not*";
            StdOut.println("Your string " + isBalancedResponse + " a balanced string of parenthesis.");
        }
    }

    public static boolean validateParenthesis(String p) {
        Stack<Character> leftBrackets = new Stack<>();
        for (char c : p.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') leftBrackets.push(c);
            else if (c == ')' || c == '}' || c == ']') {
                if (leftBrackets.isEmpty()) return false;
                char left = leftBrackets.pop();
                String pair = left + "" + c;
                if (!pair.equals("()") && !pair.equals("{}") && !pair.equals("[]")) {
                    return false;
                }
            }
        }
        return leftBrackets.isEmpty();
    }

    public static void main(String[] args) {
        takeAndCheckParenthesis();
    }
}
