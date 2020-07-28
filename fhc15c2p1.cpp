#include <iostream>
#include <deque>
#include <stack>

int main() {
	std::ios::sync_with_stdio(0);
	std::cin.tie(0);
	int cases; std::cin >> cases;
	for (int i = 1; i <= cases; i++) {
		int times; std::cin >> times;
		std::stack<int> pile;
		while (times--) {
			int x; std::cin >> x;
			pile.push(x); // if tle do calculations in this loop kinda like reverse thing
		}
		int largest = pile.top(); pile.pop();
		int smallest = pile.top();
		if (pile.top() > largest) {
			smallest = largest;
			largest = pile.top();
		}
		pile.pop();
		std::cout << smallest << " " << largest << '\n'; // nvm this is hard now since you can move both sides of a queue
		bool failed = false;
		while (!pile.empty()) {
			if (pile.top() > largest) {
				largest = pile.top();
			} else if (pile.top() < smallest) {
				smallest = pile.top();
			} else {
				failed = true;
				break;
			}
			pile.pop();
		}
		
		std::cout << "Case #" << i << ": " << (failed ? "no" : "yes") << '\n';
	}
	return 0;
}