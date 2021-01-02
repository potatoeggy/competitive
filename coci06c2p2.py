numbers = sorted(list(map(int, input().split())))
order = input()
order_but_sorted = sorted(order)
for c in order:
	print(numbers[order_but_sorted.index(c)], end=" ")
