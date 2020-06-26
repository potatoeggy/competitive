import sys

def isMonkey(string):
	if string == "":
		return False
	
	possibleMonkey = False
	for i in range(len(string)):
		if string[i] == "N":
			if i == len(string)-1:
				if not possibleMonkey:
					possibleMonkey = False
			else:
				if not possibleMonkey:
					possibleMonkey = isA(string[0:i]) and isMonkey(string[i+1:])

	return possibleMonkey or isA(string)

def isA(string):
	if string == "":
		return False
	elif string == "A":
		return True
	elif string[0] == "B" and string[len(string)-1] == "S":
		return isMonkey(string[1:-1])
	return False

string = sys.stdin.readline()[:-1]
while string != "X":
	print("YES" if isMonkey(string) else "NO")
	string = sys.stdin.readline()[:-1]