import sys

for _ in range(5):
	line = sys.stdin.readline()
	stringing = False
	commenting = False
	mini_stringing = False
	skip = False
	stripped_line = ""
	for i in range(len(line) - 1):
		if skip:
			skip = False
			continue
		if not stringing and not commenting and not mini_stringing:
			if line[i:i+2] == "//":
				stripped_line += line[i+2:]
				break
			elif line[i:i+2] == "/*":
				commenting = True
				skip = True
			elif line[i] == "\"":
				stringing = True
			elif line[i] == "'":
				mini_stringing = True
		else:
			if mini_stringing:
				if line[i] == "'":
					mini_stringing = False
					stripped_line += " "
					continue
			elif stringing:
				if line[i] == "\"":
					stringing = False
					stripped_line += " "
					continue
			elif commenting:
				if line[i:i+2] == "*/":
					skip = True
					commenting = False
					stripped_line += " "
					continue
			stripped_line += line[i]
	print(stripped_line.rstrip())