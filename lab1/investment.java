import java.util.Scanner;

public class investment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter your initial investment amount: ");
        double investment = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double interestRate = scanner.nextDouble();

       
        double yearsToDouble = 72 / interestRate;

     
        double futureValue = investment * 2;

  
        System.out.printf("\nUsing the Rule of 72:\n");
        System.out.printf("Your investment will double in approximately %.2f years.\n", yearsToDouble);
        System.out.printf("The value of your investment after doubling: ₹%.2f\n", futureValue);

        scanner.close();
    }
}