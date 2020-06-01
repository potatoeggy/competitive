#include <iostream>

int times;
int cards[1001];
int best[1001];

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> times;
	
	for (int i = 1; i <= times; i++) {
		std::cin >> cards[i];
	}

	for (int i = 1; i <= times; i++) {
		for (int j = times; j >= 0; j--) { // looks like knapsack
			if (i <= j) {
				best[j] = std::max(best[j], best[j-i] + cards[i]);
			}
		}
	}
	std::cout << best[times];
}