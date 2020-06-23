import sys

for i in range(5):
	temp = sys.stdin.readline().split(" ")
	temp[0] = int(temp[0])
	temp[1] = int(temp[1])

	if temp[1] == 0:
		print("*" * 10)
	else:
		candy = (temp[0] * 10) // (temp[0] + temp[1])
		print("*" * candy + "." * (10-candy))