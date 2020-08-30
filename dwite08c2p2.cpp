#include <algorithm>
#include <iostream>

int main() {
	for (int i = 0; i < 5; i++) {
		std::string number; std::cin >> number;
		std::sort(number.begin(), number.end());
		std::cout << number.at(number.length()-1) << '\n';
	}
	return 0;
}