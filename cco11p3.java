import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// cycle detector?
public class cco11p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		ArrayList<Integer>[] team1 = new ArrayList[nextInt()+1];
		ArrayList<Integer>[] team2 = new ArrayList[nextInt()+1];
		for (int i = 0; i < team1.length; i++) {
			team1[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < team2.length; i++) {
			team2[i] = new ArrayList<Integer>();
		}

		int times = nextInt();

		for (int i = 0; i < times; i++) {
			int t1 = nextInt();
			int t2 = nextInt();
			team1[t1].add(t2);
			team2[t2].add(t1);
		}
	}
}