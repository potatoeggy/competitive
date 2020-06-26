#include <iostream>
#include <map>

std::map<std::string, char> binaryChars;
std::string binary;
int main() {
	std::cin.sync_with_stdio(false);
	std::cin.tie(0);

	int codes;
	std::cin >> codes;
	char c;
	std::string cs;
	for (int i = 0; i < codes; i++) {
		std::cin >> c >> cs;
		binaryChars.insert({cs, c});
	}

	std::cin >> binary;
	for (int i = 0; i < binary.length();) {
		for (int j = 0; j <= binary.length(); j++) {
			if (binaryChars.find(binary.substr(i, j)) != binaryChars.end()) {
				std::cout << binaryChars.find(binary.substr(i, j))->second;
				i += j;
				break;
			}
			
		}
	}

	return 0;
}
