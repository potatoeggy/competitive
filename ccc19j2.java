import java.util.Scanner;

public class ccc19j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] array = new String[input.nextInt()];
		int pot;
		String string;
		
		for (int i = 0; i < array.length; i++) {
			pot = input.nextInt();
			string = input.next();
			array[i] = "";
			for (int j = 0; j < pot; j++) {
				array[i] += string;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
