package ch01.part3.notes;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class DijkstraTwoStack {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        String OPERATORS = "+-*/sqrt";
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("(")) {
                continue;
            } else if (OPERATORS.contains(s)) {
                ops.push(s);
            } else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) {
                    v = vals.pop() + v;
                } else if (op.equals("-")) {
                    v = vals.pop() - v;
                } else if (op.equals("*")) {
                    v = vals.pop() * v;
                } else if (op.equals("/")) {
                    v = vals.pop() / v;
                } else if (op.equals("sqrt")) {
                    v = Math.sqrt(v);
                }
                vals.push(v);
            } else {
                vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }

}
