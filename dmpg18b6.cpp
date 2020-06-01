#include <iostream>
#include <algorithm>

int array[2001], limit, times;
int cur = -100000000;
int total = 0;
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> times >> limit;

	for (int i = 0; i < times; i++) {
		std::cin >> array[i];
	}
	std::sort(std::begin(array), std::end(array));
	for (int i = 2001-times; i < 2001; i++) {
		if (array[i]-cur >= limit) {
			cur = array[i];
			total++;
		}
	}
	std::cout << total;
}