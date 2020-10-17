for _ in range(int(input())):
	grade = int(input())
	if 0 <= grade <= 49: print("F")
	elif 50 <= grade <= 59: print("D")
	elif 60 <= grade <= 69: print("C")
	elif 70 <= grade <= 79: print("B")
	elif 80 <= grade <= 100: print("A")
	else: print("X")
