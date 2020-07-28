#include <iostream>
#include <vector>
#include <algorithm>

int main() {
	std::ios::sync_with_stdio(0);
	std::cin.tie(0);

	int times; std::cin >> times;
	std::vector<int> numbers;
	int lowest = 1000000001;
	while (times--) {
		int x; std::cin >> x;
		if (x < lowest) lowest = x;
		numbers.push_back(x);
	}

	std::string string = "";
	for (int i = 2; i <= lowest; i++) {
		int lowestMod = lowest % i;
		bool success = true;
		for (int num : numbers) {
			if (num % i != lowestMod) {
				success = false;
				break;
			}
		}
		if (success) string += std::to_string(i) + " ";
	}
	std::cout << string.substr(0, string.length()-1) << '\n';
	return 0;
}