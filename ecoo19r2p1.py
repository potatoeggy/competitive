import sys

for _ in range(3):
	times = int(sys.stdin.readline())
	db = set()
	for _ in range(times):
		untouched = sys.stdin.readline()[:-1].lower().split("@")
		untouched[0] = untouched[0].replace(".", "")
		for i in range(len(untouched[0])):
			if untouched[0][i] == "+":
				untouched[0] = untouched[0][:i]
				break
		db.add(untouched[0] + untouched[1])
	print(len(db)) # no clue what's wrong