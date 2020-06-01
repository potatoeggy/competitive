import java.util.Scanner;

class ccc02j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String user = "";
		String test = "";
		while (! test.equals("quit!")) {
			test = input.nextLine();
			if (! test.equals("quit!")) {
				user += test + " ";
			}
		}
		
		String[] array = user.split(" ");
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() >= 4) {
				String temp = array[i].substring(array[i].length() - 3);
				if (temp.substring(0, 1).equals("a") || temp.substring(0, 1).equals("e") || temp.substring(0, 1).equals("i") || temp.substring(0, 1).equals("o") || temp.substring(0, 1).equals("u") || temp.substring(0, 1).equals("y")) {
				} else if (temp.substring(1).equals("or")) {
						array[i] = array[i].substring(0, array[i].length() - 2) + "our";
					}
			}
		}
		
		for (String string : array) {
			System.out.println(string);
		}
	}
}
