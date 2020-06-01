import sys

input = sys.stdin.readline

input()

string = input()[:-1]
cuts = ['']

for i in string:
	if i == 'O':
		cuts[len(cuts)-1] += 'O'
	else:
		cuts.append('')

total = 0

for i in cuts:
	if i != '':
		total += 1

print(total)

for i in cuts:
	if i != '':
		print(i)
