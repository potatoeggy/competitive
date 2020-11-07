#include <iostream>
#define MAX 100001
typedef long long ll;

int original[MAX];
ll bit[MAX];
ll freqBit[MAX];

void add(ll* array, int position, int value) {
	for (int i = position; i < MAX; i += i & -i) array[i] += value;
}

ll query(ll* array, int position) {
	ll sum = 0;
	for (int i = position; i >= 1; i -= i & -i) sum += array[i];
	return sum;
}

int main() {
	int size, commands; std::cin >> size >> commands;
	// construction
	for (int i = 1, tmp; i <= size; i++) {
		std::cin >> tmp;
		original[i] = tmp;
		add(bit, i, tmp);
		add(freqBit, tmp, 1);
	}

	for (int i = 0; i < commands; i++) {
		char com; std::cin >> com;
		if (com == 'Q') {
			int value; std::cin >> value;
			std::cout << query(freqBit, value) << '\n';
		} else {
			int x, y; std::cin >> x >> y;
			if (com == 'C') {
				add(bit, x, -original[x]+y);
				add(freqBit, original[x], -1);
				add(freqBit, y, 1);
				original[x] = y;
			} else if (com == 'S') {
				std::cout << (query(bit, y) - query(bit, x-1)) << '\n';
			}
		}
	}
}