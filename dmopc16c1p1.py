input()
string = list(map(int, input().split()))
print(sum(string[i] % 2 == i % 2 for i in range(len(string))))
