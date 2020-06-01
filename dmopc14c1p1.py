import sys
import math

input = sys.stdin.readline
times = int(input())

def stupid_python(x):
    a = abs(x)
    r = math.floor(a) + math.floor(2 * (a % 1))
    return r if x >= 0 else -r

array = []

for i in range(times):
	array.append(int(input()))

array.sort()
if len(array) % 2 == 0:
	length = int(len(array) / 2)
	print(stupid_python((array[length] + array[length-1]) / 2))
else:
	print(array[int(len(array) / 2)])