import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dmopc15c2p1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int bars = Integer.parseInt(br.readLine());
		int rate = Integer.parseInt(br.readLine());
		int swords = 0;
		int localSwords = 0;

		while (bars != 0) {
			bars--;
			localSwords++;
			swords++;
			if (localSwords == rate) {
				bars++;
				localSwords = 0;
			}
		}
		System.out.println(swords);
	}
}