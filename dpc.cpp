#include <iostream>

int lines;
int bigones[100001][3];
int best[100001][3];
/*
int recursion(int level, int cur) {
	if (level == lines) return 0;

	int temp1 = 0;
	int temp2 = 0;
	int temp3 = 0;
	if (cur == 0 || cur == 2) {
		temp1 = best[level+1][1] != 0 ? best[level+1][1] : recursion(level+1, 1);
	} 
	if (cur == 0 || cur == 1) {
		temp2 = best[level+1][2] != 0 ? best[level+1][2] : recursion(level+1, 2);
	}
	if (cur == 1 || cur == 2) {
		temp3 = best[level+1][0] != 0 ? best[level+1][0] : recursion(level+1, 0);
	}

	best[level][cur] = std::max(temp1, std::max(temp2, temp3))+bigones[level][cur];
	return best[level][cur];
}
*/

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	std::cin >> lines;

	int a, b, c, olda=0, oldb=0, oldc=0;
	for (int i = 0; i < lines; i++) {
		std::cin >> a >> b >> c;
		a = std::max(a+oldb, a+oldc);
		b = std::max(b+olda, b+oldc);
		c = std::max(c+olda, c+oldb);
		olda = a;
		oldb = b;
		oldc = c;
	}

	std::cout << std::max(olda, std::max(oldb, oldc));
	//std::cout << std::max(recursion(0, 0), std::max(recursion(0, 1), recursion(0, 2)));
}