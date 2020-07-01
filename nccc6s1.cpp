#include <iostream>
#include <iomanip>

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	int times;
	float total;
	std::cin >> times;
	for (int i = 0; i < times; i++) {
		int temp;
		std::cin >> temp;
		total += temp;
	}
	std::cout << std::fixed << std::setprecision(1) << total / times << '\n';
}