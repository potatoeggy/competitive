import sys

combinations = set()
rows = int(sys.stdin.readline())
columns = int(sys.stdin.readline())

grid = []
for i in range(rows):
	grid.append(list(map(bool, sys.stdin.readline().split(" "))))

# okey so problem is
# you need to find all reachable xors of row 1
# so this is like word scrambler?
# do we *have* to hit all the lights or can we hit, e.g., only one?