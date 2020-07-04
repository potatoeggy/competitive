import sys

numbers = [int(i) for i in sys.stdin.readline().split(" ")]
print(numbers[0] * 5 + numbers[1] * 10 + numbers[2] * 25 + numbers[3] * 100 + numbers[4] * 200)