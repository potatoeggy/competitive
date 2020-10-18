#include <iostream>
#include <queue>
#include <vector>

int fans[1000000];
std::vector<int> adj[1000000];

std::pair<int, int> bfs(int start) {
	return {0, 0}; // add actual bfs later
}

int main() {
	int cities; std::cin >> cities;
	for (int i = 0; i < cities; i++) std::cin >> fans[i];
	for (int i = 0; i < cities-1; i++) {
		int start, end; std::cin >> start >> end;
		adj[start].push_back(end);
	}
	std::pair<int, int> best = {-1, -1}; // score, index
	for (int i = 0; i < cities; i++) {
		best = std::min(bfs(i), best);
	}
	return 0;
}