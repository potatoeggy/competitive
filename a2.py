reference = {
	"q": "p",
	"p": "q",
	"b": "d",
	"d": "b",
}

print("Ready")
string = input()
while string != "  ":
	try:
		if reference[string[0]] == string[1]:
			print("Mirrored pair")
		else:
			print("Ordinary pair")
	except KeyError:
		print("Ordinary pair")
	string = input()
