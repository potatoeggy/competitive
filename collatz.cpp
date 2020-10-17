#include <iostream>

int main() {
	int c = 0, n; std::cin >> n;
	while (n != 1) {
		if (n % 2) n = n * 3 + 1; // if odd
		else n /= 2;
		c++;
	}

	std::cout << c << '\n';
	return 0;
}