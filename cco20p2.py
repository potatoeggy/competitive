import sys

numbers = [0 for i in range(200001)]
sys.stdin.readline()
schedule = list(map(int, sys.stdin.readline().split()))

impossible = False
swaps = 0
for i in range(len(schedule)):
	numbers[schedule[i]] += 1
	if numbers[schedule[i]] > schedule[i]:
		impossible = True
		break
	elif schedule[i] > i: # will cause the same number to be swapped with the same number and really doesn't work
		swaps += 1
		temp = schedule[schedule[i] - 0 if len(schedule) > schedule[i] else 1]
		schedule[i] = schedule[schedule[i] - 0 if len(schedule) > schedule[i] else 1] # this isn't going to work
		schedule[schedule[i] - 0 if len(schedule) > schedule[i] else 1] = temp

print(-1 if impossible else swaps)