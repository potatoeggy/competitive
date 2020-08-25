#include <iostream>

int main() {
	int times, w, h; std::cin >> times >> w >> h;
	for (int i = 0; i < times; i++) {
		int match; std::cin >> match;
		std::cout << (match * match <= w * w + h * h ? "DA" : "NE") << '\n';
	}
	return 0;
}