import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Calculate Factorial of a number ‘n’");
            System.out.println("2. Generate the first ‘n’ Prime numbers");
            System.out.println("3. Generate the Fibonacci series up to ‘n’ terms");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter the value of n: ");
                int n = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Factorial of " + n + " is: " + factorialUsingFor(n));
                        break;
                    case 2:
                        System.out.println("First " + n + " prime numbers:");
                        printPrimesUsingWhile(n);
                        break;
                    case 3:
                        System.out.println("Fibonacci series up to " + n + " terms:");
                        printFibonacciUsingDoWhile(n);
                        break;
                }
            } else if (choice == 4) {
                System.out.println("Exiting program. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }

        } while (choice != 4);

        input.close();
    }

    // 1. Factorial using a FOR loop
    public static long factorialUsingFor(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 2. First n Prime Numbers using a WHILE loop
    public static void printPrimesUsingWhile(int n) {
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    // Helper for prime checking
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // 3. Fibonacci series using DO-WHILE loop
    public static void printFibonacciUsingDoWhile(int n) {
        int a = 0, b = 1;
        int count = 0;

        do {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        } while (count < n);
        System.out.println();
    }
}
