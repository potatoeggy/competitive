string = input()
try:
	print(string.index("java"))
except ValueError:
	print(len(string))