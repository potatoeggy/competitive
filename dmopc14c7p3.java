import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class dmopc14c7p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int[] shells = new int[1000000];
		int idNum = nextInt();
		Set<Integer> ids = new HashSet<Integer>();

		int acc = 0;

		int right = nextInt();
		int left = nextInt();
		for (int i = 0; i < right+left; i++) {
			int temp = nextInt();
			shells[temp]++;
			ids.add(temp); 
		}

		Iterator<Integer> i = ids.iterator();
		while (i.hasNext()) {
			if (shells[i.next()] != 2) {
				acc++;
			}
		}

		System.out.println(idNum-ids.size()+acc);
	}
}