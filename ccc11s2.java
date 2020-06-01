import java.util.Scanner;

class ccc11s2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int lines = input.nextInt();
		input.nextLine();
		
		String[] array = new String[lines];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextLine();
		}
		
		int accumulator = 0;
		for (int i = 0; i < array.length; i++) {
			if (input.nextLine().equals(array[i])) {
				accumulator++;
			}
		}
		System.out.println(accumulator);
	}
}
