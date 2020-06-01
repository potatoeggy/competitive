import java.util.Scanner;

public class cccpc01j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		input.nextLine();
		
		String[] user = input.nextLine().split(" ");
		String combined = "";
		
		for (int i = 0; i < user[0].length(); i++) {
			combined += user[0].charAt(i);
			combined += user[1].charAt(i);
		}
		
		System.out.println(combined);
	}
}
