#include <iostream>

int pies, people;
int piesToPeople[251][251][251]; // this is just stupid

int recursion(int min, int pies, int people) {
	if (people == 1) return 1;
	if (piesToPeople[pies][people][min] != 0) return piesToPeople[pies][people][min];

	for (int i = min; i <= pies / people; i++) {
		piesToPeople[pies][people][min] += recursion(i, pies-i, people-1);
	}
	return piesToPeople[pies][people][min];
}

int main() {
	std::cin.sync_with_stdio(false);
	std::cin.tie(0);

	std::cin >> pies >> people;
	std::cout << recursion(1, pies, people) << "\n";
	return 0;
}