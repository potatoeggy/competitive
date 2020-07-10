#include <iostream>
#include <math.h>
#define BIG_NUMBER 1000000007LL
int holder[3];

int main() {
	holder[1] = 1;
	long long number; std::cin >> number;
	double Phi = (1 + sqrt(5)) / 2.0;
	double phi = (1 - sqrt(5)) / 2.0;
	std::cout << (long long)((pow(Phi, number) - pow(phi, number)) / sqrt(5)) % BIG_NUMBER << '\n';
}