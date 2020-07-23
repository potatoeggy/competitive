#include <iostream>

int main() {
	int length; std::cin >> length;
	char string[100000]; std::cin >> string;
	bool swapped = false, bracketMode = false, failed = false;
	for (int i = 0; i < length; i++) {
		if (bracketMode && string[i] == '(' || // so many conditions :(
			!bracketMode && string[i] == ')') {
			failed = swapped;
			swapped = !swapped;
		}
		if (failed) {
			std::cout << "NO\n";
			return 0;
		}

		if (string[i] == '(') {
			bracketMode = true;
		} 
	}

	std::cout << "YES\n";
	return 0;
}