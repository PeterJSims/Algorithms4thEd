package ch01.part5.notes;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UFWithQFind {
    private int[] id; // access to component id (site indexed)
    private int count; // number of components

    public UFWithQFind(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
        count = n; // initially, every item in array is its own component
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        return id[p];
    }

    public void union(int p, int q) { // join P and Q into Q's component
        int pID = find(p);
        int qID = find(q);

        // Nothing to do if p and q are already in the same component
        if (pID == qID) return;

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) id[i] = qID;
        }
        count--;

    }


    public static void main(String[] args) {
        // Solve dynamic connectivity problem on StdIn

        int n = StdIn.readInt(); // Read number of sites
        UFWithQFind uf = new UFWithQFind(n); // Initiate n components

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
