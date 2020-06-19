#include <iostream>
#include <set>

int gates, planes, counter;
std::set<int> available;
int main() { // this is more or less just the editorial
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	counter = 0;

	std::cin >> gates;
	for (int i = 1; i <= gates; i++) available.insert(-i);

	std::cin >> planes;
	for (int i = 0; i < planes; i++) {
		int request;
		std::cin >> request;
		if (available.lower_bound(-request) == available.end()) break; // it's negative because for whatever inane reason lower_bound goes *up* if element not found
		available.erase(available.lower_bound(-request));
		counter++;
	}

	std::cout << counter << '\n';
	return 0;
}