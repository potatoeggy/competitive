#include <iostream>

int main() {
	int num; std::cin >> num;
	num++;
	for (; std::to_string(num).find("0") != std::string::npos; num++);
	std::cout << num << '\n';
	return 0;
}