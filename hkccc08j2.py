import sys

times = int(sys.stdin.readline())

for i in range(times):
	x = sys.stdin.readline()[:-1]
	x_int = int(x)
	while x_int > 9:
		x_int = 0
		for c in x:
			x_int += int(c)
		x = str(x_int)
	print(x)