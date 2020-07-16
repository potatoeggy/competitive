girls = int(input())
divisor = int(input())

print(min((girls % divisor) if girls >= divisor else (divisor - girls), girls + divisor - girls % divisor - girls))