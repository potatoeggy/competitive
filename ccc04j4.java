import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Arrays;
class ccc04j4 {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		String string = readLine();
		String encoder = readLine();
		encoder = encoder.replaceAll("[^A-Z]", "");
		
		char[] stringCharArray = string.toCharArray();
		char[] charArray = encoder.toCharArray();
		
		
		
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] += stringCharArray[i % string.length()] - 65;
			if (charArray[i] > 90) {
				charArray[i] -= 26;
			}
		}
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		
		
	}
	static String next() throws IOException{
		while(st==null||!st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException{
		return Integer.parseInt(next());
	}
	static String readLine() throws IOException{
		return br.readLine().trim();
	}
}
