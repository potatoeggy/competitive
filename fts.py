import sys

sys.stdin.readline()
string = sys.stdin.readline()[:-1]
boolean_string = [i == "0" for i in string]

flips = 0
for i in reversed(range(len(boolean_string))):
	if flips % 2 == 0 and not boolean_string[i] or flips % 2 == 1 and boolean_string[i]:
		flips += 1

print(flips)