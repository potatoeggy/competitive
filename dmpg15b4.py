import sys

times = int(sys.stdin.readline())

list = []
smol = []
zero = False

for i in range(times):
	temp = int(sys.stdin.readline())
	if temp > 0:
		list.append(temp)
	elif temp == 0:
		zero = True
	else:
		smol.append(temp)

list.sort(reverse=True)
smol.sort()
total = 1

if len(list) != 0:
	for i in list:
		total *= i

if len(smol) == 1 and len(list) == 0:
	total = smol[0]
elif len(smol) % 2 == 0:
	for i in smol:
		total *= i
else:
	for i in smol[:-1]:
		total *= i

if (total < 0 or len(list) == 0 and len(smol) == 0) and zero:
	total = 0

print(total)