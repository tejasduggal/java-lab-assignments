public class Car {
    private String color;
    private int horsePower;

    public Car setColor(String color) {
        this.color = color;
        return this; 
    }

    public Car setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public void displayInfo() {
        System.out.println("Car Info: Color=" + color + ", Horsepower=" + horsePower);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setColor("Blue").setHorsePower(200).displayInfo();
    }
}




