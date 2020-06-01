#include <iostream>
#include <algorithm>

int cages, limit, weight, value;
long best[100001];

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> cages >> limit;

	for (int i = 1; i <= cages; i++) {
		std::cin >> weight >> value; // each one only depends on the one immediately before, don't overcomplicate things
		for (int j = limit; j >= 0; j--) { // adding would overwrite results
			if (weight <= j) {
				best[j] = std::max(best[j], best[j-weight] + value);
			}
		}
	}
	std::cout << best[limit];
}