import string
f = open("Schedule.txt", "w")
f.close()
print("Hello! This is my Schedule Manager v1. \nWhat would you like to do?")
tempInput = input("Check, Update, or Clear: ")
nInput = tempInput.lower()
if nInput == "check":
    f = open("Schedule.txt", "r")
    f.read()
    f.close()
elif nInput == "update":
    print("Input your schedule for the week")
    f = open("Schedule.txt", "a")
    week = input()
    f.write(week)
    f.close()
elif nInput == "clear":
    print("Schedule has been cleared.")
    f = open("Schedule.txt", "w")
    f.write(" ")
    f.close()