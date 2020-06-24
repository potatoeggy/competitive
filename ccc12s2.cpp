#include <iostream>
#include <map>

std::map<char, int> map;
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::pair<char, int> arrayToMap[7] = {{'I', 1}, {'V', 5}, {'X', 10}, {'L', 50}, {'C', 100}, {'D', 500}, {'M', 1000}};
	for (std::pair<char, int> p : arrayToMap) map.insert(p);

	std::string aroma;
	std::cin >> aroma;

	int counter = 0;
	for (int i = 3; i < aroma.length(); i += 2) {
		if (map.at(aroma[i-2]) < map.at(aroma[i])) {
			counter -= int(aroma[i-3] - '0') * map.at(aroma[i-2]);
		} else {
			counter += int(aroma[i-3] - '0') * map.at(aroma[i-2]);
		}
	}

	counter += map.at(aroma[aroma.length()-1]) * int((aroma[aroma.length()-2]) - '0');
	std::cout << counter << '\n';
	return 0;
}