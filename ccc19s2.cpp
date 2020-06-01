#include <iostream>
using namespace std;

int main() {
	int times;
	scanf("%d", &times);

	bool *primes = new bool[2000001];
	primes[2] = true;
	for (int i = 3; i < 2000001; i += 2) {
		if (i % 2 == 0) {
			primes[i] = false;
			continue;
		}
		primes[i] = true;
		for (int j = 3; j * j <= i; j += 2) {
			if (i % j == 0) {
				primes[i] = false;
				break;
			}
		}
	}
	primes[3] = true;
		
	int num;
	bool solved;
	for (int i = 0; i < times; i++) {
		scanf("%d", &num);
		solved = false;
		for (int j = num; j >= 2; j -= 2) {
			if (j % 2 == 0 && j != 2) j++;
			if (! solved) {
				for (int k = num; k <= num * 2; k += 2) {
					if (k % 2 == 0) k--;
					if (2 * num < j + k) break;
					if (primes[j]) {
						if (primes[k]) {
							if (2 * num == j + k) {
								cout << j + " " + k;
								solved = true;
								break;
							}
						}
					}
				}
			}
		}
	}
}
