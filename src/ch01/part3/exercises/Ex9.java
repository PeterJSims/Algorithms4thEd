package ch01.part3.exercises;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Ex9 {

    public static void main(String[] args) {
        // 1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) ) == ( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )

//        while (!StdIn.isEmpty()) {
//            String noLeftBracketExpression = StdIn.readLine();
        String noLeftBracketExpression = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        StdOut.println(addLeftBrackets(noLeftBracketExpression));
//        }
    }

    public static String addLeftBrackets(String expression) {
        Stack<String> ops = new Stack<>();
        Stack<String> values = new Stack<>();
        for (String s : expression.split("")) {
            if (s.equals("(")) continue; // skipping left brackets since we need to construct ALL of them

            else if ("+-*/".indexOf(s) != -1) {
                ops.push(s);
            } else if (s.equals(")")) {
                String op = ops.pop();
                String rightValue = values.pop();
                String leftValue = values.pop();
                String subExpression = "( " + leftValue + " " + op + " " + rightValue + " )";
                values.push(subExpression);
            } else if (!s.equals(" ")) {
                values.push(s);
            }

        }
        return values.pop();

    }
}
