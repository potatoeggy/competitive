#include <iostream>

int main() {
	int estimation, offBy;
	std::string offByDirection;
	std::cin >> estimation >> offByDirection >> offBy;
	if (offByDirection == "Infront") std::cout << estimation - offBy << '\n';
	else std::cout << estimation + offBy << '\n';
	return 0;
}