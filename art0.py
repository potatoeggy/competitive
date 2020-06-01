import sys

times = int(sys.stdin.readline())

for i in range(times):
	string = sys.stdin.readline()
	for s in string:
		if s.isdigit():
			print('Yes!', end=' ')
		elif s == 'A' or s == 'a':
			print('Hi!', end=' ')
		elif s == 'E' or s == 'e':
			print('Bye!', end=' ')
		elif s == 'I' or s == 'i':
			print('How are you?', end=' ')
		elif s == 'O' or s == 'o':
			print('Follow me!', end=' ')
		elif s == 'U' or s == 'u':
			print('Help!', end=' ')
	print()
