#include <iostream>

int times;
int sizes[2001];
int combinations[4001];
int greatest, numberOfGreatests;

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	greatest = numberOfGreatests = 0;

	std::cin >> times;
	int temp;
	for (int i = 0; i < times; i++) {
		std::cin >> temp;
		sizes[temp]++;
	}

	for (int i = 1; i <= 2000; i++) {
		if (sizes[i] > 0) {
			for (int j = i; j <= 2000; j++) {
				if (i == j) {
					combinations[i + j] += sizes[i] / 2; // avoid counting duplicate pairs
				} else if (sizes[j] > 0) { // yay editorial
					combinations[i + j] += std::min(sizes[i], sizes[j]); // if there is more than one of the same board
				}
			}
		}
	}

	for (int i = 1; i <= 4000; i++) {
		if (combinations[i] > greatest) {
			greatest = combinations[i];
			numberOfGreatests = 1;
		} else if (combinations[i] == greatest) {
			numberOfGreatests++;
		}
	}
	
	std::cout << greatest << ' ' << numberOfGreatests << '\n';

	return 0;
}