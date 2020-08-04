x = []
y = []
for _ in range(int(input())):
	pair = tuple(map(int, input().split()))
	x.append(pair[0])
	y.append(pair[1])
print(2 * (max(x) - min(x) + max(y) - min(y)))
