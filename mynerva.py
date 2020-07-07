import sys
import queue

def bfs(adj, colour, islands):
	visited = [False for i in range(islands)]
	distance = [1000000 for i in range(islands)]
	brightness = [(0 if colour == "White" else 1000000) for i in range(islands)] # what if one path *looks* like it has better brightness but it really doesn't (is dp needed)
	visited[1] = True
	distance[1] = 0
	brightness[1] = 0
	q = queue.Queue()
	q.put((1, 0))
	while not q.empty():
		cur = q.get()
		for node in adj[cur[0]]:
			if not visited[node[0]]:
				visited[node[0]] = True
				brightness[node[0]] = brightness[cur[0]] + node[1]
				distance[node[0]] = distance[cur[0]] + 1
				q.put((node[0], brightness[node[0]] + node[1]))
			
#			elif distance[cur[0]] + 1 < distance[node[0]]:
#				distance[node[0]] = distance[cur[0]] + 1
#				brightness[node[0]] = brightness[node[0]] + node[1]
#				q.put((node[0], brightness[cur[0]] + node[1]))
			
			elif distance[cur[0]] + 1 == distance[node[0]]:
				if colour == "White" and brightness[node[0]] < brightness[cur[0]] + node[1] or colour == "Black" and brightness[node[0]] > brightness[cur[0]] + cur[1]:
					brightness[node[0]] = brightness[cur[0]] + cur[1]
					q.put((node[0], brightness[node[0]] + node[1]))

	return (distance, brightness)

islands_bridges = list(map(int, sys.stdin.readline().split(" ")))
islands = [[] for i in range(islands_bridges[0] + 1)]

for _ in range(islands_bridges[1]):
	path = tuple(map(int, sys.stdin.readline().split(" ")))
	islands[path[0]].append((path[1], path[2]))
	islands[path[1]].append((path[0], path[2]))

precomp_white = bfs(islands, "White", len(islands))
precomp_black = bfs(islands, "Black", len(islands))

queries = int(sys.stdin.readline())
for _ in range(queries): # this looks like it'll tle there is probably a more efficient way to do this
	query = sys.stdin.readline()[:-1].split(" ")
	query[0] = int(query[0])
	if query[1] == "White":
		print(precomp_white[0][query[0]], precomp_white[1][query[0]])
	else:
		print(precomp_black[0][query[0]], precomp_black[1][query[0]])