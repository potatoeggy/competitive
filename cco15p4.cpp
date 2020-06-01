#include <iostream>

int rows, columns;
const int MAX = 4000;
char array[MAX][MAX];
bool visited[MAX][MAX];

void dfs(int x, int y) {
	int modX = 0;
	int modY = 0;
	if (array[x][y] == 'N') {
		modX = -1;
	} else if (array[x][y] == 'S') {
		modX = 1;
	} else if (array[x][y] == 'W') {
		modY = -1;
	} else {
		modY = 1;
	}

	if (modX != 0) {
		for (int i = x; i >= 0 && i < rows; i += modX) {
			if (!visited[i][y]) {
				visited[i][y] = true;
				if (array[i][y] != '.') {
					dfs(i, y);
				}
			}
		}
	} else {
		for (int i = y; i >= 0 && i < columns; i += modY) {
			if (!visited[x][i]) {
				visited[x][i] = true;
				if (array[x][i] != '.') {
					dfs(x, i);
				}
			}
		}
	}
	std::cout << "(" << x << "," << y << ")\n";
}

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> rows >> columns;

	std::string temp;
	for (int i = 0; i < rows; i++) {
		std::cin >> array[i];
	}
	for (int i = rows-1; i >= 0; i--) { // blame the test data
		for (int j = columns-1; j >= 0; j--) {
			if (array[i][j] != '.' && !visited[i][j]) {
				visited[i][j] = true;
				dfs(i, j);
			}
		}
	}
}