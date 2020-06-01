#include <iostream>
#include <algorithm>

using namespace std;

int a, b;
int main() {
	cin.sync_with_stdio(0);
	cin.tie(0);

	cin >> a >> b;

	if (a > b) {
		cout << "CS452";
	} else if (a < b) {
		cout << "PHIL145";
	}
}