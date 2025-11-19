public class q4ex1 {
    String name;
    int age;

    public q4ex1(String name, int age) {
        // "this" is used to refer to instance variables
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        q4ex1 p = new q4ex1("Tejas", 20);
        p.display();
    }
}

