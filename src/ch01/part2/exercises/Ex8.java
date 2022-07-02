package ch01.part2.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex8 {
    public static void main(String[] args) {
        //This swaps the two arrays via references to their memory addresses
        int[] a = new int[5];
        int[] b = new int[7];
        int[] t = a;
        a = b;
        b = t;
        StdOut.println(a.length == 7);
        StdOut.println(b.length == 5);


    }
}
