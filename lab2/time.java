import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of seconds: ");
        int totalSeconds = sc.nextInt();

         
        int hours = totalSeconds / 3600;           
        int remainingSeconds = totalSeconds % 3600;

        int minutes = remainingSeconds / 60;       
        int seconds = remainingSeconds % 60;

     
        System.out.println(totalSeconds + " seconds = " 
            + hours + " hour(s), " 
            + minutes + " minute(s), and " 
            + seconds + " second(s).");

        sc.close();
    }
}