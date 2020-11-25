import os.path
import random


subtask = 3# modify this, changes constraints
times = 1 # modify this, changes number of outs
filepath = "/home/eggy/bsspc20s1/" # modify this, remember trailing slash
start = 1 # do not modify

while os.path.isfile(filepath + str(start) + ".in"):
	start += 1

for i in range(times):
	with open(filepath + str(start+i) + ".in", "w") as file:
		total = 0
		if subtask == 1:
			total = 3
			requested = random.randint(1, 3)
			file.write("3 " + str(requested) + "\n")
		elif subtask == 2:
			total = random.randint(1, 100)
			requested = random.randint(1, total)
			file.write(str(total) + " " + str(requested) + "\n")
		elif subtask == 3:
			total = 100000
			requested = random.randint(1, total)
			file.write(str(total) + " " + str(requested) + "\n")

		languages = ["Coffee", "--D", "Boa"]
		language_to_lines = {"Coffee": 3, "--D": 0, "Boa": 1}
		distinct = subtask == 1 or subtask == 2
		collection = set()
		ratios = set()

		if subtask == 1:
			languages = ["--D"]
		
		lower_bound = 1 if subtask == 1 or subtask == 2 else 0
		upper_bound = 1000
		for i in range(total):
			if not distinct:
				file.write(str(random.randint(lower_bound, upper_bound)) + " " + str(random.randint(lower_bound, upper_bound)) + " " + random.choice(languages) + "\n")
			else:
				first = random.randint(lower_bound, upper_bound)
				second = random.randint(lower_bound, upper_bound)
				language = random.choice(languages)
				while first in collection or second in collection:
					first = random.randint(lower_bound, upper_bound)
					second = random.randint(lower_bound, upper_bound)
				collection.add(first)
				collection.add(second)
				first = str(first)
				second = str(second)

				file.write(first + " " + second + " " + random.choice(languages) + "\n")
