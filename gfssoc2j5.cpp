#include <iostream>
#include <algorithm>

int cases[500000], times, queries;
int temp[500000];
int x, y;
int total = 1;

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> times >> queries;
	for (int i = 0; i < times; i++) {
		std::cin >> cases[i];
	}

	for (int i = 0; i < queries; i++) {
		std::cin >> x >> y;
		std::copy(std::begin(cases), std::end(cases), std::begin(temp));
		std::fill(std::begin(temp)+x-1, std::begin(temp)+y-1, 0);
		std::sort(std::begin(temp), std::end(temp));
		for (int j = 499998; temp[j] == temp[j+1]; j--) {
			total++;
		}
		std::cout << temp[499999] << " " << total << "\n";
		total = 1;
	}
}