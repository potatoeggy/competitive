#include <iostream>
#include <vector>

int team;

int score(std::vector<std::vector<int>> games) {
	// probably don't need to recalculate but instead use list of games needed with list of current scores
	int points[5];
	for (int i = 0; i < 5; i++) points[i] = 0;
	int wins = 0;
	for (int i = 4; i >= 1; i--) {
		for (int j = 4; j > i; j--) {
			if (games[i][j] == -1) {
				games[i][j] = 3;
				wins += score(games);
				games[i][j] = 1;
				wins += score(games);
				games[i][j] = 0;
				wins += score(games);
				return wins;
			} else {
				if (games[i][j] == 3) points[i] += 3;
				else if (games[i][j] == 1) {
					points[i]++;
					points[j]++;
				} else {
					points[j] += 3;
				}
			}
		}
	}

	for (int i = 1; i < 5; i++) {
		if (i != team && points[i] >= points[team]) return 0;
	}
	return 1;
}

int main() {
	int gamesPlayed; std::cin >> team >> gamesPlayed;
	std::vector<std::vector<int>> games(5, std::vector<int>(5, -1));

	for (int i = 0; i < gamesPlayed; i++) {
		int team1, team2, score1, score2; std::cin >> team1 >> team2 >> score1 >> score2;
		if (score1 > score2) {
			games[team1][team2] = 3;
		} else if (score1 == score2) {
			games[team1][team2] = 1;
		} else {
			games[team1][team2] = 0;
		}
	}

	std::cout << score(games) << '\n';
	return 0;
}