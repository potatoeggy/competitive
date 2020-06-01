#include <iostream>

int times, plane, c = 0;
bool gates[100001]; // this is probably the data structure that needs to change

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> times;
	std::cin >> times;

	for (int i = 0; i < times; i++) {
		std::cin >> plane;
		bool failed = true;
		for (int j = plane; j > 0; j--) {
			if (!gates[j]) {
				gates[j] = true;
				failed = false;
				c++;
				break;
			}
		}
		if (failed) {
			break;
		}
	}
	std::cout << c << "\n";
}