#include <iostream>

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	int cases; std::cin >> cases;

	int startCases[cases];
	int endCases[cases];
	int pointCases[cases];
	for (int i = 0; i < cases; i++) {
		std::cin >> startCases[i] >> endCases[i] >> pointCases[i];
	}

	int submissions; std::cin >> submissions;
	int failures[submissions];
	for (int i = 0; i < submissions; i++) {
		std::cin >> failures[i];
	}

	int total_points = 0;
	for (int i = 0; i < cases; i++) {
		bool failed = false;
		for (int j : failures) {
			if (j >= startCases[i] && j <= endCases[i]) {
				failed = true;
				break;
			}
		}

		if (!failed) total_points += pointCases[i];
	}
	std::cout << total_points << '\n';
	return 0;
}