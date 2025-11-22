public class Printer {

    // a) Print a single string
    public void print(String message) {
        System.out.println(message);
    }

    // b) Print a string 'n' number of times
    public void print(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    // c) Print each element of a String array
    public void print(String[] messages) {
        for (String msg : messages) {
            System.out.println(msg);
        }
    }
}
