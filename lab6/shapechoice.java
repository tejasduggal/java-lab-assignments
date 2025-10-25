import java.util.Scanner;

public class shapechoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Shape Calculator ---");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Parallelogram");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            switch (choice) {
                case 1:
                    rectangle rect = new rectangle();
                    rect.readDimensions(scanner);
                    rect.printResults();
                    break;
                case 2:
                    circle circle = new circle();
                    circle.readDimensions(scanner);
                    circle.printResults();
                    break;
                case 3:
                    triangle tri = new triangle();
                    tri.readDimensions(scanner);
                    tri.printResults();
                    break;
                case 4:
                    parallelogram para = new parallelogram();
                    para.readDimensions(scanner);
                    para.printResults();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choose option 1-5.");
            }
        }
    }
}