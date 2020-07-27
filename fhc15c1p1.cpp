#include <iostream>
#define INF (int) 10e7 + 1

int primes[INF];
int main() {
	std::ios::sync_with_stdio(0);
	std::cin.tie(0);
	for (int i = 2; i < INF; i++) {
		if (!primes[i]) {
			primes[i]++;
			for (int j = i + i; j < INF && j > 0; j += i) {
				primes[j]++;
			}
		}
	}

	int questions; std::cin >> questions;
	
	for (int question = 1; question <= questions; question++) {
		int a, b, primacity; std::cin >> a >> b >> primacity;
		int counter = 0;
		if (primacity <= 8) for (int i = a; i <= b; i++) {
			if (primes[i] == primacity) counter++;
		}
		std::cout << "Case #" << question << ": " << counter << '\n';
	}
	return 0;
}