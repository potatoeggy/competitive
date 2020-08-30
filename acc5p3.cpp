#include <algorithm>
#include <iostream>
#include <vector>

int main() {
	std::vector<int> discounts;
	int blocks, coupons; std::cin >> blocks >> coupons;
	
	long long total = 0;
	for (int i = 0; i < blocks; i++) {
		int price, discount; std::cin >> price >> discount;
		discounts.push_back(price-discount);
		total += price;
	}

	std::sort(discounts.begin(), discounts.end(), std::greater<int>());
	for (int i = 0; i < coupons; i++) total -= discounts.at(i);
	std::cout << total << '\n';
	return 0;
}