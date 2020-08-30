#include <iostream>

int field[2001][2001]; // weird diagonal prefix sum?
int main() {
	int times; std::cin >> times;
	long long total = 0;
	for (int i = 0; i < times; i++) {
		int command, x, y, number; std::cin >> command >> x >> y >> number;
		if (command == 1) {
			field[x][y] += number;
		} else { // or is there a +1 somewhere
			for (int j = 0; x - j >= 1 && y + j < 2001 && j <= number; j++) { // ew double for
				total += field[x-j][y+j];
			}
			total %= (int) 10e9 + 7;
		}
	}

	std::cout << total << '\n';
	return 0;
}
