limit = int(input())
print(limit + sum(limit - int(input()) for i in range(int(input()))))
