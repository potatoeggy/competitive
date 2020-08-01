time = int(input()) * 60
enemies = int(input())

power_levels = [0, 30, 60, 300]
print("Return" if sum(map(lambda i: power_levels[i], (int(input()) for i in range(enemies)))) > time else "Continue")
