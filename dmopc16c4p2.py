import sys # wrong algorithm

batches = int(sys.stdin.readline())
grader = []
for _ in range(batches):
	grader.append(tuple(map(int, sys.stdin.readline().split(" "))))

failed_times = int(sys.stdin.readline())
failures = []
for _ in range(failed_times):
	failures.append(int(sys.stdin.readline()))

total_points = 0
for i in grader:
	failed = False
	for j in failures:
		if j >= i[0] and j <= i[1]:
			failed = True
			break
	
	if not failed:
		total_points += i[2]

print(total_points)
