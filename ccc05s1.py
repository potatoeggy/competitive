import sys

dictionary = ["ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"]
cases = int(sys.stdin.readline())
for i in range(cases):
	processed = ""
	unprocessed = sys.stdin.readline()[:-1]
	unprocessed = unprocessed.replace("-", "")
	for j in range(10):
		if unprocessed[j].isdigit():
			processed += unprocessed[j]
		else:
			for k in range(len(dictionary)):
				if unprocessed[j] in dictionary[k]:
					processed += str(k + 2)
		if j == 2 or j == 5:
			processed += "-"
	
	print(processed)