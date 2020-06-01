#include <iostream>
#include <algorithm>
#define BIGNUMBER 5000001

int friends[5005], optimised[5005];
int times;

int whyIsThereNoThreeWaySorting[3];
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	std::fill(std::begin(optimised), std::end(optimised), BIGNUMBER);

	std::cin >> times;
	for (int i = 1; i <= times; i++) {
		std::cin >> friends[i];
	}

	optimised[1] = friends[1];
	for (int i = 1; i < times; i++) {
		// 1, full price
		// 2, cheaper of 2 is 25% off
		// 3, cheapest of 3 is 50% off
		// the first number is never optimised so you're doing this wrong
		// i don't wanna think anymore
		optimised[i] = std::min(optimised[i], optimised[i-1]+friends[i]);
		optimised[i+1] = std::min(optimised[i+1], optimised[i-1]+std::max(friends[i], friends[i+1])
															+std::min(friends[i], friends[i+1])*3/4);

		whyIsThereNoThreeWaySorting[0] = friends[i];
		whyIsThereNoThreeWaySorting[1] = friends[i+1];
		whyIsThereNoThreeWaySorting[2] = friends[i+2];
		std::sort(std::begin(whyIsThereNoThreeWaySorting), std::end(whyIsThereNoThreeWaySorting));
		optimised[i+2] = std::min(optimised[i+2], optimised[i-1]+whyIsThereNoThreeWaySorting[0] / 2 + whyIsThereNoThreeWaySorting[1] + whyIsThereNoThreeWaySorting[2]);
	}
	std::cout << optimised[times] << "\n";
	for (int i = 0; i < times+2; i++) {
		std::cout << optimised[i] << " ";
	}
}