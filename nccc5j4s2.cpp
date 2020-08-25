#include <iostream>

int array[1000];
int main() {
	int times; std::cin >> times;
	for (int i = 0; i < times; i++) {
		std::cin >> array[i];
	}
	
	int swaps = 0;
	bool sorted = false;
	for (int i = 0; !sorted; i++) {
		sorted = true;
		for (int j = 1; j < times-i; j++) {
			if (array[j-1] < array[j]) {
				sorted = false;
				swaps++;
				std::swap(array[j-1], array[j]);
			}
		}
	}
	std::cout << swaps << '\n';
	return 0;
}