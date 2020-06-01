import java.util.Scanner;

class ccc05j3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String tempDir = "";
		String tempDes = "";
		String tempTempDes = "";
		while (! tempTempDes.equals("SCHOOL")) {
			String tempTempDir = input.nextLine();
			if (tempTempDir.equals("L")) {
				tempDir += "RIGHT ";
			} else {
				tempDir += "LEFT ";
			}
			tempTempDes = input.nextLine();
			tempDes += tempTempDes + " ";
		}
		
		String[] directions = tempDir.split(" ");
		String[] destinations = tempDes.split(" ");
		
		for (int i = directions.length - 2; i >= 0; i--) {
			System.out.println("Turn " + directions[i + 1] + " onto " + destinations[i] + " street.");
		}
		System.out.println("Turn " + directions[0] + " into your HOME.");
	}
}
