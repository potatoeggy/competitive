#include <iostream>

int main() {
	int wait[101];
	int totalWait[101];
	std::fill(std::begin(wait), std::end(wait), -1);
	std::fill(std::begin(totalWait), std::end(totalWait), 0);

	int times; std::cin >> times;
	int seconds = 0;
	while (times--) {
		std::string command;
		int value;
		std::cin >> command >> value;

		if (command == "R") {
			wait[value] = seconds;
		} else if (command == "S") {
			totalWait[value] += seconds - wait[value];
			wait[value] = -1;
		} else if (command == "W") {
			seconds += value-2;
		} else {
			return -1;
		}
		seconds++;
	}

	for (int i = 1; i < 101; i++) {
		if (wait[i] != -1) std::cout << i << " " << -1 << '\n';
		else if (totalWait[i] > 0) std::cout << i << " " << totalWait[i] << '\n';
	}
	return 0;
}