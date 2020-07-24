#include <iostream>

int main() {
	std::string one, two; std::cin >> one >> two;
	int differences = 0;

	for (int i = 0; i < one.length(); i++) {
		if (one[i] != two[i]) differences++;
	}
	std::cout << (differences == 1 ? "LARRY IS SAVED!\n" : "LARRY IS DEAD!\n");
	return 0;
}