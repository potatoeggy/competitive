import sys

times = int(sys.stdin.readline())

for i in range(times):
	one = sys.stdin.readline()[:-1]
	two = sys.stdin.readline()[:-1]
	three = sys.stdin.readline()[:-1]

	if one.startswith(two) or one.endswith(two) or one.startswith(three) or one.endswith(three) \
		or two.startswith(one) or two.endswith(one) or two.startswith(three) or two.endswith(three) \
			or three.startswith(one) or three.endswith(one) or three.startswith(two) or three.endswith(one):
			print("No")
	else:
		print("Yes")
