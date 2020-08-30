input()
string = input()
new_string = string[0]

for s in string[1:]:
	if new_string[0] >= s:
		new_string = s + new_string
	else:
		new_string = new_string + s
print(new_string)