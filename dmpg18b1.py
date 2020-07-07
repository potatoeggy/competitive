import sys
import math

requests = list(map(int, sys.stdin.readline().split(" ")))
pizzas = 0
for i in requests:
	pizzas += math.ceil(i / 3)
print(pizzas)