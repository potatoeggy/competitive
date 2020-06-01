#include <iostream>

int h, w;
int grid[1001];
char c[1001];
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> h >> w;
	grid[1] = 1;

	for (int i = 0; i < h; i++) {
		std::cin >> c;
		for (int j = 1; j <= w; j++) {
			if (c[j-1] == '.') {
				grid[j] = (grid[j] + grid[j-1]) % 1000000007;
			} else {
				grid[j] = 0;
			}
		}
	}
	std::cout << grid[w];
}