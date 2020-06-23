#include <algorithm>
#include <iostream>

bool isNotAlphanumeric(char c) {
	return !std::isalnum(c);
}

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::string key;
	std::string decoded;

	std::getline(std::cin, key); // do keywords have spaces?
	std::getline(std::cin, decoded);
	decoded.erase(std::remove_if(decoded.begin(), decoded.end(), isNotAlphanumeric), decoded.end());

	for (int i = 0; i < decoded.length(); i++) {
		decoded[i] += key.at(i % key.length()) - 65;
		if (decoded[i] >= 65 + 26) decoded[i] -= 26;
	}
	std::cout << decoded << '\n';
	return 0;
}