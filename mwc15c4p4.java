import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class mwc15c4p4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int people = nextInt();
		ArrayList<Integer>[] list = new ArrayList[people + 1];
		boolean[] visited = new boolean[list.length];
		for (int i = 0; i < list.length; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < people; i++) {
			list[nextInt()].add(nextInt());
		}

		int biggest = nextInt();
		int smallest = nextInt();
		visited[biggest] = true;
		dfs(biggest, visited, list);

		if (! visited[smallest]) {
			visited = new boolean[list.length];
			dfs(smallest, visited, list);
			System.out.println(visited[biggest] ? "Tangled" : "Not Tangled");
		} else {
			System.out.println("Tangled");
		}
	}

	static void dfs(int x, boolean[] visited, ArrayList<Integer>[] list) {
		if (list[x].size() > 0) {
			for (int i : list[x]) {
				if (! visited[i]) {
					visited[i] = true;
					dfs(i, visited, list);
				}
			}
		}
	}
}
