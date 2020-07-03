import sys

max = 0

times = int(sys.stdin.readline())
best = 0

for i in range(times):
	temp = sys.stdin.readline()[:-1].split(" ")
	if best < abs(int(temp[0]) - int(temp[1])):
		best = abs(int(temp[0]) - int(temp[1]))

print(best)