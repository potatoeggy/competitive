import sys

crayolas = {"red": 0, "orange": 0, "yellow": 0, "green": 0, "blue": 0, "black": 0}

sys.stdin.readline()
list_of_crayons = sys.stdin.readline()[:-1].split()
for s in list_of_crayons:
	crayolas[s] += 1

crayolas = {key: value for key, value in reversed(sorted(crayolas.items(), key=lambda item: item[1]))}
failed = False
counter = 0
while not failed:
	failed = True
	if list(crayolas.values())[1] == 0 and list(crayolas.values())[0] > 0:
		counter += 1
		break
	for item in crayolas: # i don't think this is optimal
		if crayolas[item] > 0:
			crayolas[item] -= 1
			counter += 1
			failed = False

print(counter) # no i will not editorial