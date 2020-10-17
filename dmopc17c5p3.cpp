#include <iostream>
#include <algorithm>

int main() {
	int times; std::cin >> times;
	long long common;
	std::cin >> common;
	for (int i = 1; i < times; i++) {
		long long tmp;
		std::cin >> tmp;
		common = std::__gcd(common, tmp);
	}

	for (long long i = 2; i * i <= common;) {
		if (common % i != 0) i++;
		else common /= i;
	}

	std::cout << (common != 1 ? std::to_string(common) : "DNE") << '\n';
	return 0;
}