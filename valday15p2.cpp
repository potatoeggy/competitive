#include <iostream>
#include <algorithm>

const int MAX = 1001;
int cages, limit;
int princesses[MAX];
int minutes[MAX];
long best[MAX][MAX];

long recursion(int level, int capacity) {
	if (level < 0 || capacity == 0) return 0;
	if (best[level][capacity] != 0) return best[level][capacity];
	if (capacity - minutes[level] < 0) {
		best[level][capacity] = recursion(level-1, capacity);
	} else {
		best[level][capacity] = std::max(recursion(level-1, capacity), princesses[level] + recursion(level-1, capacity-minutes[level]));
	}
	return best[level][capacity];
}

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> cages >> limit;

	for (int i = 0; i < cages; i++) {
		std::cin >> princesses[i] >> minutes[i];
	}
	std::cout << recursion(cages-1, limit);
}