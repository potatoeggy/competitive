#include <iostream>
#include <vector>
#include <queue>

int lines, start, end, escalators;
int x, y;
int num;
std::vector<int> adj[1001];
std::queue<int> q;
bool vis[1001];
int dis[1001];

int main() {
	std::cin.sync_with_stdio(0);
	std::cin.tie(0);
	std::cin >> lines >> start >> end >> escalators;

	for (int i = 0; i < escalators; i++) {
		std::cin >> x >> y;
		adj[x].push_back(y);
	}

	q.push(start);
	while (!q.empty()) {
		num = q.front();
		q.pop();
		for (int i : adj[num]) {
			if (!vis[i]) {
				vis[i] = true;
				dis[i] = dis[num] + 1;
				q.push(i);
			}
		}
	}
	std::cout << dis[end] << "\n";
}