#include <iostream>
#include <string>
using namespace std;

//You can use cin also but using getline its better:))))

/*Q1*/
int main() {
    string user_input;
    cout << "Enter something: ";
    getline(cin, user_input);  
    cout << "You entered: " << user_input << endl;
    return 0;
}

/*Q2*/
int main() {
    string name;
    cout << "Enter your name: ";
    getline(cin, name);
    cout << "Hello, " << name << "!" << endl;
    return 0;
}

/*Q3*/
int main() {
    string city, state;
    cout << "Enter your city: ";
    getline(cin, city);
    cout << "Enter your state: ";
    getline(cin, state);
    cout << "Address: " << city << ", " << state << endl;
    return 0;
}

/*Q4*/
int main() {
    int width, height;
    cout << "Enter the width: ";
    cin >> width;
    cout << "Enter the height: ";
    cin >> height;
    for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
            cout << "*";
        }
        cout << endl;
    }
    return 0;
}