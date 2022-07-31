package ch01.part5.notes;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UFWithWeightedQUnion {
    private int[] id;
    private int[] sz;
    private int count;

    public UFWithWeightedQUnion(int n) {
        id = new int[n];
        sz = new int[n];
        count = n;
        // initialize id array's values to i and sz's values to 1
        for (int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }
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
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }

    public int count() {
        return count;
    }

    public static void main(String[] args) {
        // Solve dynamic connectivity problem on StdIn

        int n = StdIn.readInt(); // Read number of sites
        UFWithWeightedQUnion uf = new UFWithWeightedQUnion(n); // Initiate n components

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

