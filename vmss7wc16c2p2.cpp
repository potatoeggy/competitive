#include <iostream>

int gees[(int) 10e5 + 1]; // woa cool
int main() {
	std::ios::sync_with_stdio(false);
	std::cin.tie(0);

	std::string string; std::cin >> string;
	for (int i = 1; i <= string.length(); i++) {
		if (string[i-1] == 'G') gees[i]++;
		gees[i+1] = gees[i];
	}

	int times; std::cin >> times;
	while (times--) { // wao cool
		int start, end; std::cin >> start >> end;
		std::cout << gees[end+1] - gees[start] << '\n';
	}
	return 0;
}