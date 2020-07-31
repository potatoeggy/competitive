current_number = int(input())
late_students = 0
students_in_line = 0
queue = Queue()

command = input()
while command != "EOF":
	if command == "TAKE":
		current_number += 1
		late_students += 1
		students_in_line += 1
		if current_number > 999: current_number = 1
	elif command == "SERVE":
		students_in_line -= 1
	elif command == "CLOSE":
		print(late_students, students_in_line, current_number)
		late_students = 0
		students_in_line = 0
	command = input()
