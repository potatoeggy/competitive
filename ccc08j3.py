gps = [
	"ABCDEF",
	"GHIJKL",
	"MNOPQR",
	"STUVWX",
	"YZ -.\n"
]

string = input() + "\n"
x = y = 0
moves = 0
for c in string:
	for i in range(len(gps)):
		for j in range(len(gps[i])):
			if gps[i][j] == c:
				moves += abs(i-x) + abs(j-y)
				x = i
				y = j
print(moves)