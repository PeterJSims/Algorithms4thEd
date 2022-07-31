package ch01.part5.notes;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UFWithQUnion {
    private int[] id;
    private int count;

    public UFWithQUnion(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
        this.count = n;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }

    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j) return;
        id[i] = j;

        count--;
    }

    public int count() {
        return count;
    }


    public static void main(String[] args) {
        // Solve dynamic connectivity problem on StdIn

        int n = StdIn.readInt(); // Read number of sites
        UFWithQUnion uf = new UFWithQUnion(n); // Initiate n components

        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt(); // Read pair to connect

            if (uf.connected(p, q)) continue; // Ignore if connected
            uf.union(p, q); // Combine components
            StdOut.println(p + " " + q); // add print connection
        }
        StdOut.println(uf.count() + " components");
    }
}
