import sys

cases = int(sys.stdin.readline())

for i in range(cases):
	total = int(sys.stdin.readline())
	not_cube = total / 3
	not_cube_int = total // 3

	modX = modY = 0
	if not_cube > not_cube_int + 0.5:
		modX = 1
	if not_cube != not_cube_int:
		modY = 1
	
	print((not_cube_int + modX) * (not_cube_int + modY) * not_cube_int)