/*Q1*/
#include <iostream>
using namespace std;

int main(){
    int n, total = 0;
    cout << "Enter a positive integer: ";
    cin >> n;
    
    for (int i = 1; i <= n; i++) {
        total += i;
    }
    
    cout << "The sum of numbers from 1 to " << n << " is " << total << endl;
    
    return 0;
}

/*Q2*/

int main() {
    int x, n;
    cout << "Enter the number for times tables: ";
    cin >> x;
    cout << "Enter the number of terms: ";
    cin >> n;
    
    for (int i = 1; i <= n; i++) {
        cout << x << " x " << i << " = " << x * i << endl;
    }
    
    return 0;
}

/*Q3*/
int main() {
    int number;
    cout << "Enter a number: ";
    cin >> number;
    
    for (int i = 1; i <= 10; i++) {
        int result = number * i;
        cout << number << " x " << i << " = " << result << endl;
    }
    
    return 0;
}

/*Q4*/
int main() {
    int n;
    cout << "Enter the number of rows: ";
    cin >> n;
    
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            cout << j << " ";
        }
        cout << endl;
    }
    
    return 0;
}