import sys

times = int(sys.stdin.readline())

total = 0
for i in range(times):
	total += float(format(float(sys.stdin.readline()), ".5f"))

print(format(total % 360, ".5f"))
