import java.util.Scanner;

public class circle{
    private double radius;

    public void readDimensions(Scanner sc) {
        System.out.print("Enter radius: ");
        radius = readPositiveDouble(sc);
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void printResults() {
        System.out.printf("Circle area = %.4f%n", area());
        System.out.printf("Circle perimeter (circumference) = %.4f%n", perimeter());
    }

    private double readPositiveDouble(Scanner sc) {
        while (true) {
            try {
                double v = Double.parseDouble(sc.nextLine().trim());
                if (v <= 0) {
                    System.out.print("Enter a positive number: ");
                    continue;
                }
                return v;
            } catch (Exception ex) {
                System.out.print("Invalid. Enter a number: ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle c = new circle();
        c.readDimensions(sc);
        c.printResults();
        sc.close();
    }
}