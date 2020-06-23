#include <iostream>

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	
	int cases, total;
	int a, b, c;
	std::cin >> cases;
	for (int i = 0; i < cases; i++) {
		std::cin >> total;
		a = total / 3;
		b = (total - a) / 2;
		c = total - a - b;
		std::cout << (long long) a * b * c << '\n';
	}
	return 0;
}