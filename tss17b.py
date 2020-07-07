import sys

houses_and_scenarios = list(map(int, sys.stdin.readline().split(" ")))
houses = []
for _ in range(houses_and_scenarios[0]):
	xy = tuple(map(int, sys.stdin.readline().split(" ")))
	houses.append(xy[0] ** 2 + xy[1] ** 2)
houses.sort()

for _ in range(houses_and_scenarios[1]):
	kaboom = int(sys.stdin.readline())
	for i in range(len(houses)):
		if houses[i] >= kaboom ** 2:
			print(i)
			break
