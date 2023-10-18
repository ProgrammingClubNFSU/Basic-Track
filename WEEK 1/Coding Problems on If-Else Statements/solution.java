/*Q1*/
import java.util.Scanner;

class NumberCheck{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        
        scanner.close();
    }
}

/*Q2*/
class TicketPurchase{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("You are old enough to purchase a ticket.");
        } else {
            System.out.println("You are not old enough to purchase a ticket.");
        }
        
        scanner.close();
    }
}

/*Q3*/
class AbsoluteValue{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        
        double abs_value = Math.abs(number);
        System.out.println("Absolute value: " + abs_value);
        
        scanner.close();
    }
}

/*Q4*/
class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        scanner.close();
    }
}