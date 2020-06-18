#include <iostream>

int jerseys, athletes, customers;
int inventory[1000001]; // goddammit i can't read

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	customers = 0;

	std::cin >> jerseys >> athletes;
	for (int i = 1; i <= jerseys; i++) {
		char c;
		std::cin >> c;
		if (c == 'S') {
			inventory[i] = 0;
		} else if (c == 'M') {
			inventory[i] = 1;
		} else if (c == 'L') {
			inventory[i] = 2;
		}
	}

	for (int i = 0; i < athletes; i++) {
		char size;
		int intSize, number;
		std::cin >> size >> number;

		if (size == 'S') {
			intSize = 0;
		} else if (size == 'M') {
			intSize = 1;
		} else {
			intSize = 2;
		}

		if (inventory[number] >= intSize) {
			inventory[number] = -1;
			customers++;
		}
	}

	std::cout << customers << '\n';
	return 0;
}