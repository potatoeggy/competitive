#include <iostream>

int array[100][100], times;
int smol;
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> times;

	for (int i = 0; i < times; i++) {
		for (int j = 0; j < times; j++) {
			std::cin >> array[i][j];
		}
	}

	smol = std::min(array[0][0], std::min(array[0][times-1], std::min(array[times-1][0], array[times-1][times-1])));

	if (smol == array[0][0]) { // there has to be a better way to do this this is a monstrosity
		for (int i = 0; i < times; i++) {
			for (int j = 0; j < times; j++) {
				std::cout << array[i][j] << " ";
			}
			std::cout << "\n";
		}
	} else if (smol == array[0][times-1]) {
		for (int j = times-1; j >= 0; j--) {
			for (int i = 0; i < times; i++) {
				std::cout << array[i][j] << " ";
			}
			std::cout << "\n";
		}
	} else if (smol == array[times-1][0]) {
		for (int i = 0; i < times; i++) {
			for (int j = times-1; j >= 0; j--) {
				std::cout << array[j][i] << " ";
			}
			std::cout << "\n";
		}
	} else {
		for (int i = times-1; i >= 0; i--) {
			for (int j = times-1; j >= 0; j--) {
				std::cout << array[i][j] << " ";
			}
			std::cout << "\n";
		}
	}
}