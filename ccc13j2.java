import java.util.Scanner;

class ccc13j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String user = input.nextLine();
		
		boolean failed = false;
		
		for (char chara : user.toCharArray()) {
			if (chara != 'I' && chara != 'O' && chara != 'S' && chara != 'H' && chara != 'Z' && chara != 'X' && chara != 'N') {
				failed = true;
				break;
			}
		}
		if (failed) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
