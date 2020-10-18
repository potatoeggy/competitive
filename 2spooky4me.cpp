#include <iostream>

int diff[100000001];
int main() {
	int decorations, houses, scareLevel; std::cin >> decorations >> houses >> scareLevel;
	for (int i = 0; i < decorations; i++) {
		int start, end, spook; std::cin >> start >> end >> spook;
		diff[start] += spook;
		diff[end] -= spook;
	}

	int candy = 0;
	int reconstructed = 0;
	for (int i = 1; i < houses; i++) {
		reconstructed += diff[i];
		if (reconstructed <= scareLevel) candy++;
	}

	std::cout << candy << '\n';
	return 0;
}