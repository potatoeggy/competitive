import sys
times = int(sys.stdin.readline())
numbers = list(map(int, sys.stdin.readline().split(" ")))

longest = [1]
for i in range(1, len(numbers)):
	if numbers[i] > numbers[i-1]:
		longest.append(longest[i-1] + 1)
	else:
		longest.append(1)

longest.sort()
print(longest[len(numbers)-1])