import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ccc16s3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int places = nextInt();
		ArrayList<Integer> phos = new ArrayList<Integer>();
		ArrayList<Integer>[] adj = new ArrayList[places];

		int phosPlaces = nextInt();

		for (int i = 0; i < phosPlaces; i++) {
			phos.add(nextInt());
		}

		for (int i = 0; i < places-1; i++) {
			int start = nextInt();
			int end = nextInt();
			adj[start].add(end);
			adj[end].add(start);
		}
	}
}