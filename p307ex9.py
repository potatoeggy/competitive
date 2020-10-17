for _ in range(int(input())):
	i = int(input())
	print(1 if i % 4 == 0 and i % 100 != 0 or i % 400 == 0 else 0)
