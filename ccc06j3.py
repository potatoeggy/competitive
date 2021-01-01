reference = {
	2: "abc",
	3: "def",
	4: "ghi",
	5: "jkl",
	6: "mno",
	7: "pqrs",
	8: "tuv",
	9: "wxyz"
}

string = input()
while string != "halt":
	seconds = 0
	for j in range(len(string)):
		for i in range(2, 10):
			if string[j] in reference[i]:
				seconds += 1 + reference[i].index(string[j])
				if j+1 < len(string) and string[j+1] in reference[i]:
					seconds += 2
				break

	print(seconds)
	string = input()