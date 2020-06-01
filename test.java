import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test {
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
    public static void main(String[] args) throws IOException {
        int nodes = readInt(), roads = readInt(), time = readInt();
        ArrayList<Integer>[] adj = new ArrayList[nodes+1];
        for (int i = 0; i < adj.length; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < roads; i++) {
            adj[readInt()].add(readInt());
        }
        int queries = readInt();
        int [][] ans = new int[nodes+1][nodes+1];
        for (int i = 1; i <= nodes; i++) {
            Arrays.fill(ans[i], Integer.MAX_VALUE);
            boolean[] visited = new boolean[nodes+1];
            ans[i][i] = 0;
            for (int count = 0; count < nodes; count++) {
                int min = Integer.MAX_VALUE, min_in = -1;
                for(int j = 0; j <= nodes; j++) {
                    if (!visited[j] && ans[i][j] <= min) {
                        min = ans[i][j];
                        min_in = j;
                    }
                }
                visited[min_in] = true;
                for (int j = 0; j < adj[min_in].size(); j++) {
                    if (!visited[adj[min_in].get(j)]) {
                        ans[i][adj[min_in].get(j)] = ans[i][min_in] + 1;
                    }
                }
            }
        }
        for (int i = 0; i < queries; i++) {
            int start = readInt(), end = readInt();
            if (ans[start][end] == Integer.MAX_VALUE) {
                System.out.println("Not enough hallways!");
            }
            else System.out.println(ans[start][end] * time);
        }
    }
}