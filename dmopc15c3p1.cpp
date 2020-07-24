#include <iostream>

int main() {
	int one, two, three, four; std::cin >> one >> two >> three >> four;
    std::cout << (one >= four || two <= three ? "NO" : "YES") << '\n';
	return 0;
}