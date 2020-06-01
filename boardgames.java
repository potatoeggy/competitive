import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class boardgames {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int n = nextInt();
		int m = nextInt();

		int[] distance = new int[10000001];
		boolean[] visited = new boolean[distance.length];

		Queue<Integer> q = new LinkedList<Integer>();

		q.add(n);
		distance[n] = 0;
		visited[n] = true;

		boolean found = false;

		while (! q.isEmpty()) {
			int hold = q.poll();

			if (hold < m) {
				for (int i : new int[] {3 * hold, hold - 1, hold - 3}) {
					if (i > 0 && i < distance.length) {
						if (! visited[i]) {
							distance[i] = distance[hold] + 1;
							visited[i] = true;
							q.add(i);
							if (i == m) {
								found = true;
								break;
							}
						}
					}
				}
			} else {
				for (int i : new int[] {hold - 1, hold - 3, (hold % 2 == 0 ? hold / 2 : hold)}) {
					if (! visited[i]) {
						distance[i] = distance[hold] + 1;
						visited[i] = true;
						q.add(i);
						if (i == m) {
							found = true;
						}
					}
				}
			}

			if (found) {
				break;
			}
		}

		System.out.println(distance[m]);
	}
}
