#Q1
number = float(input("Enter a number: "))
if number > 0:
    print("Positive")
elif number < 0:
    print("Negative")
else:
    print("Zero")


#Q2
age = int(input("Enter your age: "))
if age >= 18:
    print("You are old enough to purchase a ticket.")
else:
    print("You are not old enough to purchase a ticket.")


#Q3
number = float(input("Enter a number: "))
abs_value = abs(number)
print("Absolute value:", abs_value)


#Q4
year = int(input("Enter a year: "))
if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
    print(year, "is a leap year.")
else:
    print(year, "is not a leap year.")
