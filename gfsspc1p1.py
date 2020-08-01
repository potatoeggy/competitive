triangles = sorted(list(int(input()) for i in range(3)))
print("Huh? A triangle?" if triangles[0] + triangles[1] > triangles[2] else "Maybe I should go out to sea...")