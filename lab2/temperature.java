import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        
        System.out.printf("Temperature in Fahrenheit: %.1f°F%n", fahrenheit);

        sc.close();
    }
}
