h, m = (map(int, input().split()))
time_past = int(input())

m += time_past % 60
h += time_past // 60

if m > 59:
	m -= 60
	h += 1

h %= 24

print(h, m)
