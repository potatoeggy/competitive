for _ in range(int(input())):
	num = int(input())
	i = num
	while True: # oof nested loops
		if (i ** 3 - 888) % 1000 == 0:
			print(i)
			break
		i += 1
