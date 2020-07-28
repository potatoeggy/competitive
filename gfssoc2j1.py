rating = int(input())
competitors = int(input())

for _ in range(competitors):
	if abs(rating - int(input())) <= 100:
		print("fite me! >:3")
	else:
		print("go away! 3:<")
