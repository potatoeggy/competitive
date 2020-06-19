#include <iostream>
#include <queue>
#include <vector>
#define BIG_NUMBER 1000001

int rows, columns;
bool visited[1001][1001];
std::vector<std::pair<int, int>> adj[BIG_NUMBER];
std::queue<std::pair<int, int>> q;

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> rows >> columns;
	rows++;
	columns++;

	for (int i = 1; i < rows; i++) {
		for (int j = 1; j < columns; j++) {
			int temp;
			std::cin >> temp;
			adj[temp].push_back({i, j});
		}
	}

	visited[rows-1][columns-1] = true;
	q.push({rows-1, columns-1});

	while (!q.empty()) {
		std::pair<int, int> temp = q.front();
		q.pop();
		for (std::pair<int, int> p : adj[temp.first * temp.second]) {
			if (!visited[p.first][p.second]) {
				if (p.first == 1 && p.second == 1) {
					std::cout << "yes\n";
					return 0;
				}
				visited[p.first][p.second] = true;
				q.push(p);
			}
		}
	}
	std::cout << "no\n";
	return 0;
}