#include <iostream>

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	int height, times;
	std::cin >> height >> times;
	int counter = 0;
	for (int i = 0, x; i < times; i++) {
		std::cin >> x;
		if (x >= height) counter++;
	}
	std::cout << counter << '\n';
	return 0;
}