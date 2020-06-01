import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class largeperm {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int[] nums = new int[nextInt()];
		int[] index = new int[100001];

		int max = nextInt();

		for (int i = nums.length-1; i >= 0; i--) {
			nums[i] = nextInt();
			index[nums[i]] = i;
		}

		int[] sorted = nums.clone();
		Arrays.sort(sorted);

		for (int i = sorted.length-1; i >= 0; i--) {
			if (max == 0) break;
			if (sorted[i] > nums[i]) {
				nums[index[sorted[i]]] = nums[i];
				nums[i] = sorted[i];
				index[nums[index[sorted[i]]]] = index[nums[i]];
				index[nums[i]] = i;
				max--;
			}
		}
		
		for (int i = nums.length-1; i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}
	}
}