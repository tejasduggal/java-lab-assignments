public class smartdevice {
    private String name;
    private boolean isOn;

    public smartdevice(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void togglePower() {
        isOn = !isOn;
        System.out.println(name + " turned " + (isOn ? "ON" : "OFF"));
    }

   
    public void displayStatus() {
        System.out.println("Device: " + name + " | Power: " + (isOn ? "ON" : "OFF"));
    }

    
    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }
}


