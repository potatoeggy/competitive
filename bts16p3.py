import sys

combinations = int(input())
names = sys.stdin.readline()[:-1].split()
for i in range(len(names)-1):
	counter = 1
	while i + counter < len(names) and names[i][0].lower() == names[i+counter][0].lower():
		counter += 1
		combinations += 1 # this part could probably be optimised even further

print(combinations % 1000000007)