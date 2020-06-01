import sys

presents = int(sys.stdin.readline())

list = []

for i in range(presents):
	list.append(int(sys.stdin.readline()))

list.sort()

editorial = list[0]
total = 1

for i in list[1:]:
	if i >= editorial:
		total += 1
		editorial += i

print(total)