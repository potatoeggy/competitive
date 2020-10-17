trolleys, days = (map(int, input().split()))

line = list(map(int, input().split()))
for i in range(1, len(line)):
	line[i] += line[i-1]

for _ in range(days):
	split = int(input())
	if line[split-1] >= line[-1] - line[split-1]:
		print(line[split-1])
		for i in range(split, len(line)):
			line[i] -= line[split-1]
		del(line[:split])
	else:
		print(line[-1] - line[split-1])
		del(line[split:])
