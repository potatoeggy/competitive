import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class dmpg15s4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		ArrayList<Pair>[] adj = new ArrayList[nextInt()+1];
		int queries = nextInt();

		for (int i = 1; i < adj.length; i++) {
			adj[i].add() // they have coords
			// i don't wanna implement coords
			// abort abort
		}
	}

	static class Pair {
		int v, w;
		Pair(int v, int w) {
			this.v = v;
			this.w = w;
		}
	}
}