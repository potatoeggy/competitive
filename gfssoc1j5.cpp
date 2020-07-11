#include <cstring>
#include <iostream>
#include <queue>
#include <vector>

void bfs(std::vector<int> *adj, int start, int end, int minutes) {
	std::queue<int> q;
	bool visited[1001];
	int distance[1001];

	std::memset(distance, 0, sizeof(distance));
	std::memset(visited, 0, sizeof(visited));

	visited[start] = true;
	q.push(start);

	bool found = false;
	while (!q.empty()) {
		int x = q.front();
		q.pop();
		for (int i : adj[x]) {
			if (!visited[i]) {
				visited[i] = true;
				distance[i] = distance[x] + 1;
				if (i == end) {
					found = true;
					break;
				}
				q.push(i);
			}
		}
		if (found) break;
	}

	if (found) {
		std::cout << distance[end] * minutes << '\n';
	} else {
		std::cout << "Not enough hallways!" << '\n';
	}
}

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::vector<int> adj[1001];
	int rooms, times, minutes; std::cin >> rooms >> times >> minutes;

	for (int i = 0, x, y; i < times; i++) {
		std::cin >> x >> y;
		adj[x].push_back(y);
	}

	int queries; std::cin >> queries;

	for (int i = 0, start, end; i < queries; i++) {
		std::cin >> start >> end;
		bfs(adj, start, end, minutes);
	}
	return 0;
}