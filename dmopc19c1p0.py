import sys

big = -10 ** 9
small = 10 ** 9
times = int(sys.stdin.readline())
numbers = list(map(int, sys.stdin.readline().split()))
for i in numbers:
	if i > big:
		big = i
	if i < small:
		small = i
print(big - small)