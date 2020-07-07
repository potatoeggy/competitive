import sys

for _ in range(5):
	times = int(sys.stdin.readline())
	empty_list = []
	for _ in range(times):
		empty_list.append(int(sys.stdin.readline()))
	for i in range(1, times + 2):
		if not i in empty_list:
			print(i)
			break