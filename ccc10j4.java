import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class ccc10j4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine());
		}
		return Integer.parseInt(st.nextToken());
	}
	
	public static void main(String[] args) throws IOException {
		while (true) {
			int times = nextInt();
			if (times == 0) {
				break;
			}
			
			int[] array = new int[times];
			int[] diffArray = new int[times];
			array[0] = nextInt();
			for (int i = 1; i < times; i++) {
				array[i] = nextInt();
				diffArray[i] = array[i] - array[i-1];
			}

			for (int cycle = 1; cycle <= times; cycle++) {
				boolean notCycle = false;
				for (int i = 1; i < times; i++) {
					int base = cycle + i;
					if (base >= times) {
						continue;
					}
					if (diffArray[i] != diffArray[base]) {
						notCycle = true;
						break;
					}
					base += cycle;
				}
				
				if (! notCycle) {
					System.out.println(diffArray.length > 1 ? cycle : 0);
					break;
				}
			}
		}
	}
}
