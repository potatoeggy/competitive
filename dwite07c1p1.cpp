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

	int num; std::cin >> num;
	if (num <= 1) {
		std::cout << "not\n";
	} else {
		std::cout << (!notPrimes[num] ? "prime" : "not") << '\n';
	}
	return 0;
}