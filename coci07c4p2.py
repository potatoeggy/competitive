import math

num = input()
sorted_num = sorted(num, reverse=True)
if sorted_num == list(num):
	print(0)
else:
	for i in range(int(num) + 1, min(int(10e6), 10 ** (int(math.log(int(num), 10) + 1)))):
		if sorted(str(i), reverse=True) == sorted_num:
			print(i)
			break
