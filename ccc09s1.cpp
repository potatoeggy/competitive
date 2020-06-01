#include <iostream>
#include <cmath>
#include <algorithm>
using namespace std;

int a, b, rt;
int main() {
	cin.sync_with_stdio(0);
	cin.tie(0);

	cin >> a >> b;
	rt = 0;
	if (pow((int) pow(a, 1.0/6), 6) == a) rt++;
	for (int i = (int) pow(a, 1.0/6) + 1; pow(i, 6) <= b; i++) {
		rt++;
	}

	cout << rt;
}