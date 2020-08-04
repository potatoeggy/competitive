import sys
import copy

sieve = [0 for i in range(100001)]
precomputed = [{i: 0 for i in range(0, 633)}] # this solution is wrong
for i in range(1, len(sieve)):
	sieve[i] += 1
	precomputed.append(copy.deepcopy(precomputed[i-1]))
	precomputed[i][sieve[i]] = precomputed[i-1][sieve[i]] + 1
	for j in range(i + i, len(sieve), i):
		sieve[j] += 1

for i in range(10):
	for j in range(10):
		print(i, j, precomputed[i][j], end=", ")
	print()

for i in range(int(sys.stdin.readline())):
	query = tuple(map(int, sys.stdin.readline().split()))
	print(precomputed[query[2]][query[0]]-precomputed[query[1]][query[0]])

