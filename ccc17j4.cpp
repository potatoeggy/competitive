#include <iostream>

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	int duration;
	std::cin >> duration;

	std::string initial = "1200";
	int initialInt = std::stoi(initial);
	
	int counter = 31 * (duration / 720);
	duration %= 720;
	for (int i = 0; i < duration; i++) {
		initialInt++;
		if (initialInt % 100 > 59) {
			initialInt += 40;
		}
		if (initialInt > 1259) {
			initialInt -= 1200;
		}
		initial = std::to_string(initialInt);
		
		bool consecutive = true;
		for (int i = 2; i < initial.length(); i++) {
			int first = (int) (initial[i-2] - '0');
			int second = (int) (initial[i-1] - '0');
			int third = (int) (initial[i] - '0');
			if (second - first != third - second) {
				consecutive = false;
				break;
			}
		}

		if (consecutive) counter++;
	}
	std::cout << counter << '\n';

	return 0;
}