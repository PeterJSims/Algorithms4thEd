package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex8 {
    public static void main(String[] args) {
        StdOut.println('b'); // 'b' -- simply prints the char
        StdOut.println('b' + 'c'); // 197 -- addition does type conversion
        StdOut.println((char) ('a' + 4)); // 'e' => ('a' + 4) == 101 as 'a's int value is 97, char for 101 is 'e'
    }
}
