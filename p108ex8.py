for i in range(int(input())):
	deg = int(input())
	if deg <= 45 or deg >= 315: print("N")
	elif deg <= 135: print("E")
	elif deg <= 225: print("S")
	else: print("W")
