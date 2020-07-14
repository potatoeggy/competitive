#include <iostream>

int purse[2000];
int precompiled[2000];
int fakeKnapsack(int price, int coinsAllowed) {
	for (int i = // hell if i know
	return 0;
}

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	int coins, stores; std::cin >> coins >> stores;
	for (int i = 0; i < coins; i++) {
		std::cin >> purse[i];
	}

	for (int i = 0, price, coinsAllowed; i < stores; i++) {
		std::cin >> price >> coinsAllowed;
		std::cout << fakeKnapsack(price, coinsAllowed) << '\n';
	}

	return 0;
}