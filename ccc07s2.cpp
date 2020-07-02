#include <iostream>
#include <tuple>

std::tuple<long long, long long, long long> boxes[1000];
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0); std::cout.tie(0);

	int boxTimes, packageTimes;
	std::cin >> boxTimes;
	for (int i = 0, x, y, z; i < boxTimes; i++) {
		std::cin >> x >> y >> z;
		boxes[i] = {x, y, z};
	}

	std::cin >> packageTimes; // 4 3 2
	long long x, y, z;
	for (int i = 0; i < packageTimes; i++) {
		std::cin >> x >> y >> z;
		long long best = 2000 * 2000 * 2001L;
		for (int j = 0; j < boxTimes; j++) { // i'm sure there's a faster way, maybe we should sort by volume?
			if ((x <= std::get<0>(boxes[j]) && y <= std::get<1>(boxes[j]) && z <= std::get<2>(boxes[j])) // there must be an easier way to make cyclic shifts oh you know what i've invested so much time screw arrays
			|| (x <= std::get<0>(boxes[j]) && z <= std::get<1>(boxes[j]) && y <= std::get<2>(boxes[j]))
			|| (y <= std::get<0>(boxes[j]) && z <= std::get<1>(boxes[j]) && x <= std::get<2>(boxes[j]))
			|| (z <= std::get<0>(boxes[j]) && y <= std::get<1>(boxes[j]) && x <= std::get<2>(boxes[j]))
			|| (z <= std::get<0>(boxes[j]) && x <= std::get<1>(boxes[j]) && y <= std::get<2>(boxes[j]))
			|| (y <= std::get<0>(boxes[j]) && x <= std::get<1>(boxes[j]) && z <= std::get<2>(boxes[j]))) {
				best = std::min(best, std::get<0>(boxes[j]) * std::get<1>(boxes[j]) * std::get<2>(boxes[j]));
			}
		}
		
		if (best != 2000 * 2000 * 2001L) {
			std::cout << best << '\n';
		} else {
			std::cout << "Item does not fit." << '\n';
		}
	}
	return 0;
}