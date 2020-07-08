import sys

for _ in range(5):
	number = int(sys.stdin.readline())
	factors = 0
	not_orig = False
	if number == 2:
		print(0)
		continue
	while number % 2 == 0:
		not_orig = True
		number //= 2
		factors += 1
	for i in range(3, number+(1 if not_orig else 0), 2):
		while number % i == 0:
			number //= i
			factors += 1
	print(factors)
	