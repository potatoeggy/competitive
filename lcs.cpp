#include <iostream>

int memo[1001][1001];

int lcs(int* first, int* second, int firstSize, int secondSize) {
	if (memo[firstSize][secondSize] != -1) return memo[firstSize][secondSize];
	if (first[firstSize-1] == second[secondSize-1]) {
		memo[firstSize][secondSize] = lcs(first, second, firstSize-1, secondSize-1) + 1;
	} else {
		memo[firstSize][secondSize] = std::max(lcs(first, second, firstSize-1, secondSize), lcs(first, second, firstSize, secondSize-1));
	}
	return memo[firstSize][secondSize];
}

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	for (int i = 1; i < 1001; i++) {
		for (int j = 1; j < 1001; j++) {
			memo[i][j] = -1;
		}
	}
	int firstSize, secondSize; std::cin >> firstSize >> secondSize;
	int first[1000], second[1000];
	for (int i = 0; i < firstSize; i++) {
		std::cin >> first[i];
	}

	for (int i = 0; i < secondSize; i++) {
		std::cin >> second[i];
	}

	std::cout << lcs(first, second, firstSize, secondSize) << '\n';
	return 0;
}