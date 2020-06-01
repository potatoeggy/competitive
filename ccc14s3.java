import java.util.Scanner;
import java.util.Stack;

public class ccc14s3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int tests = input.nextInt();

		for (int i = 0; i < tests; i++) {
			int times = input.nextInt();
			Stack<Integer> stack = new Stack<Integer>();
			for (int j = 0; j < times; j++) {
				stack.push(input.nextInt());
			}
			Stack<Integer> branch = new Stack<Integer>();
			boolean failed = false;
			
			for (int j = 1; j <= times; j++) {
				if (stack.size() > 0 && stack.peek().equals(j)) {
					int temp = stack.pop();
				} else if (branch.size() > 0 && branch.peek().equals(j)) {
					int temp = branch.pop();
				} else if (stack.size() > 0) {
					branch.push(stack.pop());
					j--;
				} else {
					failed = true;
					break;
				}
			}

			System.out.println(failed ? "N" : "Y");
		}
	}
}
