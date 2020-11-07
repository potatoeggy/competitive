import sys
import os

# subtask 1
times, requested = (map(int, input().split()))
numbers = []
ratios = []

for i in range(1, times+1):
	data = input().split()
	actual_code = int(data[0])
	comments = int(data[1])
	ratio_ten = abs(0.1-comments/actual_code)
	if actual_code != 0 and not (actual_code > 1000 and comments == 0):
		numbers.append(i)
		ratios.append(ratio_ten)

if len(numbers) < requested:
	print("Go to Seneca!")
else:
	for i in range(len(numbers)):
		for j in range(1, len(numbers)-i):
			if ratios[j-1] > ratios[j]:
				ratios[j-1], ratios[j] = ratios[j], ratios[j-1]
				numbers[j-1], numbers[j] = numbers[j], numbers[j-1]

	for i in range(requested):
		print(numbers[i])

# subtask 2
"""
language_to_lines = {
	"Coffee" : 3,
	"--D": 0,
	"Boa" : 1
	}

times, requested = (map(int, input().split()))
programs = []

for i in range(1, times+1):
	data = input().split()
	actual_code = int(data[0])
	comments = int(data[1])
	language = data[2]
	ratio_ten = abs(0.1-(max(language_to_lines[language], 1) * comments) / (
		language_to_lines[language] * comments + actual_code
	))
	if actual_code != 0 and not (actual_code > 1000 and comments == 0):
		programs.append((ratio_ten, actual_code, i))

if len(programs) < requested:
	print("Go to Seneca!")
else:
	sorted_programs = sorted(programs)
	for i in range(requested):
		print(sorted_programs[i][2])
"""

# subtask 3
"""
language_to_lines = {
	"Coffee" : 3,
	"--D": 0,
	"Boa" : 1
	}

class Program:
	def __init__(self, number, actual_code, comments, language):
		self.number = number
		self.actual_code = actual_code
		self.comments = comments
		self.ratio_ten = abs(0.1-(max(language_to_lines[language], 1) * comments) / (
			language_to_lines[language] * comments + actual_code
		))

	def __lt__(self, other):
		if self.ratio_ten != other.ratio_ten: return self.ratio_ten > other.ratio_ten
		elif self.actual_code != other.actual_code: return self.actual_code < other.actual_code
		else: return self.number < other.number

	def __eq__(self, other):
		return self.ratio_ten - other.ratio_ten == 0 and self.actual_code - other.actual_code == 0 and self.number == other.number

times, requested = (map(int, input().split()))
programs = []

for i in range(1, times+1):
	data = input().split()
	actual_code = int(data[0])
	comments = int(data[1])
	language = data[2]
	if actual_code != 0 and not (actual_code > 1000 and comments == 0):
		programs.append(Program(i, actual_code, comments, language))

if len(programs) < requested:
	print("Go to Seneca!")
else:
	sorted_programs = sorted(programs, reverse=True)
	for i in range(requested):
		print(sorted_programs[i].number)
"""
