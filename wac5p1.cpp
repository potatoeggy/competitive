#include <algorithm>
#include <iostream>
#include <vector>

int main() {
	int times; std::cin >> times;
	std::vector<int> acorns;
	for (int i = 0, x; i < times; i++) {
		std::cin >> x;
		acorns.push_back(x);
	}

	std::sort(acorns.begin(), acorns.end());
	for (int i = 1; i < acorns.size(); i++) { // what is happening it's like my brain is dead
		for (int j = i-1, max = acorns[i]; j >= 0; j--) {
			std::cout << "comparing " << acorns[j] << " to " << max << " " << i<< '\n';
			if (acorns[j] < max) {
				acorns.erase(acorns.begin()+j);
				max = acorns[j];
				i--;
			}
		}
	}

	int sum = 0;
	for (int i = 0; i < acorns.size(); i++) {
		sum += acorns[i];
		std::cout << acorns[i] << " ";
	}
std::cout << '\n';
	std::cout << sum << '\n';
	return 0;
}