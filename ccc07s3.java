import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ccc07s3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int students = nextInt();
		ArrayList<Integer>[] array = new ArrayList[10000];

		for (int i = 0; i < array.length; i++) {
			array[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < students; i++) {
			array[nextInt()].add(nextInt());
		}

		int start = nextInt();
		int end = nextInt();

		while (start != 0) {
			boolean[] visited = new boolean[array.length];
			visited[start] = true;
			int temp = dfs(visited, array, start, end);
			System.out.println(temp == -1 ? "No" : "Yes " + temp);
			start = nextInt();
			end = nextInt();
		}
	}

	static int dfs(boolean[] visited, ArrayList<Integer>[] array, int start, int end) {
		for (int i : array[start]) {
			if (!visited[i]) {
				visited[i] = true;
				if (i == end) {
					return 0;
				}
				int temp = dfs(visited, array, i, end);
				if (temp >= 0) {
					return temp + 1;
				}
			}
		}

		return -1;
	}
}