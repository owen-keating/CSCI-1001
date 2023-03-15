
teachers = ["Galt", "Kinsbury", "Discher", "Krause", "Galt", "Richter"]
classes = ["Calculus", "History", "English", "Biology", "Computer Science", "Band"]
nums = [int(2), int(3), int(4), int(5), int(6), int(7)]

for num in nums:
    print(str(num) + " " + str(classes[num - int(2)]) + " " + str(teachers[num - int(2)]))
