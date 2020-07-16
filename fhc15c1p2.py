import sys

cases = int(sys.stdin.readline())
for n in range(1, cases + 1):
	db = set()
	times = int(sys.stdin.readline())
	counter = 0
	for _ in range(times):
		word = sys.stdin.readline()[:-1]
		db.add(word)
		for i in range(1, len(word) + 1):
			if not word[0:i] in db:
				db.add(word[0:i])
				counter += i
				break
			elif i == len(word):
				counter += i
	print("Case #", n, ": ", counter, sep="") # i don't understand the question

# why isn't sample case 3 9