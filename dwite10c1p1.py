import sys

for i in range(5):
	day, month, year = map(int, sys.stdin.readline()[:-1].split(" "))
	if year < 1997 or year == 1997 and month < 10 or year == 1997 and month == 10 and day <= 27:
		print("old enough")
	else:
		print("too young")