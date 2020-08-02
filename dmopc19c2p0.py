children, mini, maxi = (map(int, input().split()))
print(sum(map(lambda i: mini <= i <= maxi, map(int, input().split()))))