#include <iostream>

int main() {
	int number; std::cin >> number;
	int counter = 0;
	for (int i = 0; i < number; i++) {
		for (int j = 0; j < number; j++) {
			if (i != j) counter += 1;
		}
	}
	std::cout << counter << '\n';
	return 0;
}