#include <iostream>
#include <math.h>
#include <iomanip>

int main() {
	int base, multiplier, exponenter;
	std::cin >> base >> multiplier >> exponenter;
	std::cout << std::fixed << std::setprecision(0) << base * std::pow(multiplier, exponenter) << '\n';
	return 0;
}