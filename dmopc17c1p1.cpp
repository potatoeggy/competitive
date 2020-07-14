#include <iostream>

char grid[1001];
bool xes[1001];
bool yes[1001];
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	int columns, rows; std::cin >> rows >> columns;

	for (int i = 0; i < rows; i++) { // what the hell is wrong with cin
		std::cin.getline(grid, 1001);
		for (int j = 0; j < columns; j++) {
			if (grid[j] == 'X') {
				xes[i] = yes[j] = true;
			}
		}
	}

	int queries; std::cin >> queries;
	for (int i = 0, x, y; i < queries; i++) {
		std::cin >> y >> x;
		x--; y--;

		std::cout << ((xes[i] || yes[i]) ? "Y" : "N") << '\n';
	}
	return 0;
}