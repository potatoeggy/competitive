input()
competitors = sum(map(int, input().split()))
print((200-competitors) if competitors <= 200 else "Over maximum capacity!")