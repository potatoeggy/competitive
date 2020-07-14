#include <iostream>
#define BIG_NUMBER 1001

bool notPrimes[BIG_NUMBER];
int main() {
	notPrimes[1] = true;
	for (int i = 4; i < BIG_NUMBER; i += 2) {
		notPrimes[i] = true;
	}
	for (int i = 3; i < BIG_NUMBER; i += 2) {
		if (!notPrimes[i]) {
			for (int j = i + i; j < BIG_NUMBER; j += i) {
				notPrimes[j] = true;
			}
		}
	}
	for (int i = 0; i < 5; i++) {
		int num; std::cin >> num;

		bool found = false;
		if (num % 2 == 0 && !notPrimes[num / 2]) {
			std::cout << "semiprime" << '\n';
			found = true;
		} else {
			for (int j = 3; j < num; j += 2) {
				if (!notPrimes[j] && num % j == 0 && !notPrimes[num / j]) {
					std::cout << "semiprime" << '\n';
					found = true;
					break;
				}
			}
		}
		if (found) continue;
		std::cout << "not" << '\n';
	}
	return 0;
}