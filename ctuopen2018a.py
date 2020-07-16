import sys
die = "".join(sys.stdin.readline()[:-1] for i in range(3))

counter = 0
for i in die:
	if i == "o":
		counter += 1

possible = [False for i in range(7)]

# we only need to check the ones that apply to the counter
possible[1] = die[4] == "o"
possible[2] = die[0] == "o" and die[8] == "o"
if die[2] == "o" and die[6] == "o":
	possible[4] = possible[2]
	possible[2] = True
possible[3] = possible[2] and possible[1]
possible[5] = possible[1] and possible[4]
possible[6] = possible[4] and (die[1] == "o" and die[7] == "o" or die[3] == "o" and die[5] == "o")

print(counter if counter < 7 and possible[counter] else "unknown")