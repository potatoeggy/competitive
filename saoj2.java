import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class saoj2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int top = Integer.parseInt(br.readLine());

		int temp = 0;
		for (int i = 1; i <= top; i++) {
			temp += i;
		}
		System.out.println("Maybe, the sum of all the numbers from 1 to " + top + "?"); // looked at james solution
		// this is dumb question
		// it wants you to cpp the java
	}
}