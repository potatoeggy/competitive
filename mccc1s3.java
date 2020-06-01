import java.util.Scanner;


public class mccc1s3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<String> list = new ArrayList();
		
		String[] tempArray = input.nextLine().split(" ");
		
		int queries = Integer.parseInt(tempArray[tempArray.length - 1]);
		
		for (int i = 0; i < queries; i++) {
			
