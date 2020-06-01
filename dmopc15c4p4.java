import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class dmopc15c4p4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int[] array = new int[nextInt()+1];
		List<Integer> numArray = new ArrayList<Integer>();
		int max = nextInt();
		int queries = nextInt();

		for (int i = 1; i < array.length; i++) {
			int temp = nextInt();
			array[i] = array[i-1] + temp;
			numArray.add(temp);
		}

		for (int i = 0; i < queries; i++) {
			int a = nextInt();
			int b = nextInt();
			int x = nextInt();
			int y = nextInt();

			// binary search through SUBSEQUENCE not whole thing
			boolean yay = true;

			if (array[y] - array[x-1] <= max) {
				System.out.println("oopsie");
				yay = false;
			}

			TreeSet<Integer> list = new TreeSet<Integer>(numArray.subList(x-1, y)); // you're TLEing because you're doing things so weirdly
			System.out.println(list.toString());
			if (!(list.contains(a) && list.contains(b))) { // fine this is technically binary search but you can't just do what you're doing
				System.out.println("oopsie2");
				yay = false;
			}
			
			System.out.println(yay ? "Yes" : "No");
		}
	}
}