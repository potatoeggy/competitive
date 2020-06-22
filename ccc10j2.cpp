#include <iostream>

// this problem is going to kill me so i'm going to implement a simple foolproof system
int nikkyForward, nikkyBackward;
int byronForward, byronBackward;
int nikkySteps, byronSteps;
int steps;

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	nikkySteps = byronSteps = 0;

	std::cin >> nikkyForward >> nikkyBackward >> byronForward >> byronBackward >> steps;

	for (int i = 0, nikkyCounter = 0, byronCounter = 0; i < steps; i++, nikkyCounter++, byronCounter++) {
		if (nikkyCounter < nikkyForward) {
			nikkySteps++;
		} else {
			nikkySteps--;
		}

		if (byronCounter < byronForward) {
			byronSteps++;
		} else {
			byronSteps--;
		}

		if (nikkyCounter == nikkyForward + nikkyBackward) nikkyCounter = 0;
		if (byronCounter == byronForward + byronBackward) byronCounter = 0;
	}

	if (byronSteps != nikkySteps) {
		std::cout << (byronSteps > nikkySteps ? "Byron" : "Nikky") << '\n';
	} else {
		std::cout << "Tied\n";
	}

	return 0;
}