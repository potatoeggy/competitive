import sys

princesses = []
minutes = []
best = [] # this is going to bite me later

temp = sys.stdin.readline().split(" ")
cages = int(temp[0])
limit = int(temp[1])

def recursion(level, capacity, value):
	if capacity < 0:
		return -1
	if level < 0 or capacity == 0:
		return value
	return max(recursion(level-1, capacity, value), recursion(level-1, capacity-minutes[level], value+princesses[level]))

for i in range(cages):
	temp = sys.stdin.readline().split(" ")
	princesses.append(int(temp[0]))
	minutes.append(int(temp[1]))
print(recursion(cages-1, limit, 0))