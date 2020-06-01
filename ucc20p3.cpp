#include <iostream>

int bales, numOfTractors, tractors[200], width, chosenOne, temp = 0, limit;
char farm[1000];
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> bales >> numOfTractors;
	for (int i = 0; i < numOfTractors; i++) {
		std::cin >> tractors[i];
	}
	std::cin >> width;
	std::cin >> farm;

	for (int i = 0; i < width; i++) {
		if (farm[i] == '1') {
			limit = std::max(temp, limit);
			temp = 0;
		} else {
			temp++;
		}
	}
	for (int i = 0; i < numOfTractors; i++) {
		if (tractors[i] <= limit) {
			chosenOne = tractors[i];
		 } else {
			 break;
		 }
	}

	std::cout << bales / chosenOne + (bales % chosenOne == 0 ? 0 : 1) << "\n";
}