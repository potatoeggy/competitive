import sys

height = int(sys.stdin.readline())
spacing = int(sys.stdin.readline())
handle = int(sys.stdin.readline())

for i in range(height):
	print(("*" + " "*spacing)*2 + "*")

print("*"*(spacing*2+3))

for i in range(handle):
	print(" "*(spacing + 1) + "*")