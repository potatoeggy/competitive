import sys

times = int(sys.stdin.readline())

for i in range(times):
	sentence = sys.stdin.readline()[:-1].split(" ")
	for i in sentence:
		if len(i) == 4:
			print("*" * 4, end=" ")
		else:
			print(i, end=" ")
	print()