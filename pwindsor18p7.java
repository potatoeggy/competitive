import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class pwindsor18p7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] array = new String[Integer.parseInt(br.readLine())];

		for (int i = 0; i < array.length; i++) {
			array[i] = br.readLine();
		}
		Arrays.sort(array); // problem here is that "2" is sorted before "299" 
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i]);
		}
	}
}