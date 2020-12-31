input()
petals = list(map(int, input().split()))
averages = len(petals)
for i in range(1,len(petals)+1):
	for j in range(0,i-1):
		#print(i,j)
		if sum(petals[j:i]) % (i-j) == 0:
			averages += 1
print(averages)