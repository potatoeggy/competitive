import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc20s1 {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String next() throws IOException{
		while(st==null||!st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
	static String readLine() throws IOException {
		return br.readLine().trim();
	}
	public static void main(String[] args) throws IOException {
		int obv = nextInt();
		int[] time = new int[obv];
		int[] place = new int[obv];
		
		for (int i = 0; i < time.length; i++) {
			time[i] = nextInt();
			place[i] = nextInt();
		}
		
		double fastest = 0;
		for (int i = 0; i < time.length; i++) {
			for (int j = i + 1; j < time.length; j++) {
				double temp =  Math.abs((double) (place[i] - place[j]) / (time[i] - time[j]));
				if (temp > fastest) {
					fastest = temp;
				}
			}
		}
		
		System.out.println(fastest);
	}
}
