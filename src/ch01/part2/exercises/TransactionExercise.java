package ch01.part2.exercises;

import edu.princeton.cs.algs4.StdOut;

import java.util.Objects;

public class TransactionExercise {
    // Ex 13 and Ex 14
    private final String who;
    private final SmartDate when;
    private final double amount;

    public TransactionExercise(String who, SmartDate when, double amount) {
        this.who = who;
        this.when = new SmartDate(when.month(), when.day(), when.year());
        this.amount = amount;
    }

    public String who() {
        return who;
    }

    public SmartDate when() {
        return new SmartDate(when.month(), when.day(), when.year());
    }

    public double amount() {
        return amount;
    }

    public String toString() {
        return who + " " + when + " " + amount;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionExercise that = (TransactionExercise) o;
        return amount == that.amount && Objects.equals(who, that.who) && Objects.equals(when, that.when);
    }

    public int hashCode() {
        return Objects.hash(who, when, amount);
    }

    public static void main(String[] args) {
        String who = "Bob";
        SmartDate when = new SmartDate(3, 3, 2022);
        double amount = 55.40;
        TransactionExercise transaction = new TransactionExercise(who, when, amount);
        StdOut.println(transaction);


    }
}
