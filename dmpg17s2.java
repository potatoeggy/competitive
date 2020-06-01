import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class dmpg17s2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int q = input.nextInt();

		for (int i = 0; i < q; i++) {
			char action = input.next().charAt(0);
			int x = input.nextInt();
			int y = input.nextInt();

			if (action == 'A') {
				// internet says "disjoint set"
