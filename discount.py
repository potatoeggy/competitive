times, threshold = (map(int, input().split()))

good_prices = 0
for i in range(times):
	price, percent = (map(int, input().split()))
	if price * (100 - percent) / 100 <= threshold: good_prices += 1

print(good_prices)