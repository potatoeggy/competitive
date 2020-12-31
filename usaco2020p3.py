def cow(val):
	try: return int(val)
	except ValueError: return val

cows = []
vis = set()
for i in range(int(input())):
	cows.append(list(map(cow, input().split())))
	vis.add((cows[i][1], cows[i][2]))

dis = [0 for i in range(len(cows))]

for i in range(1, 10**9):
	new = set()
	for c in range(len(cows)):
		if cows[c] == 0: continue
		x = cows[c][1] + (i if cows[c][0] == "E" else 0)
		y = cows[c][1] + (i if cows[c][0] == "N" else 0)
		if (x, y) in vis:
			cows[c] = 0
			dis[c] = i
		new.add((x, y))
	
	vis.update(new)

for i in dis:
	if i == 10**9-1: print("Infinity")
	else: print(i)
