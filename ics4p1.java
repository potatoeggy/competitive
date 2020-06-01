import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class ics4p1 {
	static TreeSet<String> list = new TreeSet<String>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		scramble(br.readLine(), "");

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	static void scramble(String in, String targ) {
		if (in.length() == 0) {
			list.add(targ);
			return;
		}

		for (int i = 0; i < in.length(); i++) {
			scramble(in.substring(0, i) + in.substring(i+1), targ + in.charAt(i));
		}
	}
}