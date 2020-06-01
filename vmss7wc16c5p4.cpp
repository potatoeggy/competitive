#include <iostream>

int bar, x, y, z;
int best[200001];

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> bar >> x >> y >> z;

	for (int i = 0; i <= bar; i++) {
		if (best[i] != 0 || i == 0) {
			best[i+x] = std::max(best[i+x], best[i]+1);
			best[i+y] = std::max(best[i+y], best[i]+1);
			best[i+z] = std::max(best[i+z], best[i]+1);
		}
	}

	std::cout << best[bar];
}