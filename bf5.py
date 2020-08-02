import re
s=input()
t=input()
e=(c.start()+1 for c in re.finditer(t,s))
print(e)
print(sum(e))
a=0
for i in e: a^=i
print(a)