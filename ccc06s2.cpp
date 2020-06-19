#include <iostream>
#include <string>
#include <unordered_map>

std::string plaintext, ciphertext, encrypted;

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::unordered_map<char, char> map;

	std::getline(std::cin, plaintext);
	std::getline(std::cin, ciphertext);
	std::getline(std::cin, encrypted);

	for (int i = 0; i < plaintext.length(); i++) {
		map[ciphertext.at(i)] = plaintext.at(i);
	}

	for (int i = 0; i < encrypted.length(); i++) {
		if (map.find(encrypted.at(i)) != map.end()) {
			std::cout << map[encrypted.at(i)];
		} else {
			std::cout << '.';
		}
	}
	std::cout << '\n';
	return 0;
}