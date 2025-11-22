public class SmartDevice {

    String name;
    boolean isOn;

    // Constructor
    public SmartDevice(String name) {
        this.name = name;
        this.isOn = false;   // default OFF
    }

    // Toggle the power ON/OFF
    public void togglePower() {
        isOn = !isOn;
    }

    // Display status (to be overridden by subclasses)
    public void displayStatus() {
        System.out.println(name + " is " + (isOn ? "ON" : "OFF"));
    }
}
