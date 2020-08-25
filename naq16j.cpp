#include <iostream>

int main() {
	int times; std::cin >> times;
	for (int i = 0; i < times; i++) {
		std::string value; std::cin >> value;
		std::cout << value.length() << '\n';
	}
	return 0;
}