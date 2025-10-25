import java.util.Scanner;

public class triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public void readDimensions(Scanner sc) {
        System.out.println("Triangle: you must enter three sides (for perimeter). For area we will use Heron's formula.");
        sideA = readPositiveDouble(sc, "Enter side A: ");
        sideB = readPositiveDouble(sc, "Enter side B: ");
        sideC = readPositiveDouble(sc, "Enter side C: ");
        if (!validTriangle(sideA, sideB, sideC)) {
            System.out.println("Entered sides do not form a valid triangle. Please re-enter.");
            readDimensions(sc);
        }
    }

    public double area() {
        double s = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(Math.max(0.0, s * (s - sideA) * (s - sideB) * (s - sideC)));
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public void printResults() {
        System.out.printf("Triangle area = %.4f%n", area());
        System.out.printf("Triangle perimeter = %.4f%n", perimeter());
    }

    private boolean validTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private double readPositiveDouble(Scanner sc, String prompt) {
        System.out.print(prompt);
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
       triangle t = new triangle();
        t.readDimensions(sc);
        t.printResults();
        sc.close();
    }
}
