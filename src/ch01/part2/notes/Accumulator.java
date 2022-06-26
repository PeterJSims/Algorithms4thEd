package ch01.part2.notes;

public class Accumulator {
    private double sum;
    private int n;

    public void addDataValue(double value) {
        n++;
        sum += value;
    }

    public double mean() {
        return sum / n;
    }

    @Override
    public String toString() {
        String s = "Mean (" + n + " values): ";
        return s + String.format("%7.5f", mean());
    }
}
