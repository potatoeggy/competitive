import sys

n = int(sys.stdin.readline())

magic_number = 0
for _ in range(n):
	magic_number = magic_number ^ int(sys.stdin.readline())

print(magic_number)