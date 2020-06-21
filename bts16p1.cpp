#include <iostream>
#include <algorithm>
#include <string.h>

std::string string;

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	std::getline(std::cin, string);

	int upper, lower;
	upper = lower = 0;
	for (int i = 0; i < string.length(); i++) {
		if (std::isupper(string[i])) {
			upper++;
		} else if (std::islower(string[i])) {
			lower++;
		}
	}
	if (upper > lower) {
		std::transform(string.begin(), string.end(), string.begin(), ::toupper);
	} else if (lower > upper) {
		std::transform(string.begin(), string.end(), string.begin(), ::tolower);
	}

	std::cout << string << '\n';
	return 0;
}