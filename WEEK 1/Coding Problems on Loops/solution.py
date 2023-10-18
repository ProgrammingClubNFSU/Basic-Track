#Q1
n = int(input("Enter a positive integer: "))
total = 0
for i in range(1, n + 1):
    total += i
print("The sum of numbers from 1 to", n, "is", total)

#Q2
x = int(input("Enter the number for times tables: "))
n = int(input("Enter the number of terms: "))
for i in range(1, n + 1):
    print(x, "x", i, "=", x * i)

#Q3
number = int(input("Enter a number: "))
for i in range(1, 11):
    result = number * i
    print(number, "x", i, "=", result)

#Q4
n = int(input("Enter the number of rows: "))
for i in range(1, n + 1):
    for j in range(1, i + 1):
        print(j, end=" ")
    print()