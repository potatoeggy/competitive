import sys

shift = int(sys.stdin.readline())
string = sys.stdin.readline()[:-1]

processed_string = ""

for i in range(len(string)):
	raw_number = ord(string[i]) - 3*(i+1) - shift
	if raw_number < 65:
		raw_number += 26
	processed_string += chr(raw_number)

print(processed_string)
