import sys

medians = []
times = int(sys.stdin.readline())
for _ in range(times):
	array = list(map(int, sys.stdin.readline().split()))
	array.sort()
	if len(array) % 2 == 0:
		medians.append(array[int(len(array) / 2 - 1)])
	else:
		medians.append(array[int(len(array) / 2)])

medians.sort()
if len(medians) % 2 == 0:
	print(medians[int(len(medians) / 2 - 1)])
else:
	print(medians[int(len(medians) / 2)])