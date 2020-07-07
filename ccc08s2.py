import sys
from bisect import bisect_right

points = []
for i in range(25001):
	for j in range(25001):
		temp = (i ** 2 + j ** 2)*2-1
		points.append(temp)
		points.append(temp)

points.sort()
radius = int(sys.stdin.readline())
while radius != 0:
	print(bisect_right(points, radius))
	radius = int(sys.stdin.readline())