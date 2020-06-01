#include <iostream>
#include <algorithm>
using namespace std;

int written = 0;
int times;
string input;

int main() {
	cin.sync_with_stdio(0);
	cin.tie(0);

	cin >> times;
	for (int i = 0; i < times; i++) {
		cin >> input;
		if (input.size() <= 10) written++;
	}
	cout << written;
}