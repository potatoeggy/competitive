#include <iostream>

int main() {
	int width, cheesiness;
	std::cin >> width >> cheesiness;
	std::cout << "C.C. is ";
	if (width == 3 && cheesiness >= 95) {
		std::cout << "absolutely";
	} else if (width == 1 && cheesiness <= 50) {
		std::cout << "fairly";
	} else {
		std::cout << "very";
	}
	std::cout << " satisfied with her pizza.\n";
	return 0;
}