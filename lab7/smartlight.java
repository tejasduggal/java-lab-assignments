public class SmartLight extends SmartDevice {

    int brightnessLevel;   // 0 to 100

    public SmartLight(String name, int brightnessLevel) {
        super(name);
        this.brightnessLevel = brightnessLevel;
    }

    public void dim() {
        if (brightnessLevel > 0) brightnessLevel -= 10;
    }

    public void brighten() {
        if (brightnessLevel < 100) brightnessLevel += 10;
    }

    @Override
    public void displayStatus() {
        System.out.println(name + " Light is " + (isOn ? "ON" : "OFF") +
                " at brightness " + brightnessLevel + "%");
    }
}
