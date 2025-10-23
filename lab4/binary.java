
import java.util.Scanner;

public class binary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Convert Decimal to Binary");
            System.out.println("2. Convert Binary to Decimal");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            if (choice == 3) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter Decimal number: ");
                    int decimal = sc.nextInt();
                    int binary = 0, place = 1, num = decimal;
                    if (num == 0) binary = 0;
                    while (num > 0) {
                        int rem = num % 2;
                        binary += rem * place;
                        place *= 10;
                        num /= 2;
                    }
                    System.out.println("Binary: " + binary);
                    break;

                case 2:
                    System.out.print("Enter Binary number: ");
                    int bin = sc.nextInt();
                    int dec = 0, pow = 1;
                    while (bin > 0) {
                        int digit = bin % 10;
                        dec += digit * pow;
                        pow *= 2;
                        bin /= 10;
                    }
                    System.out.println("Decimal: " + dec);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}

