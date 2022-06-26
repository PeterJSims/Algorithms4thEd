package ch01.part2.notes;

public class Counter {
    private String id;
    private int tally;

    public Counter(String id) {
        this.id = id;
        this.tally = 0;
    }

    public void increment() {
        tally++;
    }

    public String getId() {
        return this.id;
    }

    public int tally() {
        return tally;
    }

    public String toString() {
        return this.id + ": " + this.tally;
    }
}
