#include <iostream>
#include <climits>

int h, w;
int grid[501];
int tmp;
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> h >> w;
	for (int j = 1; j <= w; j++) {
		std::cin >> tmp;
		grid[j] = grid[j-1] + tmp;
	}

	for (int i = 1; i < h; i++) {
		std::cin >> tmp;
		grid[1] = tmp + grid[1];
		for (int j = 2; j <= w; j++) {
			std::cin >> tmp;
			grid[j] = std::min(tmp + grid[j], tmp + grid[j-1]);
		}
	}
	std::cout << grid[w];
}