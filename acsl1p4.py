players, games = map(int, input().split())

adj = [[None] for _ in range(players + 1)]
for _ in range(games):
	a, b, s_a, s_b = map(int, input().split())
	if s_a > s_b: adj[b].append(a)
	elif s_b > s_a: adj[a].append(b)

