public class SmartThermostat extends SmartDevice {

    int temperature;

    public SmartThermostat(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    public void increaseTemp() {
        temperature++;
    }

    public void decreaseTemp() {
        temperature--;
    }

    @Override
    public void displayStatus() {
        System.out.println(name + " Thermostat is " + (isOn ? "ON" : "OFF") +
                " and set to " + temperature + "°C");
    }
}
