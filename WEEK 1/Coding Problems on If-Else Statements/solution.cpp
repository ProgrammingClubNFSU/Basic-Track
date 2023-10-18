#include <iostream>
#include<cmath>
using namespace std;

/*Q1*/
int main() {
    double number;
    cout << "Enter a number: ";
    cin >> number;
    
    if (number > 0) {
        cout << "Positive" << endl;
    } else if (number < 0) {
        cout << "Negative" << endl;
    } else {
        cout << "Zero" << endl;
    }
    
    return 0;
}

/*Q2*/
int main() {
    int age;
    cout << "Enter your age: ";
    cin >> age;
    
    if (age >= 18) {
        cout << "You are old enough to purchase a ticket." << endl;
    } else {
        cout << "You are not old enough to purchase a ticket." << endl;
    }
    
    return 0;
}

/*Q3*/
int main() {
    double number;
    cout << "Enter a number: ";
    cin >> number;
    
    double abs_value = abs(number);
    cout << "Absolute value: " << abs_value << endl;
    
    return 0;
}

/*Q4*/
int main() {
    int year;
    cout << "Enter a year: ";
    cin >> year;
    
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        cout << year << " is a leap year." << endl;
    } else {
        cout << year << " is not a leap year." << endl;
    }
    
    return 0;
}