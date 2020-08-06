#include <iostream>

int main() {
	std::string modifier; std::getline(std::cin, modifier);
	std::string string; std::getline(std::cin, string);

	for (int i = 0; i < string.length(); i++) {
		if (string[i] == ' ') continue;
		int decoded = int(string[i]) - std::stoi(modifier) % 26 - (std::isupper(string[i]) ? 65 : 97);
		if (decoded > 25) decoded -= 26;
		if (decoded < 0) decoded += 26;
		string[i] = char(decoded + (std::isupper(string[i]) ? 65 : 97));
	}
	std::cout << string << '\n';
	return 0;
}