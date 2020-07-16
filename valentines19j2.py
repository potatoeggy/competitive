import sys
lines = int(sys.stdin.readline())
counter = 0
for i in range(lines):
	r, g, b = (map(int, sys.stdin.readline().split()))
	if 240 <= r <= 255 and 0 <= g <= 200 and 95 <= b <= 220:
		counter += 1
print(counter)