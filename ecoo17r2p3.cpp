#include <iostream>
#include <algorithm>
#include <vector>

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	int cases = 3;
	while (cases--) {
		//std::fill(std::begin(restaurants), std::end(restaurants), 0);
		int times, reductionRate, endDate; std::cin >> times >> reductionRate >> endDate;
		std::vector<std::pair<int, int>> restaurants;
		for (int i = 1, x; i <= times; i++) {
			std::cin >> x;
			restaurants.push_back({x, i});
		}
		while (endDate--) {
			std::sort(restaurants.begin(), restaurants.end());
			for (int i = restaurants.size() - 1; i > 0; i--) if (restaurants[i].first != restaurants[i-1].first) {
				restaurants[i].first -= reductionRate; // don't wanna
				break;
			}
		}
		std::sort(restaurants.begin(), restaurants.end());
		for (int i = restaurants.size() - 1; i > 0; i--) if (restaurants[i].first != restaurants[i-1].first) {
			std::cout << restaurants[i].second << '\n';
			break;
		}
	}
	return 0;
}