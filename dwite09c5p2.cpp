#include <iostream>

bool primes[101];
int main() {
	int times = 5;
	primes[1] = true;
	for (int i = 2; i < 101; i++) {
		if (!primes[i]) {
			for (int j = i + i; j < 101; j += i) {
				primes[j] = true;
			}
		}
	}
	while (times--) {
		int num; std::cin >> num;
		int upCounter = 0, downCounter = 0;
		int ans;
		
		int i = 0;
		for (; upCounter != 2 && downCounter != 2;) {
			i++;
			if (num + i < 101 && !primes[num+i]) upCounter++;
			if (num - i > 1 && !primes[num-i]) downCounter++;
		}
		ans = upCounter == 2 ? num + i : num - i;
		std::cout << ans << '\n';
	}
	return 0;
}