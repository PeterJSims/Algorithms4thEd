package ch01.part3.exercises;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex9 {

    public static void main(String[] args) {
        // 1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) ) == ( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )

        while (!StdIn.isEmpty()) {
            String noLeftBracketExpression = StdIn.readLine();
            StdOut.println(addLeftBrackets(noLeftBracketExpression));
        }
    }

    public static String addLeftBrackets(String rawString) {
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
                String subExpression = "( " + leftValue + " " + op + " " + rightValue + " )";
                vals.push(subExpression);
            } else {
                vals.push(s);
            }
        }
        return vals.pop();
    }
}
