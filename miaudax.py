import sys

array = sys.stdin.readline()[:-1].split("x")

array = sorted(array)
ttl = int(array[0])

print(array[0], end='')
for i in array[1:]:
	print('x' + i, end='')
	ttl *= int(i)
print('\n' + str(ttl))