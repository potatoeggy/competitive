equation = input().split()
print(eval(" ".join(equation[:-2])) == int(equation[-1]))
