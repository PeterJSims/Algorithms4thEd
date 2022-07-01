package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex9 {
    //Translate an int to a binary string -- accounts for 0 and negatives

    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            int n = StdIn.readInt();
            String result = intToBinaryString(n);
            StdOut.println(n + " in binary:  " + result);
        }
    }

    public static String intToBinaryString(int n) {
        String s = "";
        int absN = Math.abs(n);

        for (int k = absN; k > 0; k /= 2) {
            s = (k % 2) + s;
        }

        if (n < 0) {
            s = "1" + s;
        } else {
            s = "0" + s;
        }
        return s;
    }
}
