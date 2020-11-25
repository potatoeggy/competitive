language_to_lines = {
	"Coffee" : 3,
	"--D": 0,
	"Boa" : 1
	}

class Program:
	def __init__(self, number, actual_code, comments, language):
		self.number = number
		self.actual_code = actual_code
		self.bottom = 10*(language_to_lines[language] * comments + actual_code)
		self.top = abs(self.bottom//10-10*max(language_to_lines[language], 1) * comments)

	def __lt__(self, other):
		first = self.top * other.bottom
		second = other.top * self.bottom
		if first != second: return first > second
		elif self.actual_code != other.actual_code: return self.actual_code < other.actual_code
		return self.number < other.number

	def __eq__(self, other):
		first = self.top * other.bottom
		second = other.top * self.bottom
		return first == second

times, requested = (map(int, input().split()))
programs = []

for i in range(1, times+1):
	data = input().split()
	actual_code = int(data[0])
	comments = int(data[1])
	language = data[2]
	if actual_code != 0 and not (actual_code > 200 and comments == 0):
		programs.append(Program(i, actual_code, comments, language))

if len(programs) < requested:
	print("Go to Seneca!")
else:
	sorted_programs = sorted(programs, reverse=True)
	for i in range(requested):
		print(sorted_programs[i].number)
