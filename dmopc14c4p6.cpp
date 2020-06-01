#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>

int people;
int x, y;
const int MAX = 500001;
int paths[MAX];
std::vector<int> adj[MAX];
std::queue<int> q;
bool vis[MAX];
int main() {
	// we have undirected edges
	// we need to find number of "levels" from every position
	// unlike the previous one 
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	std::cin >> people;

	for (int i = 1; i < people; i++) {
		std::cin >> x >> y;
		adj[x].push_back(y);
		adj[y].push_back(x);
	}

	for (int i = 1; i <= people; i++) {
		std::fill(paths, paths+MAX, 0);
		std::fill(vis, vis+MAX, false);
		q.push(i);
		vis[i] = true;
		paths[i] = 1;

		int total = 0;
		while (!q.empty()) {
			int num = q.front();
			q.pop();

			for (int in : adj[num]) { // there are only up to 2 connections per node?
				if (!vis[in]) {
					vis[in] = true;
					paths[in] = paths[num] + 1; // probably can dijkstra's here?
					q.push(in);
					total = std::max(paths[in], total);
				}
			}
		}
		std::cout << total << "\n"; // something was wrong with my dfs
	}
}