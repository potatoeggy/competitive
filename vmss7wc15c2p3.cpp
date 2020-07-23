#include <iostream>

int main() {
	long long heights[400000];
	long long future[400000];
	future[0] = 0;
	int times; std::cin >> times;

	std::cin >> heights[0];
	for (int i = 1; i < times; i++) {
		std::cin >> heights[i];
		bool lower = false;
		for (int j = i-1; j >= 0;) {
			if (heights[j] == heights[i]) { // if they are the same then we add and are done with it
				future[i] += future[j];
				if (!lower) future[i]++; // no clue what this does
				break;
			} else if (heights[j] > heights[i]) {
				future[i] = i - j;
				break;
			} else {
				future[i] += future[j] + 1;
				if (!lower) future[i]++;
				if (j == 0) break;
				lower = true;
				j -= future[j];
			}
		}
	}

	int total = 0;
	for (int i = 0; i < times; i++) {
		total += future[i];
	}
	std::cout << total << '\n';
	return 0;
}