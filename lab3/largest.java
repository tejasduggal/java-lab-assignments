import java.util.Scanner;

public class largest{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter  second number: ");
        int b=sc.nextInt();
        System.out.print("Enter third number: ");
        int c=sc.nextInt();
        System.out.print("Enter fourth number: ");
        int d=sc.nextInt();

         int largest, secondLargest, thirdLargest, smallest;

        
        if (a >= b && a >= c && a >= d) {
            largest = a;
            if (b >= c && b >= d) {
                secondLargest = b;
                if (c >= d) {
                    thirdLargest = c;
                    smallest = d;
                } else {
                    thirdLargest = d;
                    smallest = c;
                }
            } else if (c >= b && c >= d) {
                secondLargest = c;
                if (b >= d) {
                    thirdLargest = b;
                    smallest = d;
                } else {
                    thirdLargest = d;
                    smallest = b;
                }
            } else {
                secondLargest = d;
                if (b >= c) {
                    thirdLargest = b;
                    smallest = c;
                } else {
                    thirdLargest = c;
                    smallest = b;
                }
            }
        } else if (b >= a && b >= c && b >= d) {
            largest = b;
            if (a >= c && a >= d) {
                secondLargest = a;
                if (c >= d) {
                    thirdLargest = c;
                    smallest = d;
                } else {
                    thirdLargest = d;
                    smallest = c;
                }
            } else if (c >= a && c >= d) {
                secondLargest = c;
                if (a >= d) {
                    thirdLargest = a;
                    smallest = d;
                } else {
                    thirdLargest = d;
                    smallest = a;
                }
            } else {
                secondLargest = d;
                if (a >= c) {
                    thirdLargest = a;
                    smallest = c;
                } else {
                    thirdLargest = c;
                    smallest = a;
                }
            }
        } else if (c >= a && c >= b && c >= d) {
            largest = c;
            if (a >= b && a >= d) {
                secondLargest = a;
                if (b >= d) {
                    thirdLargest = b;
                    smallest = d;
                } else {
                    thirdLargest = d;
                    smallest = b;
                }
            } else if (b >= a && b >= d) {
                secondLargest = b;
                if (a >= d) {
                    thirdLargest = a;
                    smallest = d;
                } else {
                    thirdLargest = d;
                    smallest = a;
                }
            } else {
                secondLargest = d;
                if (a >= b) {
                    thirdLargest = a;
                    smallest = b;
                } else {
                    thirdLargest = b;
                    smallest = a;
                }
            }
        } else {
            largest = d;
            if (a >= b && a >= c) {
                secondLargest = a;
                if (b >= c) {
                    thirdLargest = b;
                    smallest = c;
                } else {
                    thirdLargest = c;
                    smallest = b;
                }
            } else if (b >= a && b >= c) {
                secondLargest = b;
                if (a >= c) {
                    thirdLargest = a;
                    smallest = c;
                } else {
                    thirdLargest = c;
                    smallest = a;
                }
            } else {
                secondLargest = c;
                if (a >= b) {
                    thirdLargest = a;
                    smallest = b;
                } else {
                    thirdLargest = b;
                    smallest = a;
                }
            }
        }

 System.out.println("Largest: " + largest);
        System.out.println("2nd Largest: " + secondLargest);
        System.out.println("3rd Largest: " + thirdLargest);
        System.out.println("Smallest: " + smallest);

        sc.close();

    }
}