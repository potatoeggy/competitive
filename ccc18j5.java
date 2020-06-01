import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

public class ccc18j5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer>[] list = new ArrayList[input.nextInt()+1];

		list[0] = new ArrayList<Integer>();
		for (int i = 1; i < list.length; i++) {
			list[i] = new ArrayList<Integer>();
			int temp = input.nextInt();
			if (temp == 0) {
				list[i].add(temp);
			}
			for (int j = 0; j < temp; j++) {
				list[i].add(input.nextInt());
			}
		}

		int[] distance = new int[list.length];
		Queue<Integer> q = new LinkedList<Integer>();
		Arrays.fill(distance, 10000000);
		
		distance[1] = 0;
		q.add(1);
		
		while (! q.isEmpty()) {
			int hold = q.poll();
			for (int i : list[hold]) {
				if (distance[i] > distance[hold] + 1) {
					distance[i] = distance[hold] + 1;
					q.add(i);
				}
			}
		}

		boolean foundAll = true;
		for (int i : distance) {
			if (i == 10000000) {
				foundAll = false;
				break;
			}
		}
		
		System.out.println(foundAll ? "Y" : "N");
		System.out.println(distance[0]);
	}
}
