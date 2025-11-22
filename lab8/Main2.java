public class Main2 {

    public static void main(String[] args) {

        // Try to create 2 objects
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // Check if both references point to the same object
        if (obj1 == obj2) {
            System.out.println("Both objects are SAME instance.");
        } else {
            System.out.println("Objects are DIFFERENT instances.");
        }

        // Print references (optional but useful)
        System.out.println("Reference of obj1: " + obj1);
        System.out.println("Reference of obj2: " + obj2);
    }
}
