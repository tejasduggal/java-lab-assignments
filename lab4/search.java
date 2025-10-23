
import java.util.Scanner;

public class search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Welcome! Let's create a list of 10 numbers.");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("\nEnter the number you want to search for: ");
        int search = sc.nextInt();

        int position = -1;
        int max = numbers[0], min = numbers[0];

        for (int i = 0; i < 10; i++) {
            if (numbers[i] == search && position == -1) {
                position = i;
            }
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
        }

        System.out.println("\n--- Results ---");
        if (position != -1) {
            System.out.println("The number " + search + " was found at position: " + (position + 1));
        } else {
            System.out.println("The number " + search + " was not found in the list.");
        }
        System.out.println("Maximum number in the list: " + max);
        System.out.println("Minimum number in the list: " + min);

        sc.close();
    }
}
