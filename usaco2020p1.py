nums=list(map(int, input().split()))
nums.sort()
a=nums[0]
b=nums[1]
c=max(nums)-(a+b)
print(a,b,c)