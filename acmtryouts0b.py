for _ in range(int(input())):
	chars = int(input())
	a = input()
	b = input()
	for i in reversed(range(chars)): print(b[i] + a[i], end="")
	print()
