knapsack = 0
for _ in range(int(input())):
	item = tuple(map(int, input().split()))
	knapsack += item[0] if item[1] > 0 else 0
print(knapsack)