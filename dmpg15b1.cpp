#include <iostream>

int main() {
	int cases; std::cin >> cases;
	while (cases--) {
		std::string number; std::cin >> number;
		if (number.length() != 10 || number.substr(0, 3) != "416" && number.substr(0, 3) != "647") {
			std::cout << "not a phone number\n";
		} else {
			std::cout << "(" + number.substr(0, 3) + ")-" + number.substr(3, 3) + "-" + number.substr(6, 4) + "\n"; 
		}
	}
	return 0;
}