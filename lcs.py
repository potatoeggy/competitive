import sys

memo = [[None for i in range(1001)] for i in range(1001)]
for i in range(1001):
	memo[i][0] = memo[0][i] = 0

def lcs(first, second): # python's recursion limit is 1000 meaning that recursion isn't going to solve this problem
	if memo[len(first)][len(second)] != None:
		return memo[len(first)][len(second)]
	elif first[-1] == second[-1]:
		memo[len(first)][len(second)] = lcs(first[:-1], second[:-1]) + 1
	else:
		memo[len(first)][len(second)] = max(lcs(first[:-1], second), lcs(first, second[:-1]))
	return memo[len(first)][len(second)]

sys.stdin.readline()

one = list(map(int, sys.stdin.readline().split(" ")))
two = list(map(int, sys.stdin.readline().split(" ")))

print(lcs(one, two))