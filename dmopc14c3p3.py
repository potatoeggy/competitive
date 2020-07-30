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
	for pair in vets:
		if base <= pair[1] <= base + tolerance:
			print(pair[0])
			found = True
			break
	if not found: print("No suitable teacher!")
