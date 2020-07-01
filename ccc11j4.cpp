#include <iostream>
#define F_MOD 201
#define S_MOD 1

bool grid[402][201];
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::pair<int, int> preoccupied[] = {{0, -1}, {0, -2}, {0, -3}, {1, -3}, {2, -3}, {3, -3}, {3, -4}, {3, -5}, {4, -5}, {5, -5}, {5, -4}, {5, -3}, {6, -3}, {7, -3}, {7, -4}, {7, -5}, {7, -6}, {7, -7}, {6, -7}, {5, -7}, {4, -7}, {3, -7}, {2, -7}, {1, -7}, {0, -7}, {-1, -7}, {-1, -6}, {-1, -5}};
	for (std::pair<int, int> p : preoccupied) {
		grid[p.first + F_MOD][-(p.second + S_MOD)] = true;
	}

	std::pair<int, int> pointer = {-1, -5};
	char direction;
	int spaces;

	std::cin >> direction >> spaces;
	while (direction != 'q') {
		int modX = 0, modY = 0;
		bool danger = false;
		if (direction == 'l') {
			modX = -1;
		} else if (direction == 'r') {
			modX = 1;
		} else if (direction == 'd') {
			modY = -1;
		} else {
			modY = 1;
		}

		for (int i = 0; i < spaces; i++) {
			pointer.first += modX;
			pointer.second += modY;
			if (grid[pointer.first + F_MOD][-(pointer.second + S_MOD)]) {
				danger = true;
			}
			grid[pointer.first + F_MOD][-(pointer.second + S_MOD)] = true;
		}

		std::cout << pointer.first << ' ' << pointer.second << (danger ? " DANGER" : " safe") << '\n';
		if (danger) break;
		std::cin >> direction >> spaces;
	}

	return 0;
}