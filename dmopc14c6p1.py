stations = list(input() for i in range(int(input())))
try:
	bessarion = stations.index("Bessarion")
	if bessarion <= 0 or bessarion >= len(stations):
		print("N")
	elif stations[bessarion+1] == "Bayview" and stations[bessarion-1] == "Leslie" or stations[bessarion+1] == "Leslie" and stations[bessarion-1] == "Bayview":
		print("Y")
	else:
		print("N")
except IndexError:
	print("N")
