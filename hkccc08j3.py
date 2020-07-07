import sys

times = int(sys.stdin.readline())
database = []
times_called = [0 for i in range(times)]
for i in range(times):
	temp = sys.stdin.readline().split(" ")
	database.append((temp[0], int(temp[1])))

calls = int(sys.stdin.readline())
for _ in range(calls):
	number = int(sys.stdin.readline())
	for i in range(len(database)):
		if number == database[i][1]:
			times_called[i] += 1
			break

favourite = 0
for i in range(len(database)):
	if times_called[favourite] < times_called[i]:
		favourite = i
	elif times_called[favourite] == times_called[i]:
		if database[favourite][1] > database[i][1]:
			favourite = i

print(database[favourite][0])