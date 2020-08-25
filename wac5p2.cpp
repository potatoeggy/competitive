#include <iostream>

int array[200000];
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	int length, times; std::cin >> length >> times;
	for (int i = 0; i < length; i++) {
		std::cin >> array[i];
	}

	for (int i = 0; i < times; i++) {
		int limit, accuracy; std::cin >> limit >> accuracy;
		// double for..?
		int ans = 0;
		for (int j = length-1; j >= 0; j--) {
			if (abs(array[j] - limit) <= accuracy) {
				ans++;
			} else {
				break;
			}
		}
		std::cout << ans << '\n';
	}

	return 0;
}