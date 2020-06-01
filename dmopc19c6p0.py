import sys

input = sys.stdin.readline

user = input()[:-1].split(" ")

a = int(user[0])
b = int(user[1])
c = int(user[2])

if a < b + c and b < a + c and c < b + a:
	print("yes")
else:
	print("no")