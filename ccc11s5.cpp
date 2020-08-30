#include <iostream>
#include <queue>
#include <vector>

std::vector<bool> litHouses;
int main() {
	int lights; std::cin >> lights;
	for (int i = 0; i < lights; i++) {
		bool x; std::cin >> x;
		litHouses.push_back(x);
	}

	std::queue<std::pair<int, std::vector<bool>>> q; // mle?
	q.push({0, litHouses});

	while (!q.empty()) {
		auto slice = q.front();
		q.pop();

		bool failed = false;
		int continuous = 0, trues = 0;
		for (int i = 0; i < slice.second.size(); i++) { // could maybe speed this up by identifying new possible nodes in this loop
			if (!slice.second.at(i)) {
				if (continuous >= 4) {
					for (int j = continuous; j > 0; j--) slice.second[i-j] = false;
					trues -= continuous;
					if (trues == 0) failed = false;
				}
				continuous = 0;
			} else {
				trues++;
				continuous++;
				failed = true;
			}
		}

		if (!failed || trues == slice.second.size()) {
			std::cout << slice.first << '\n';
			return 0;
		}

		for (int i = 0; i < slice.second.size(); i++) {
			if (!slice.second.at(i)) {
				auto temp = slice.second;
				temp[i] = true;
				q.push({slice.first + 1, temp});
			}
		}

/*
		for (bool b : slice.second) {
				std::cout << b << " ";
		}
		std::cout << '\n';
*/
	}
	std::cout << "no solution found something broke\n";
	return 0;
}