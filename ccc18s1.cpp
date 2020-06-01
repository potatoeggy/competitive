#include <iostream>
#include <algorithm>
#include <iomanip>
#define INF 1000000001

int villages[100], times;
double smallest = INF;
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> times;
	std::fill(std::begin(villages), std::end(villages), INF);

	for (int i = 0; i < times; i++) {
		std::cin >> villages[i];
	}
	std::sort(std::begin(villages), std::end(villages));

	for (int i = 1; i < times-1; i++) {
		smallest = std::min((villages[i+1] - villages[i]) / 2.0 + (villages[i] - villages[i-1]) / 2.0, smallest);
	}

	std::cout << std::fixed << std::setprecision(1) << smallest;
}