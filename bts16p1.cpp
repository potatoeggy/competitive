#include <iostream>
#include <algorithm>
#include <string.h>
using namespace std;

int main() {
	cin.sync_with_stdio(0);
	cin.tie(0);
	string input;
	getline(cin, input);
	char array[input.length()];
	strncpy(array, input.c_str(), sizeof(array));

	int upper = 0;
	int lower = 0;
	for (int i = 0; i < sizeof(array); i++) {
		if (array[i] == toupper(array[i])) {
			upper++;
		} else {
			lower++;
		}
	}
	if (upper > lower) {
		transform(input.begin(), input.end(), input.begin(), ::toupper);
	} else if (lower > upper) {
		transform(input.begin(), input.end(), input.begin(), ::tolower);
	}
	cout << input; // how to cpp :(
}