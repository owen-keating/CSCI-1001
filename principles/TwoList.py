
newUsers = ["Max", "Owen", "Hayden", "Parker", "Sam"]
currentUsers = ["Hayden", "Owen", "Cooper", "Mason", "Will"]

for friend in newUsers:
    if friend in currentUsers:
        print("That username is taken")
    else:
        print("The username " + friend + " is available")
