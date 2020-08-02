input()
numbers = sorted(list(map(int, input().split())))

lowest = int(10e9)
for i in range(1, len(numbers)):
	lowest = min(lowest, abs(numbers[i] - numbers[i-1]))
print(lowest)
