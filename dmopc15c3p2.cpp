#include <iostream>
#define ll long long

ll friends[int(10e5)];
int main() {
	ll sum = 0, times; std::cin >> times;
	for (ll i = 0, tmp; i < times; i++){
		std::cin >> tmp;
		sum += tmp;
		friends[i] = tmp;
	}

	if (sum % times != 0) {
		std::cout << "Impossible\n";
	} else {
		ll mean = sum / times;
		ll modifiers = 0;
		for (int i = 0; i < times; i++) {
			modifiers += std::abs(friends[i]-mean);
		}
		std::cout << (modifiers / 2) << '\n';
	}

	return 0;
}