public class Main {
    public static void main(String[] args) {

        Printer p = new Printer();

        System.out.println("---- Single String ----");
        p.print("Hello World");

        System.out.println("\n---- String Repeated ----");
        p.print("Java is fun!", 3);

        System.out.println("\n---- String Array ----");
        String[] arr = {"Tejas", "Java", "Code", "Method Overloading"};
        p.print(arr);
    }
}
