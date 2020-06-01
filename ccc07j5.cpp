#include <iostream>
#include <algorithm>

int min, max, times;
long long best[35];
long long motels[35] = {0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000};

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	// motels[0] = 0; motels[1] = 990; motels[2] = 1010; motels[3] = 1970; motels[4] = 2030; motels[5] = 2940; motels[6] = 3060; motels[7] = 3930; motels[8] = 4060; motels[9] = 4970; motels[10] = 5030; motels[11] = 5990; motels[12] = 6010; motels[13] = 7000;

	std::cin >> min >> max >> times;

	for (int i = 14; i < times+14; i++) {
		std::cin >> motels[i];
	}

	std::sort(motels, motels + sizeof(motels)/sizeof(motels[0]));
	best[21-times] = 1;
	for (int i = 21-times; i < 35; i++) {
		for (int j = i+1; j < 35; j++) {
			if (motels[j] - motels[i] >= min && motels[j] - motels[i] <= max) {
				best[j] += best[i];
			}
		}
	}

	std::cout << best[34] << "\n";
}