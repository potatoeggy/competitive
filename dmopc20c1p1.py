quizzes = int(input())

for _ in range(quizzes):
	string = input()
	if "M" in string and "C" in string:
		print("NEGATIVE MARKS")
	elif "M" in string or "C" in string:
		print("FAIL")
	else:
		print("PASS")
