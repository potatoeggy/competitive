import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ccc09j5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> adj[] = new ArrayList[50];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		adj[1].add(6);adj[2].add(6);adj[3].add(4);adj[3].add(5);adj[3].add(6);
        adj[3].add(15);adj[4].add(3);adj[4].add(5);adj[4].add(6);adj[5].add(3);
        adj[5].add(3);adj[5].add(4);adj[5].add(6);adj[6].add(1);adj[6].add(2);
        adj[6].add(3);adj[6].add(4);adj[6].add(5);adj[6].add(7);adj[7].add(6);
        adj[7].add(8);adj[8].add(7);adj[8].add(9);adj[9].add(8);adj[9].add(10);
        adj[9].add(12);adj[10].add(9);adj[10].add(11);adj[11].add(10);
        adj[11].add(12);adj[12].add(9);adj[12].add(11);adj[12].add(13);
        adj[13].add(12);adj[13].add(14);adj[13].add(15);adj[14].add(13);
        adj[15].add(3);adj[15].add(13);adj[16].add(17);adj[16].add(18);
		adj[17].add(16);adj[17].add(18);adj[18].add(16);adj[18].add(17);
		
		String input = br.readLine();

		while (!input.equals("q")) {
			int x = Integer.parseInt(br.readLine());
			if (input.equals("n")) {
				System.out.println(adj[x].size());
			} else if (input.equals("f")) {
				int acc = 0;
				boolean[] visited = new boolean[adj.length];
				visited[x] = true;

				for (int i : adj[x]) {
					visited[i] = true;
				}

				for (int i : adj[x]) {
					for (int j : adj[i]) {
						if (!visited[j]) {
							visited[j] = true;
							acc++;
						}
					}
				}
				System.out.println(acc);
			} else if (input.equals("i")) {
				int temp = Integer.parseInt(br.readLine());
				if (! adj[x].contains(temp)) {
					adj[x].add(temp);
					adj[temp].add(x);
				}
			} else if (input.equals("d")) {
				int temp = Integer.parseInt(br.readLine());
				adj[x].remove(new Integer(temp));
				adj[temp].remove(new Integer(x));
			} else {
				int y = Integer.parseInt(br.readLine());
				Queue<Integer> q = new LinkedList<Integer>();
				boolean[] visited = new boolean[adj.length];
				int[] distance = new int[adj.length];

				visited[x] = true;
				boolean found = false;
				q.add(x);

				while (!q.isEmpty()) {
					int temp = q.poll();
					for (int i : adj[temp]) {
						if (!visited[i]) {
							visited[i] = true;
							distance[i] = distance[temp] + 1;
							q.add(i);
							if (i == y) {
								System.out.println(distance[i]);
								found = true;
								break;
							}
						}
					}
					if (found) {
						break;
					}
				}

				if (!found) {
					System.out.println("Not connected");
				}
			}

			input = br.readLine();
		}
	}
}