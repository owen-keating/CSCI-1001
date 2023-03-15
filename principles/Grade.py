
grade = input("What percent did you get on the test ")
grade = float(grade)

if grade >= int(90):
    print("You got an A")
elif grade >= int(80):
    print("You got a B")
elif grade >= int(70):
    print("You got a C")
elif grade >= int(60):
    print("You got a D")
else:
    print("You got an F")
