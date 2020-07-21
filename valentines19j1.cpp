#include <iostream>

int main() {
	int times; std::cin >> times;
	for (int i = 0, x; i < times; i++) {
		std::cin >> x;
		if (x < 1000) std::cout << "Newbie";
		else if (x < 1200) std::cout << "Amateur";
		else if (x < 1500) std::cout << "Expert";
		else if (x < 1800) std::cout << "Candidate Master";
		else if (x < 2200) std::cout << "Master";
		else if (x < 3000) std::cout << "Grandmaster";
		else if (x < 4000) std::cout << "Target";
		else std::cout << "Rainbow Master";
		std::cout << '\n';
	}
}