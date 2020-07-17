import sys
import queue

locations = ["A", "B", "C", "D", "E", "F"]
dests = 0
grid = [list(sys.stdin.readline())[:-1] for i in range(10)] # get grid
for i in range(len(grid)):
	for j in range(len(grid)):
		if grid[i][j] != "." and grid[i][j] != "#":
			dests += 1 # track number of destinations
			if grid[i][j] == "A":
				start = (i, j) # identify starting pos in case it's not at (1, 1)
				dests -= 1 # we start here

q = queue.Queue()
q.put((start[0], start[1], 1, 0, 0, 0)) # queue data: current x, current y, found destinations, distance since last destination, current x velocity, current y velocity

dests_found = 1
while not q.empty():
	#print("looping")
	data = q.get()
	print(data)
	if data[2] < dests_found: continue # redundant because we passed it already
	found_dest = False
	if data[4] == 0 and data[5] == 0:
		if grid[data[0]][data[1]] == locations[dests_found]:
			dests_found += 1
			if dests_found == dests: break
			print(data[3])
			found_dest = True
		for direction in [(1, 0), (0, 1), (-1, 0), (0, -1)]:
			q.put((data[0], data[1], dests_found, data[3] if not found_dest else 0, direction[0], direction[1])) # we're repeatedly bumping into walls, make sure only valid places are added to queue and make queue smaller
	else:
		if data[0] + data[4] < 0 or data[0] + data[4] >= len(grid) or data[1] + data[5] < 0 or data[1] + data[5] >= len(grid) or \
			grid[data[0] + data[4]][data[1] + data[5]] == "#" : # if out of bounds or if hit a wall
			q.put((data[0], data[1], data[2], data[3], 0, 0)) # there's probably a more effcient way to do this
		else:
			q.put((data[0] + data[4], data[1] + data[5], data[2], data[3] + 1, data[4], data[5]))