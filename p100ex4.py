db = {
	"M": "midget ",
	"J": "junior ",
	"S": "senior ",
	"G": "girls",
	"B": "boys"
	}

try:
	for i in input(): print(db[i])
except:
	print("invalid code")
