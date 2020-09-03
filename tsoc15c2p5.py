class Bebilith:
	def __init__(self, speed, distance, sharpness, number):
		super().__init__()
		self.speed = speed
		self.distance = distance
		self.sharpness = sharpness
		self.number = number
	
	def __lt__(self, other):
		if self.speed == other.speed:
			if self.speed >= convict_speed:
				if self.sharpness != other.sharpness: return self.sharpness < other.sharpness
				else: return self.number > other.number
			else:
				if self.distance != other.distance: return self.distance < other.distance
				else: return self.number > other.number
		else:
			return self.speed < other.speed



convict_speed = int(input())
num_bebiliths = int(input())
bebiliths = []
for i in range(1, num_bebiliths+1):
	speed, distance, sharpness = map(int, input().split())
	bebiliths.append(Bebilith(speed, distance, sharpness, i))

bebiliths = list(reversed(sorted(bebiliths)))

times = int(input())
for i in range(times):
	print(bebiliths[int(input())-1].number)

