
import java.util.*;

public class Stringchanging {

    static class Graph {
        int V;
        List<Integer>[] adj;
        int[] in;

        public Graph(int V) {
            this.V = V;
            adj = new ArrayList[V];
            in = new int[V];
            for (int i = 0; i < V; i++) {
                adj[i] = new ArrayList<>();
                in[i] = 0;
            }
        }

        void addEdge(int v, int w) {
            adj[v].add(w);
            in[w]++;
        }

        boolean isEulerianCycle() {
            if (!isSC()) return false;
            for (int i = 0; i < V; i++) {
                if (adj[i].size() != in[i]) return false;
            }
            return true;
        }

        boolean isSC() {
            boolean[] visited = new boolean[V];
            DFSUtil(0, visited);
            for (int i = 0; i < V; i++) {
                if (!visited[i]) return false;
            }
            return true;
        }

        void DFSUtil(int v, boolean[] visited) {
            visited[v] = true;
            for (int neighbor : adj[v]) {
                if (!visited[neighbor]) {
                    DFSUtil(neighbor, visited);
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] input = {"abc", "efg", "cde", "ghi", "ija"};
        int n = input.length;

     
        Graph g = new Graph(26);

       
        for (String str : input) {
            int firstChar = str.charAt(0) - 'a';
            int lastChar = str.charAt(str.length() - 1) - 'a';
            g.addEdge(firstChar, lastChar);
        }
        if (g.isEulerianCycle()) {
            System.out.println("Output: Yes, the given strings can be chained.");
        } else {
            System.out.println("Output: No, the given strings cannot form a circle.");
        }
    }
}
