import sys

sys.stdin.readline()
xyene = list(map(int, sys.stdin.readline().split(" ")))
fataleagle = list(map(int, sys.stdin.readline().split(" ")))

xyene_score = fataleagle_score = 0
for i in range(len(xyene)):
	if xyene[i] > fataleagle[i]:
		xyene_score += 1
	elif xyene[i] < fataleagle[i]:
		fataleagle_score += 1

print(xyene_score, fataleagle_score)
if xyene_score > fataleagle_score:
	print("Xyene")
elif fataleagle_score > xyene_score:
	print("FatalEagle")
else:
	print("Tie")