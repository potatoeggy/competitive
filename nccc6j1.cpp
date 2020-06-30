#include <iostream>

int a, b;
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> a >> b;

	if (a > b) {
		std::cout << "CS452\n";
	} else if (a < b) {
		std::cout << "PHIL145\n";
	}
}