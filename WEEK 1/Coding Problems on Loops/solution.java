import java.util.Scanner;

/*Q1*/
class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        
        System.out.println("The sum of numbers from 1 to " + n + " is " + total);
        scanner.close();
    }
}

/*Q2*/
class TimesTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for times tables: ");
        int x = scanner.nextInt();
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }
        
        scanner.close();
    }
}

/*Q3*/
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
        
        scanner.close();
    }
}

/*Q4*/
class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}






