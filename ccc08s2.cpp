#include <iostream>
#include <cmath>

int main() {
	int radius; std::cin >> radius;
	while (radius != 0) {
		int points = (radius*2+1)*(radius*2+1);
		for (int i = radius; i >= 1; i--) {
			for (int j = radius; j >= 1; j--) {
				if (std::sqrt(i*i + j*j) <= radius) {
					//std::cout << i << " " << j << "\n";
					break;
				}
				points -= 4;
				//std::cout << i << " " << j << " " << (float)std::sqrt(i*i + j*j) << '\n';
			}
		}
		std::cout << points << '\n';
		std::cin >> radius;
	}
	return 0;
}