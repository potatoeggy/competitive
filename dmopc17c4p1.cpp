#include <iostream>
#include <cstring>
using namespace std;

int ribbon[100001];
int main() {
	cin.sync_with_stdio(0);
	cin.tie(0);

	int size, times;
	cin >> size >> times;

	int start, end;
	for (int i = 0; i < times; i++) {
		cin >> start >> end;
		if (ribbon[start] < end-start) {
			ribbon[start] = end-start;
		}
	}

	int buffer = 0;
	int acc = 0;
	for (int i = 0; i < size; i++) {
		if (ribbon[i] > buffer) {
			buffer = ribbon[i];
		}

		if (buffer != 0) {
			buffer--;
		} else {
			acc++;
		}
	}
	cout << acc << " " << size-acc << '\n';
}