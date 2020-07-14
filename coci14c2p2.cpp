#include <iostream>
#include <set>

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::set<std::string> runners;
	int contestants; std::cin >> contestants;
	for (int i = 0; i < contestants; i++) {
		std::string tmp; std::cin >> tmp;
		runners.insert(tmp); // may not be unique
	}

	for (int i = 0; i < contestants - 1; i++) {
		std::string tmp; std::cin >> tmp;
		runners.erase(tmp);
	}

	std::cout << *(runners.begin()) << '\n';
	return 0;
}