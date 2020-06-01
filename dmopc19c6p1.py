import sys

input = sys.stdin.readline

line = input()[:-1].split(" ")
line2 = input()[:-1].split(" ")

x1 = int(line[0])
y1 = int(line[1])
x2 = int(line[2])
y2 = int(line[3])

m1 = -10000000
b1 = x1
if x1 - x2 != 0:
	m1 = (y1 - y2) / (x1 - x2)
	b1 = y1 - m1 * x1

x3 = int(line2[0])
y3 = int(line2[1])
x4 = int(line2[2])
y4 = int(line2[3])
m2 = -10000000
b2 = x3 # might interfere, should probably add check later instead of doing this
if x3 - x4 != 0:
	m2 = (y3 - y4) / (x3 - x4)
	b2 = y3 - m2 * x3

if m1 == m2:
	if b1 == b2:
		print("coincident")
	else:
		print("parallel")
else:
	if m1 != -10000000 and m2 != -10000000:
		tempx = (b2 - b1) / (m2 - m1)
		tempy = m1 * tempx + b1
	else:
		if m1 == -10000000:
			tempx = x1
			tempy = m2 * tempx + b2
		else:
			tempx = x2
			tempy = m1 * tempx + b1
	print("{0:.6f} {1:.6f}".format(tempx, tempy))