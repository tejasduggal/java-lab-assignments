public class q4ex2{
    int x, y, width, height;

    public q4ex2(int width, int height) {
        this(0, 0, width, height);
        System.out.println("Rectangle created with width and height.");
    }

    public q4ex2(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        System.out.println("Rectangle created with all properties.");
    }

    public static void main(String[] args) {
        q4ex2 r1 = new q4ex2(10, 20);
    }
}
