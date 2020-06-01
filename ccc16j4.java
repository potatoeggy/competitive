import java.util.Scanner;

public class ccc16j4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String temp = input.nextLine();
		
		int dH = Integer.parseInt(temp.substring(0, 2));
		int dM = Integer.parseInt(temp.substring(3));
		
		for (int i = 0; i < 120; i+= 10) {
			if (dH >= 7 && dH < 10 || dH >= 15 && dH < 19) {
				dM += 20;
			} else {
				dM += 10;
			}
			
			// make hours and minutes follow rules
			if (dM >= 60) {
				dH++;
				dM -= 60;
			}
			
			if (dH > 23) {
				dH -= 24;
			}
		}
		System.out.println(String.format("%02d", dH) + ":" + String.format("%02d", dM));
	}
}
