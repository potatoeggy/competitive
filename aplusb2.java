import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class aplusb2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	static String next() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}

	static ArrayList<Integer> nextBigInt() throws IOException {
		String[] temp = next().split("");
		ArrayList<Integer> intTemp = new ArrayList<Integer>();
		for (int i = 0; i < temp.length; i++) {
			try {
				 intTemp.add(Integer.parseInt(temp[i]));
			} catch (Exception e) {
				intTemp.add(-0);
			}
		}
		return intTemp;
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	/*
	static ArrayList<Integer> addBigInt(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a.size() > b.size()) {
			//ArrayList<Integer> lower = // you don't handle negatives
		}
	}
	*/

	public static void main(String[] args) throws IOException {
		int x = nextInt();
		ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> array2 = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < x; i++) {
			array.add(nextBigInt());
			array2.add(nextBigInt());
			System.out.println(array.get(i).toString());
		}
		
	}
}
