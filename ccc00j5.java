import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ccc00j5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int pages = in.nextInt();
		in.nextLine();
		// fudge you need graphs and nodes and stuffs
		List<Integer> list[] = new ArrayList[pages];
		String[] url = new String[pages];
		
		for (int i = 0; i < list.length; i++) {
			list[i] = new ArrayList<Integer>();
			url[i] = in.nextLine();
			String toParse = in.nextLine();
			while (!toParse.equals("</HTML>")) {
				// arg i dunno
			}
		}
	}
}
