from collections import deque

num_chairs, empty_chairs = map(int, input().split())
chairs = [None for i in range(num_chairs)]

for i in map(int, input().split()):
	chairs[i-1] = 0

full_chairs = list(map(int, input().split()))
for i in range(len(full_chairs)):
	chairs[full_chairs[i]-1] = i+1 if chairs[full_chairs[i]-1] is None else None # one-indexed input can go die in a fire

stack = deque()
while True:
	for i in range(len(chairs)):
		if chairs[i] == 0:
			if len(stack) > 0:
				chairs[i] = None
				stack.pop()
		if chairs[i] is not None and chairs[i] != 0:
			stack.append(chairs[i])
			chairs[i] = None
	if len(stack) == 1:
		break
print(stack.pop())
