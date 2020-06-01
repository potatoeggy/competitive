#include <iostream>
#define BIGNUMBER 100000000

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	int min, temp, tempCount, times, timeTimes;

	std::cin >> timeTimes;
	min = BIGNUMBER;
	for (int i = 0; i < timeTimes; i++) {
		std::cin >> times;
		tempCount = 0;
		for (int j = 0; j < times; j++) {
			std::cin >> temp;
			tempCount += temp;
		}
		min = std::min(min, tempCount);
	}
	std::cout << min;
}