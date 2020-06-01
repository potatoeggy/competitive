#include <iostream>
#include <stdio.h>

int x, y, times, inX, inY;
int tracker[26][26];
bool adj[26][26];

int main() {
	std::cin.tie(0);
	std::cin.sync_with_stdio(0);
	std::cin >> x >> y;
	x++;
	y++;
	std::cin >> times;

	for (int i = 0; i < times; i++) {
		std::cin >> inX >> inY;
		adj[inX][inY] = true;
	}

	tracker[1][1] = 1;

	for (int i = 1; i < x; i++) {
		for (int j = 1; j < y; j++) {
			if (!adj[i][j]) {
				tracker[i+1][j] += tracker[i][j];
				tracker[i][j+1] += tracker[i][j];
			}
		}
	}
	std::cout << tracker[x-1][y-1];
}