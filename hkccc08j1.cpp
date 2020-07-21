#include <iostream>

int main() {
	int casper, natalie, casperBest = 0, natalieBest = 0;
	
	std::cin >> casper;
	for (int i = 0, w, l; i < casper; i++) {
		std::cin >> w >> l;
		casperBest = std::max(casperBest, w * l);
	}

	std::cin >> natalie;
	for (int i = 0, w, l; i < natalie; i++) {
		std::cin >> w >> l;
		natalieBest = std::max(natalieBest, w * l);
	}

	std::cout << (casperBest > natalieBest ? "Casper" : (casperBest == natalieBest ? "Tie" : "Natalie")) << '\n';
}