import java.util.Scanner;

class ccc14j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		input.nextLine();
		
		String votes = input.nextLine();
				
		int a = votes.replace("B", "").length();
		int b = votes.length() - a;
		
		if (a > b) {
			System.out.println("A");
		} else if (a < b) {
			System.out.println("B");
		} else {
			System.out.println("Tie");
		}
	}
}
