import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ccc06s4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer>[] adj = new ArrayList[8];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}

		adj[1].add(7);
		adj[1].add(4);
		adj[2].add(1);
		adj[3].add(4);
		adj[3].add(5);

		int ux = Integer.parseInt(br.readLine());
		int uy = Integer.parseInt(br.readLine());

		while (ux != 0) {
			adj[ux].add(uy);
			ux = Integer.parseInt(br.readLine());
			uy = Integer.parseInt(br.readLine());
		}

		Queue<Integer> q = new LinkedList<Integer>();
		boolean[] visited = new boolean[adj.length];
		boolean[] localVisited = new boolean[adj.length];
		
		ArrayList<Integer> sorted = new ArrayList<Integer>();

		boolean failed = false;
		for (int i = adj.length-1; i >= 1; i--) {
			if (!visited[i]) {
				if (!dfs(adj, sorted, visited, localVisited, i)) {
					failed = true;
					break;
				}
			}
		}

		if (failed) {
			System.out.println("Cannot complete these tasks. Going to bed.");
		} else {
			for (int i : sorted) {
				System.out.print(i + " ");
			}
		}
	}

	static boolean dfs(ArrayList<Integer>[] adj, ArrayList<Integer> sorted, boolean[] visited, boolean[] localVisited, int i) {
		if (visited[i]) {
			return true;
		}

		if (localVisited[i]) {
			return false;
		}

		localVisited[i] = true;

		boolean failed = false;
		for (int j : adj[i]) {
			if (!dfs(adj, sorted, visited, localVisited, j)) {
				return false;
			}
		}
		localVisited[i] = false;
		visited[i] = true;
		sorted.add(0, i);
		return true;
	}
}