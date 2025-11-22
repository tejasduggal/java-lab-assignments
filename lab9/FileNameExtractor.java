import java.util.Scanner;

public class FileNameExtractor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full filename (example: LabAssignment9.pdf): ");
        String fullName = sc.nextLine();

        // a) find last dot position
        int lastDot = fullName.lastIndexOf('.');

        // extract filename (b) substring(begin, end))
        String filename = fullName.substring(0, lastDot);

        // extract extension (c) substring(begin))
        String extension = fullName.substring(lastDot + 1);

        System.out.println("Filename: " + filename);
        System.out.println("Extension: " + extension);

        sc.close();
    }
}
