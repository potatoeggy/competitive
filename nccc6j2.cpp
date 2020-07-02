#include <iostream>

int main() {
	std::string ocr;
	std::string pusheen = "pusheen";
	std::getline(std::cin, ocr);
	int counter = 0;
	for (int i = 0; i < pusheen.length(); i++) {
		if (ocr[i] != pusheen[i]) counter++;
	}
	std::cout << counter << '\n';
	return 0;
}