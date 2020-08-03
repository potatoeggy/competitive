input()
string = input()
if string.replace("A", "").replace("C", "").replace("G", "").replace("T", "").replace("U", "") != "" or "U" in string and "T" in string:
	print("neither")
elif "T" in string:
	print("DNA")
elif "U" in string:
	print("RNA")
else:
	print("both")
