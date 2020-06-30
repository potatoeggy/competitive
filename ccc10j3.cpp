#include <iostream>
#include <unordered_map>

std::unordered_map<char, int> map;

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	int instruction;
	char var1, var2;
	int number;
	std::cin >> instruction;
	while (instruction != 7) {
		if (instruction == 1) {
			std::cin >> var1 >> number;
		} else if (instruction == 2) {
			std::cin >> var1;
		} else {
			std::cin >> var1 >> var2;
		}
		
		if (instruction == 1) map.insert({var1, 0});
		
		switch (instruction) {
			case 1:
				map[var1] = number;
				break;
			case 2:
				std::cout << map[var1] << '\n';
				break;
			case 3:
				map[var1] = map.at(var1) + map.at(var2);
				break;
			case 4:
				map[var1] = map.at(var1) * map.at(var2);
				break;
			case 5:
				map[var1] = map.at(var1) - map.at(var2);
				break;
			case 6:
				map[var1] = map.at(var1) / map.at(var2);
		}
		std::cin >> instruction;
	}
	return 0;
}