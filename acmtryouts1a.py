best_play = {
	"Scissors": "Rock",
	"Rock": "Paper",
	"Paper": "Scissors",
	"Fox": "Foxen"
}

for _ in range(int(input())):
	try: print(best_play[input()])
	except KeyError: break
