import java.util.Scanner;

public class rectangle {
    private double width;
    private double length;

    public void readDimensions(Scanner sc) {
        System.out.print("Enter width: ");
        width = readPositiveDouble(sc);
        System.out.print("Enter length: ");
        length = readPositiveDouble(sc);
    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return 2 * (width + length);
    }

    public void printResults() {
        System.out.printf("Rectangle area = %.4f%n", area());
        System.out.printf("Rectangle perimeter = %.4f%n", perimeter());
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
        rectangle r = new rectangle();
        r.readDimensions(sc);
        r.printResults();
        sc.close();
    }
}
