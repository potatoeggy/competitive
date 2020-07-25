#include <iostream>
#include <set>

int main() {
	std::ios::sync_with_stdio(false);
	std::cin.tie(nullptr);

	int times; std::cin >> times;
	for (int i = 0, num; i < times; i++) {
		std::set<int> differences, sums;
		std::cin >> num;
		bool found = false;
		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				sums.insert(i + num / i);
				differences.insert(num / i - i);
			}
		}

		for (int i : sums) {
			if (differences.find(i) != differences.end()) {
				found = true;
				break;
			}
		}
		std::cout << num << (found ? " is" : " is not") << " nasty\n";
	}
	return 0;
}