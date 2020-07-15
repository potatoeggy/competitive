import sys

# precompute
precompiled = [0 for i in range(10 ** 10 + 1)] # yeah this certainly fits in mem yep
times, divider = (map(int, sys.stdin.readline().split(" ")))
latest = divider
for i in range(divider, len(precompiled), divider):
	if str(i) == str(i)[::-1]:
		precompiled[i] = precompiled[latest]
		precompiled[i] += 1
		latest = i
for _ in range(times):
	start, end = (map(int, sys.stdin.readline().split(" ")))
	print(precompiled[end] - precompiled[start])