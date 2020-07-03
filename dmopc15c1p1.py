import sys

times = int(sys.stdin.readline())
best = -1.0
best_name = ""

for i in range(times):
	anime = sys.stdin.readline()[:-1]
	anime_score = float(anime.split(" ")[1])
	if anime_score > best:
		best = anime_score
		best_name = anime.split(" ")[0]
print(best_name)