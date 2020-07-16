import sys
from bisect import bisect_right


times = int(sys.stdin.readline())
total = 0
fake_tree = []
for i in range(times):
	score = int(sys.stdin.readline())
	insertion_index = bisect_right(fake_tree, score) # python insertion speed is O(n)
	total += len(fake_tree) - insertion_index + 1
	fake_tree.insert(insertion_index, score)

print(round(total / times, 2))