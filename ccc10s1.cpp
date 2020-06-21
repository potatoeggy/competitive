#include <algorithm>
#include <iostream>

std::pair<int, std::string> computers[10000];
int times;

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	
	std::cin >> times;

	std::string name;
	int ram, cpu, ssd;
	for (int i = 0; i < times; i++) {
		std::cin >> name >> ram >> cpu >> ssd;
		computers[i] = {2*ram + 3*cpu + ssd, name};
	}

	std::sort(std::begin(computers), std::begin(computers) + times, [] (const std::pair<int, std::string> &left, const std::pair <int, std::string> &right) {
		if (left.first != right.first) return left.first > right.first;
		return left.second < right.second;
	});

	if (times > 0) {
		std::cout << computers[0].second << '\n';
		if (times > 1) {
			std::cout << computers[1].second << '\n';
		}
	}
	return 0;
}