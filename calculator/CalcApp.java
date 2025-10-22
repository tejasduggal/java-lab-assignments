import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------ Calculator ------");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= 4) {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            int result = 0;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Addition: " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Subtraction: " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Multiplication: " + result);
                    break;
                case 4:
                    try {
                        result = divide(num1, num2);
                        System.out.println("Division: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        } else {
            System.out.println("Invalid input.");
        }

        sc.close();
    }

    // calculator methods
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
