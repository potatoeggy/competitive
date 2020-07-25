#include <iostream>

bool coveredHouses[100001];

int main() {
	int houses, times, requirement; std::cin >> houses >> times >> requirement;
	while (times--) {
		int camera; std::cin >> camera;
		coveredHouses[camera] = true;
	}

	int addedCameras = 0;
	for (int i = 1; i <= houses - requirement; i++) {
		int camerasInArea = 0;
		for (int num = i + requirement; i < num; i++) { // yikes double for
			if (coveredHouses[i]) camerasInArea++;
		}
		if (camerasInArea < 2) addedCameras += 2 - camerasInArea;
	}
	std::cout << addedCameras << '\n';
}