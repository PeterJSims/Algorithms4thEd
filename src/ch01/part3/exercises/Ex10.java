package ch01.part3.exercises;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex10 {
    public static void main(String[] args) {
        // ( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) ) == 1 2 + 3 4 - 5 6 - * *
        while (!StdIn.isEmpty()) {
            String infixString = StdIn.readLine();
            StdOut.println(infixToPostfix(infixString));
        }
    }

    public static String infixToPostfix(String rawString) {
        Stack<String> ops = new Stack<>();
        Stack<String> vals = new Stack<>();
        for (String s : rawString.split("\\s+")) {
            if (s.equals("(")) {
                continue;
            } else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("sqrt")) {
                ops.push(s);
            } else if (s.equals(")")) {
                String op = ops.pop();
                String rightValue = vals.pop();
                String leftValue = vals.pop();
                String subExpression = leftValue + " " + rightValue + " " + op;
                vals.push(subExpression);
            } else {
                vals.push(s);
            }
        }
        return vals.pop();
    }
}
