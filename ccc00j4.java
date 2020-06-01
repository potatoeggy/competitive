import java.util.LinkedList;
import java.util.Scanner;

public class ccc00j4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int init = in.nextInt();
		LinkedList<Double> flow = new LinkedList<Double>();
		
		for (int i = 0; i < init; i++) {
			flow.add(in.nextDouble());
		}
		
		int ligne = 0;
		int stream;
		int percent;
		while (ligne != 77) {
			ligne = in.nextInt();
			if (ligne == 99) {
				stream = in.nextInt();
				percent = in.nextInt();
				flow.add(stream, (100 - percent) * 0.01 * (double) flow.get(stream - 1));
				flow.set(stream - 1, (double) flow.get(stream - 1) - (double) flow.get(stream));
			} else if (ligne == 88) {
				stream = in.nextInt();
				flow.set(stream, (double) flow.get(stream) + (double) flow.get(stream - 1));
				flow.remove(stream - 1);
			}
		}
		
		for (int i = 0; i < flow.size() - 1; i++) {
			System.out.print((int) Math.round((double) flow.get(i)) + " ");
		}
		
		System.out.print((int) Math.round((double) flow.get(flow.size() - 1)));
		in.close();
	}
}
