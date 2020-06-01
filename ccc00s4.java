import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ccc00s4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int target = Integer.parseInt(br.readLine());
		int[] clubs = new int[Integer.parseInt(br.readLine())];

		for (int i = 0; i < clubs.length; i++) {
			clubs[i] = Integer.parseInt(br.readLine());
		}

		int[] distance = new int[target+1];
		boolean[] visited = new boolean[target+1];

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);

		boolean found = false;
		while (! q.isEmpty()) {
			int x = q.poll();

			for (int i : clubs) {
				if (x+i < visited.length){
					if (!visited[x+i]) {
						visited[x+i] = true;
						distance[x+i] = distance[x] + 1;
						if (x+i == target) {
							found = true;
							break;
						}
						q.add(x+i);
					}
				}
			}
			if (found) {
				break;
			}
		}
		System.out.println(visited[target] ? "Roberta wins in " + distance[target] + " strokes." : "Roberta acknowledges defeat.");
	}
}