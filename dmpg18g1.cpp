#include <iostream>
#include <stack>

int chairs[1000001];
int main() {
	int numChairs, emptyChairs; std::cin >> numChairs >> emptyChairs;
	
	for (int i = 0; i < emptyChairs; i++) {
		int x; std::cin >> x;
		chairs[x-1] = -1;
	}

	for (int i = 0; i < emptyChairs + 1; i++) {
		int index; std::cin >> index;
		chairs[index-1] = chairs[index-1] == 0 ? i+1 : 0;
	}

	std::stack<int> stack;
	while (true) {
		for (int i = 0; i < numChairs; i++) {
			if (chairs[i] == -1) {
				if (stack.size() > 0) {
					chairs[i] = 0;
					stack.pop();
				}
			}
			if (chairs[i] != 0 && chairs[i] != -1) {
				stack.push(chairs[i]);
				chairs[i] = 0;
			}
		}

		if (stack.size() == 1) break;
	}

	std::cout << stack.top() << '\n';
	return 0;
}