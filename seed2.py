import sys

mini = 1
maxi = 2 * 10 ** 9

print((mini + maxi) // 2)
sys.stdout.flush()
verify = sys.stdin.readline()[:-1]
while verify != "OK" and mini <= maxi:
	if verify == "FLOATS":
		maxi = (mini + maxi) // 2 - 1
	else:
		mini = (mini + maxi) // 2 + 1
	print((mini + maxi) // 2)
	sys.stdout.flush()
	verify = sys.stdin.readline()[:-1]