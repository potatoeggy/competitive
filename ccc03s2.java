import java.util.Scanner;

public class ccc03s2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int verses = input.nextInt();
		input.nextLine();
		
		String[][] poem = new String[verses][4];
		
		for (int i = 0; i < poem.length; i++) {
			for (int j = 0; j < poem[i].length; j++) {
				String user = input.nextLine();
				user = user.substring(user.lastIndexOf(" ") + 1).toLowerCase();
				for (int k = user.length() - 1; k >= 0; k--) {
					String temp = user.substring(k, k + 1);
					if (temp.equals("a") || temp.equals("e") || temp.equals("o") || temp.equals("i") || temp.equals("u")) {
						poem[i][j] = user.substring(k);
						break;
					}
					poem[i][j] = user;
				}
			}
		}
		
		for (String[] syllable : poem) {
			if (syllable[0].equals(syllable[1]) && syllable[0].equals(syllable[2]) && syllable[0].equals(syllable[3])) {
				System.out.println("perfect");
			} else if (syllable[0].equals(syllable[1]) && syllable[2].equals(syllable[3])) {
				System.out.println("even");
			} else if (syllable[0].equals(syllable[2]) && syllable[1].equals(syllable[3])) {
				System.out.println("cross");
			} else if (syllable[0].equals(syllable[3]) && syllable[1].equals(syllable[2])) {
				System.out.println("shell");
			} else {
				System.out.println("free");
			}
		}
	}
}
