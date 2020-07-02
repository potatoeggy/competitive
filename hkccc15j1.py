import sys

times = int(sys.stdin.readline())
alice = sys.stdin.readline()[:-1].split(" ")
bob = sys.stdin.readline()[:-1].split(" ")

alice_score = 0
bob_score = 0

for i in range(len(alice)):
	if alice[i] == bob[i]:
		continue
	if alice[i] == "rock":
		if alice[i] < bob[i]:
			alice_score += 1
		else:
			bob_score += 1
	elif alice[i] == "paper":
		if bob[i] == "scissors":
			bob_score += 1
		else:
			alice_score += 1
	else:
		if bob[i] == "rock":
			bob_score += 1
		else:
			alice_score += 1

sys.stdout.write(str(alice_score) + " " + str(bob_score) + "\n") 
