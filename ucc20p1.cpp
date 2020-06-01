#include <iostream>

char one[1000], two[1000];
int times, total = 0;

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> times;
	std::cin >> one;
	std::cin >> two;

	for (int i = 0; i < times; i++) {
		if (one[i] == two[i] && one[i] == '0') total++;
	}
	std::cout << total << "\n";
}