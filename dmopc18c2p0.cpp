#include <iostream>

int main() {
	int fieldSize, costMultiplier, money; std::cin >> fieldSize >> costMultiplier >> money;
	std::cout << std::min(fieldSize, money / costMultiplier) << '\n';
	return 0;
}