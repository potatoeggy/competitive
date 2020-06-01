#include <iostream>
#include <algorithm>
using namespace std;

int days, t, temp, trees;
int main() {
	cin.sync_with_stdio(0);
	cin.tie(0);

	cin >> days;

	for (int i = 0; i < days; i++) {
		cin >> t;
		trees = 0;
		for (int j = 0; j < t; j++) {
			cin >> temp;
			trees += temp;
		}
		if (trees != 0) {
			cout << "Day " << i+1 << ": " << trees << '\n';
		} else {
			cout << "Weekend" << '\n';
		}
	}
}