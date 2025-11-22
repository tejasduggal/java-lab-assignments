public class Singleton {

    // static instance of Singleton class (only one object will ever exist)
    private static Singleton instance = null;

    // private constructor so no other class can create an object
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    // static method to return the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();   // create the object first time
        }
        return instance;                  // return same object every time
    }
}
