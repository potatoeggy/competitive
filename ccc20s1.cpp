#include <algorithm>
#include <iomanip>
#include <iostream>

int observations;
double greatest;
std::pair<int, int> list[100000];
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	greatest = 0;

	std::cin >> observations;
	int x, y;
	for (int i = 0; i < observations; i++) {
		std::cin >> x >> y;
		list[i] = {x, y};
	}

	std::sort(std::begin(list), std::begin(list) + observations);

	int time, distance;
	for (int i = 1; i < observations; i++) {
		time = list[i].first - list[i-1].first;
		distance = std::abs(list[i].second - list[i-1].second);
		greatest = std::max(greatest, (double) distance / time);
	}

	std::cout << std::fixed << std::setprecision(5) << greatest << '\n';
	return 0;
}