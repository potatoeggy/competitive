import sys

input = sys.stdin.readline

mom = input()[:-1]
dad = input()[:-1]

traits = []

for i in range(0, len(mom), 2):
	if mom[i].upper() in mom or mom[i].upper() in dad:
		traits.append(mom[i].upper())
	else:
		traits.append(mom[i])
	if (mom[i].lower() in mom and mom[i].lower() in dad):
		traits.append(mom[i].lower())

times = int(input())

for i in range(times):
	baby = input()[:-1]
	failed = False
	for trait in baby:
		if not trait in traits:
			failed = True
	
	if failed:
		print("Not their baby!")
	else:
		print("Possible baby.")