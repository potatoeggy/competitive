from math import sqrt

primes = [False for i in range(int(10e5) + 1)]
primes[1] = True

for i in range(2, len(primes)):
	if not primes[i]:
		for j in range(i + i, len(primes), i):
			primes[j] = True

input()
numbers = list(map(int, input().split()))
print(sum(map(lambda i: not primes[i], numbers)))