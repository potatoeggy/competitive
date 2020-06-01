#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <iomanip>

int lakes, rivers, total;
int x, y;
std::vector<int> adj[1000001];
double paths[1100001];

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	std::cin >> lakes >> rivers;
	for (int i = 1; i <= rivers; i++) {
		std::cin >> x >> y;
		adj[x].push_back(y);
	}

	paths[1] = 1;
	for (int i = 1; i <= lakes; i++) {
		for (int j : adj[i]) {
			paths[j] += paths[i] / adj[i].size();
		}
	}

	for (int i = 1; i <= lakes; i++) {
		if (adj[i].size() == 0) std::cout << std::setprecision(9) << paths[i] << "\n";
	}
}