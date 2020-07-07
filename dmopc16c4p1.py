import sys
times = int(sys.stdin.readline())

powers = []
for i in range(63):
	powers.append(2 ** i)

for i in range(times):
	query = int(sys.stdin.readline())
	print("T" if query in powers else "F")