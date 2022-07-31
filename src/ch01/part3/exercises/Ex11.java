package ch01.part3.exercises;


import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex11 {
    public static void main(String[] args) {
        // 1 2 + 3 4 - 5 6 - * * == ( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) ) == 3
        while (!StdIn.isEmpty()) {
            String postfixString = StdIn.readLine();
            StdOut.println(evaluatePostfix(postfixString));
        }
    }

    public static int evaluatePostfix(String postfix) {
        Stack<Integer> values = new Stack<>();

        for (String s : postfix.split("\\s+")) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int operand2 = values.pop();
                int operand1 = values.pop();
                int result = 0;
                if (s.equals("+")) {
                    result = operand1 + operand2;
                } else if (s.equals("-")) {
                    result = operand1 - operand2;
                } else if (s.equals("*")) {
                    result = operand1 * operand2;
                } else if (s.equals("/")) {
                    result = operand1 / operand2;
                }
                values.push(result);
            } else {
                values.push(Integer.parseInt(s));
            }
        }
        return values.pop();
    }
}

