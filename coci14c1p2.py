mini = [101, 101]
maxi = [0, 0]

for _ in range(int(input())):
	num = list(map(int, input().split()))
	for i in range(2):
		mini[i] = min(mini[i], num[i])
		maxi[i] = max(maxi[i], num[i])

print(max((maxi[i]-mini[i] for i in range(2))) ** 2)