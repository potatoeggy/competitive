#include <iostream>
#include <algorithm>

int times, base;
int array[101];
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> times;

	for (int i = 0; i < times; i++) {
		std::cin >> array[i];
	}
	std::sort(std::begin(array), std::end(array));

	base = 100 - times + times / 2;
	if (times / 2 != times / 2.0) base++;
	for (int i = 0; i < times / 2; i++) { // only runs an even number of times, use two for loops instead?
		std::cout << array[base-i] << " " << array[base+i+1] << " ";
	}
	if (times / 2 != times / 2.0) std::cout << array[100-times+1];
}