
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else {
            switch (score / 10) {
                case 10:
                    System.out.println("Excellent (A+)");
                    break;
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                case 5:
                    System.out.println("Not Pass");
                    break;
                default:
                    System.out.println("Fail");
                    break;
            }
        }

        sc.close();
    }
}
