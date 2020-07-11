#include <iostream>
#include <vector>
#include <set>
// sample cases are find but the actual thing fails and idk why oh well
int favourite, gamesPlayed;
int scores[5][5];
std::set<std::vector<int>> finalScoreStorage;

int recursion(int oldScores[5][5]) { // consider using vectors over arrays
	int localScores[5][5];
	int finalScores[5] = {0, 0, 0, 0, 0};
	int tally = 0;
	for (int i = 0; i <= 4; i++) {
		for (int j = 0; j <= 4; j++) {
			localScores[i][j] = oldScores[i][j];
			finalScores[i] += localScores[i][j];
		}
	}

	bool complete = true;
	for (int i = 1; i <= 4; i++) {
		for (int j = i + 1; j <= 4; j++) {
			if (localScores[i][j] == 0 && localScores[j][i] == 0) { // we are duplicating matches
				complete = false;
				localScores[i][j] += 3;
				tally += recursion(localScores);
				localScores[i][j] -= 3;
				localScores[j][i] += 3;
				tally += recursion(localScores);
				localScores[i][j] += 1;
				localScores[j][i] -= 2;
				tally += recursion(localScores);
			}
		}
	}


	if (complete) {
		if (finalScores[favourite] == std::max(finalScores[1], std::max(finalScores[2], std::max(finalScores[3], finalScores[4])))) {
			int size = finalScoreStorage.size();
			finalScoreStorage.insert({finalScores[1], finalScores[2], finalScores[3], finalScores[4]});
			if (size != finalScoreStorage.size()) tally++;
		}
	}
	return tally;
}

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);

	std::cin >> favourite >> gamesPlayed;
	for (int i = 0, t1, t2, s1, s2; i < gamesPlayed; i++) {
		std::cin >> t1 >> t2 >> s1 >> s2;
		if (s1 > s2) {
			scores[t1][t2] += 3;
		} else if (s1 < s2) {
			scores[t2][t1] += 3;
		} else {
			scores[t1][t2] += 1;
			scores[t2][t1] += 1;
		}
	}

	std::cout << recursion(scores) << '\n';

	return 0;
}