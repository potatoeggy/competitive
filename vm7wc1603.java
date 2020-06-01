import java.util.Scanner;
import java.util.*;
public class vm7wc1603 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int homes = input.nextInt();
		int roads = input.nextInt();
		int home = input.nextInt();
		int date = input.nextInt();
		//making the data structure:
		ArrayList<Integer> adj[] = new ArrayList[2005];
		for(int i=0; i < 2005; i++)
			adj[i] = new ArrayList<Integer>();
		
		//Getting the data about the roads
		for(int i = 0; i < roads; i++){
			int x = input.nextInt(), y = input.nextInt();
			adj[x].add(y);
			adj[y].add(x);
		}
		
		//bfs
		boolean vis[] = new boolean[2005];
		Queue<Integer>q = new LinkedList<Integer>();
		vis[home]=true;
		q.add(home);
		while(!q.isEmpty()){
			int v = q.poll();
			for(int k : adj[v]){
				if(!vis[k]){
					q.add(k);
					vis[k] = true;
				}
			}
		}
		System.out.println(vis[date]?"GO SHAHIR!":"NO SHAHIR!");
		
		
	}	
}
