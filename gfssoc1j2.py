x = y = 0
for _ in range(int(input())):
	command = input()
	if command == "North":
		y += int(input())
	elif command == "South":
		y -= int(input())
	elif command == "East":
		x += int(input())
	else:
		x -= int(input())

print(x, y)