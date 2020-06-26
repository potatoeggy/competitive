#include <iostream>

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	int times;
	std::cin >> times;
	for (int i = 0, calculator; i < times; i++) {
		std::cin >> calculator;
		int counter = 0;
		for (int j = 1; j <= calculator / 2; j++) {
			if (calculator % j == 0) counter += j;
		}

		std::cout << calculator << " is a" << (calculator == counter ? " perfect" : calculator > counter ? " deficient" : "n abundant") << " number.\n";
	}

	return 0;
}