import sys

number = sys.stdin.readline()[:-1]
counter = [0 for i in range(3)]
for i in range(3):
	counter[0] += int(number[i])

for i in range(4, 7):
	counter[1] += int(number[i])

for i in range(8, 12):
	counter[2] += int(number[i])

if counter[0] == counter[1] and counter[1] == counter[2]:
	print("Goony!")
else:
	print("Pick up the phone!")