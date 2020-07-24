#include <iostream>
#include <set>

int main() {
	std::ios::sync_with_stdio(0);
	std::cin.tie(0);
	int strings1, strings2; std::cin >> strings1 >> strings2;
	std::set<std::string> db;
	std::set<std::string> db2;

	for (int i = 0; i < strings1; i++) {
		std::string temp; std::cin >> temp;
		db.insert(temp);
	}

	int counter = 0;
	for (int i = 0; i < strings2; i++) {
		std::string temp; std::cin >> temp;
		if (db2.find(temp) == db2.end()) {
			if (db.find(temp) != db.end()) {
				counter++;
			}
		}
		db2.insert(temp);
	}

	std::cout << counter << '\n';
	return 0;
}
