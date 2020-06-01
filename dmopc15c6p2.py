import sys

times = int(sys.stdin.readline())

total = 0
for i in range(times):
	total += float(sys.stdin.readline())

print(format(total % 360, '.5f'))