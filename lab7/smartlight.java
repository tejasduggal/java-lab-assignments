
public class smartlight extends smartdevice {
    private int brightnessLevel; // 0 - 100

    public smartlight(String name, int initialBrightness) {
        super(name);
        setBrightness(initialBrightness);
    }

    public void dim(int amount) {
        setBrightness(brightnessLevel - amount);
        System.out.println(name + " dimmed by " + amount + " -> " + brightnessLevel + "%");
    }

    public void brighten(int amount) {
        setBrightness(brightnessLevel + amount);
        System.out.println(name + " brightened by " + amount + " -> " + brightnessLevel + "%");
    }

    private void setBrightness(int value) {
        if (value < 0) value = 0;
        if (value > 100) value = 100;
        brightnessLevel = value;
    }

    public int getBrightnessLevel() {
        return brightnessLevel;
    }

    @Override
    public void displayStatus() {
        String power = isOn ? "ON" : "OFF";
        System.out.println("The " + name + " is " + power + " at " + brightnessLevel + "% brightness.");
    }
}