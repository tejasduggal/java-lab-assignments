import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter comma-separated numbers (e.g., 10,25,30,5,15): ");
        String input = sc.nextLine();

        // a) Split using comma
        String[] parts = input.split(",");

        int sum = 0;

        // Convert each part to integer using parseInt
        for (String numStr : parts) {
            int value = Integer.parseInt(numStr.trim());  // remove extra spaces if any
            sum += value;
        }

        double average = (double) sum / parts.length;

        System.out.println("Average = " + average);

        sc.close();
    }
}
