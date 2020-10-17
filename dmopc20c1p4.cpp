#include <iostream>

const int MOD = 1000000007;

int sum(long long *array, int elements) {
	long long result = 0;
	for (int i = 1; i < elements + 1; i++) {
		result += array[i];
		result %= MOD;
	}
	return result;
}

long long babyTimer[101];
int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	long long months, adultCrabs;
	int babiesPerCrab, growMonth;
	std::cin >> months >> babiesPerCrab >> growMonth >> adultCrabs;
	
	for (int i = 0; i < months; i++) {
		adultCrabs += babyTimer[growMonth];
		adultCrabs %= MOD;
		for (int j = growMonth; j >= 0; j--) {
			babyTimer[j+1] = babyTimer[j];
		}
		babyTimer[0] = (adultCrabs * babiesPerCrab) % MOD;
	}

	std::cout << ((adultCrabs*2 + sum(babyTimer, growMonth)) % MOD) << '\n';
	return 0;
}
