#include <iostream>
#include <queue>
#include <vector>

const int MAX = (int) 10e5 + 1;

std::vector<std::vector<int>> adj;
int main() {
	int vertices, edges; std::cin >> vertices >> edges;
	adj.reserve(MAX);

	for (int i = 0; i < edges; i++) {
		int start, end; std::cin >> start >> end;
		adj.at(start).push_back(end);
	}
	return 0;
}