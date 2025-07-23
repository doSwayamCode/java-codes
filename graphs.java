import java.util.ArrayList;

public class graphs {
    public static void main(String[] args) {
        int v =5;
        int e = 10;

        int a [][] = new int [v+1][v+1];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<Integer>());
        }
    }

    static void addEdge(int source, int destination, int[][] a) {
        a[source][destination] = 1;
        a[destination][source] = 1; // For undirected graph
    }
    static void addEdge(int source, int destination, ArrayList<ArrayList<Integer>> adj) {
        adj.get(source).add(destination);
        adj.get(destination).add(source); // For undirected graph
    }
}
