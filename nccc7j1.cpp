#include <iostream>

int main() {
	int counter = 0;
	char x;
	for (int i = 0; i < 5; i++) {
		std::cin >> x;
		if (x == 'P') counter++;
	}
	std::cout << counter << '\n';
	return 0;
}