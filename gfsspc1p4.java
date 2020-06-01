import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gfsspc1p4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] fibonacci = new int[15];
		fibonacci[1] = 1;
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
		boolean[] isFibonacci = new boolean[501];
		
		for (int num : fibonacci) {
			isFibonacci[num] = true;
		}

		br.readLine();
		char[] array = br.readLine().toCharArray();
		boolean stupidity = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 'A' ^ isFibonacci[i+1]) {
				stupidity = true;
				break;
			}
		}
		System.out.println(stupidity ? "Bruno, GO TO SLEEP" : "That's quite the observation!");
	}
}
