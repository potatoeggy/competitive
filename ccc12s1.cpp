#include <iostream>

int highestPlayer;
int total = 0;
int main() {
	std::cin.sync_with_stdio(false);
	std::cin.tie(0);

	std::cin >> highestPlayer;

	for (int i = 1; i < highestPlayer-2; i++) {
		for (int j = i+1; j < highestPlayer-1; j++) {
			for (int k = j+1; k < highestPlayer; k++) { // there has to be a better way to do this
				total++;
			}
		}
	}
	
	std::cout << total << "\n";
	return 0;
}