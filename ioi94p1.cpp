#include <iostream>

int base[102];
int cur[102];
int main() {
	int lines; std::cin >> lines;
	for (int i = 1; i <= lines; i++) {
		for (int j = 1; j <= i; j++) {
			std::cin >> cur[j];
		}
		for (int j = i; j >= 1; j--) {
			base[j] = cur[j] + std::max(base[j], base[j-1]);
		}
	}

	int greatest = -1;
	for (int i = 1; i <= lines; i++) {
		greatest = std::max(base[i], greatest);
	}
	std::cout << greatest << '\n';
	return 0;
}