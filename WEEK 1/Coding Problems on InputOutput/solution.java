/*Here comes the big boy "JAVAAAA!!!!" */

/*Q1*/
import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        scanner.close();
    }
}

/*Q2*/

class Greeting{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}

/*Q3*/
class Address{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your city: ");
        String city = scanner.nextLine();
        System.out.print("Enter your state: ");
        String state = scanner.nextLine();
        System.out.println("Address: " + city + ", " + state);
        scanner.close();
    }
}

/*Q4*/
class AsteriskPattern{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        int width = scanner.nextInt();
        System.out.print("Enter the height: ");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}





