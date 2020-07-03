import sys

string = sys.stdin.readline()[:-1]
length = int(sys.stdin.readline())

least = string[0:length]
for i in range(len(string) - length):
	if string[i:i+length] < least:
		least = string[i:i+length]

print(least)