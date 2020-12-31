number = input().split()
if len(number[0]) + len(number[1]) != 10 or len(number[0]) != 3 or not (number[0] == "416" or number[0] == "437" or number[0] == "647"):
	print("invalid")
elif number[0] == "416":
	print("valuable")
else:
	print("valueless")
