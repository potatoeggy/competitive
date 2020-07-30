import sys

def string_and_int(value):
	try:
		return int(value)
	except ValueError:
		return value

vets = []
for _ in range(int(input())):
	vets.append(tuple(map(string_and_int, sys.stdin.readline().split())))
vets.sort(key=lambda tup: tup[1])

for _ in range(int(input())):
	base, tolerance = tuple(map(int, sys.stdin.readline().split()))
	found = False
	for i in range(len(vets)):
		if base <= vets[i][1] <= base + tolerance:
			print(vets[i][0])
			found = True
			break
	if not found: print("No suitable teacher!")
