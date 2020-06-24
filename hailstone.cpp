#include <iostream>

int number, i;
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	std::cout.tie(0);
	std::cin >> number;

	for (i = 0; number != 1; i++) {
		if (number % 2 == 0) {
			number /= 2;
		} else {
			number = number * 3 + 1;
		}
	}
	
	std::cout << i << '\n';
	return 0;
}