#include <iostream>

int flowers[100001];
int total = 0;
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	int times;
	std::cin >> times;
	for (int i = 1; i <= times; i++) {
		std::cin >> flowers[i];
		total += flowers[i];
	}

	int d, tmp, cost;
	std::cin >> d;
	for (int i = 0; i < d; i++) {
		std::cin >> tmp >> cost;
		total -= std::min(std::min(flowers[tmp], flowers[tmp+1]), cost);
	}
	std::cout << total;
}