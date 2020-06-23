#include <iostream>
#include <queue>
#define BIG_NUMBER 500001

bool grid[BIG_NUMBER][BIG_NUMBER]; // you can't because N can go up to integer limit and M is 5*10^5
int length, width, blocked;
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	std::cin >> length >> width >> blocked;

	for (int i = 0, x, y; i < blocked; i++) {
		std::cin >> x >> y;
		grid[x][y] = true;
	}

	std::queue<std::pair<int, int>> q;
	q.push({1, 1});

	while (!q.empty()) {
		std::pair<int, int> pair = q.front();
		q.pop();

		for (int i = -1; i <= 1; i += 2) {
			if (!grid[pair.first+i][pair.second] && pair.first + i > 0 && pair.first + i <= length) {
				grid[pair.first+i][pair.second] = true;
				if (pair.first + i == length && pair.second == width) {
					std::cout << "YES" << '\n';
					return 0;
				}
				q.push({pair.first + i, pair.second});
			}
			if (!grid[pair.first][pair.second+i] && pair.second + i > 0 && pair.second + i <= width) {
				grid[pair.first][pair.second+i] = true;
				if (pair.first == length && pair.second + i == width) {
					std::cout << "YES" << '\n';
					return 0;
				}
				q.push({pair.first, pair.second + i});
			}
		}
	}

	std::cout << "NO" << '\n';
	return 0;
}