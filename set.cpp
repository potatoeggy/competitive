#include <iostream>
#include <unordered_set>

std::unordered_set<int> set;
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	int numbers;
	std::cin >> numbers;
	for (int temp, i = 0; i < numbers; i++) {
		std::cin >> temp;
		set.insert(temp);
	}
	std::cout << set.size() << '\n';
	return 0;
}