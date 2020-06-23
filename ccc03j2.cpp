#include <iostream>
#include <math.h>

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	double root;
	int area, intRoot;
	std::cin >> area;
	while (area != 0) {
		root = std::sqrt(area);
		intRoot = (int) root;
		if (intRoot == root) {
			std::cout << "Minimum perimeter is " << 4 * intRoot << " with dimensions " << intRoot << " x " << intRoot << '\n';
		} else {
			bool found = false;
			for (int i = intRoot; i >= 1; i--) {
				for (int j = intRoot; i * j <= area; j++) { 
					if (i * j == area) {
						std::cout << "Minimum perimeter is " << 2 * i + 2 * j << " with dimensions " << i << " x " << j << '\n';
						found = true;
						break;
					}
				}
				if (found) break;
			}
		}
		std::cin >> area;
	}

	return 0;
}