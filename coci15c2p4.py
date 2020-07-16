import sys
times = int(sys.stdin.readline())

subsequence = sys.stdin.readline()[:-1]
counter = 1
for _ in range(times-1):
	string = sys.stdin.readline()[:-1] # what if the longest chain isn't the first that shows up
	# if x(j) is the string after x(i) i'm doing this wrong
	if string.startswith(subsequence) and string.endswith(subsequence):
		counter += 1
		subsequence = string
print(counter)