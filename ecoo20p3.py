import sys

cases = int(sys.stdin.readline())
for _ in range(cases):
	captchas = int(sys.stdin.readline())
	for _ in range(captchas):
		height, width = map(int, sys.stdin.readline().split())
		number = []
		for i in range(height):
			number.append(sys.stdin.readline()[:-1])

		# clean up trailing thingies
		for i in range(len(number)):
			if "*" in number[i]:
				break
			else:
				del number[i]
		for i in reversed(range(len(number))):
			if "*" in number[i]:
				break
			else:
				del number[i]
		# i hate padding screw this