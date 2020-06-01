import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ccc11s5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[] array = new boolean[Integer.parseInt(br.readLine())];
		boolean[] endState = new boolean[array.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = Boolean.parseBoolean(br.readLine());
		}

		Queue<Integer> q = new LinkedList<Integer>();
		int[] distance = {0}; // this is interesting because we need to keep track of everything at every level but nodes can be visited more than once
		// have global variable that increases? no that doesn't work
		// ....hm
	}
}