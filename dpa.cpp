#include <iostream>
#include <algorithm>
#include <climits>

int times;
int heights[100002];
int best[100002];

int main() {
	std::fill_n(best, 100002, INT_MAX);
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	std::cin >> times;
	for (int i = 1; i <= times; i++) {
		std::cin >> heights[i];
	}

	best[1] = 0;
	for (int cur = 1; cur < times; cur++) {
		for (int i = 1; i <= 2; i++) {
			if (best[cur+i] > best[cur] + abs(heights[cur] - heights[cur+i])) {
				best[cur+i] = best[cur] + abs(heights[cur] - heights[cur+i]);
			}
		}
	}

	std::cout << best[times];
	return 0;
}