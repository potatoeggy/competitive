import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ccc01s3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		ArrayList<Integer>[] adj = new ArrayList[26];

		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}

		ArrayList<Integer> tx = new ArrayList<Integer>();
		ArrayList<Integer> ty = new ArrayList<Integer>();
		while (input[0] != '*') {
			tx.add((int)input[0]-65);
			ty.add((int)input[1]-65);
			adj[(int)input[0]-65].add((int)input[1]-65);
			adj[(int)input[1]-65].add((int)input[0]-65);
			input = br.readLine().toCharArray();
		}

		int paths = 0;
		for (int i = 0; i < tx.size(); i++) {
			if (bfs(adj, tx.get(i), ty.get(i))) {
				System.out.println((char) ((int) tx.get(i) + 65) + "" + (char) ((int) ty.get(i) + 65));
				paths++;
			}
		}

		System.out.println("There are " + paths + " disconnecting roads.");
	}

	static boolean bfs(ArrayList<Integer>[] adj, int omitX, int omitY) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean[] visited = new boolean[adj.length];
		q.add(0);
		visited[0] = true;

		while (!q.isEmpty()) {
			int x = q.poll();
			for (int y : adj[x]) {
				if (!visited[y]) {
					if (!(x == omitX && y == omitY || x == omitY && y == omitX)) {
						visited[y] = true;
						q.add(y);
					}
				}
			}
		}
		return !visited[1];
	}
}