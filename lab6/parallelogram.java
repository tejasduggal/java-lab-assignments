import java.util.Scanner;

public class parallelogram {
    private double base;
    private double side; // adjacent side
    private double height;

    public void readDimensions(Scanner sc) {
        System.out.print("Enter base: ");
        base = readPositiveDouble(sc);
        System.out.print("Enter side (adjacent side length): ");
        side = readPositiveDouble(sc);
        System.out.print("Enter height (perpendicular to base): ");
        height = readPositiveDouble(sc);
    }

    public double area() {
        return base * height;
    }

    public double perimeter() {
        return 2 * (base + side);
    }

    public void printResults() {
        System.out.printf("Parallelogram area = %.4f%n", area());
        System.out.printf("Parallelogram perimeter = %.4f%n", perimeter());
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
        parallelogram p = new parallelogram();
        p.readDimensions(sc);
        p.printResults();
        sc.close();
    }
}
