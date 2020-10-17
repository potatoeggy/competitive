months, babies_per_crab, grow_month, adult_crabs = (map(int, input().split()))

baby_timer = [0 for i in range(grow_month+1)]

for _ in range(months):
	adult_crabs += baby_timer[-1]
	for i in reversed(range(len(baby_timer)-1)): # alternatively instead of moving use markers?
		baby_timer[i+1] = baby_timer[i]
	baby_timer[0] = adult_crabs * babies_per_crab

print((adult_crabs * 2 + sum(baby_timer[1:])) % (10**9 + 7))
