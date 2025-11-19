public class smartthermostat extends smartdevice {
    private int temperature; // in degrees Celsius

    public smartthermostat(String name, int initialTemp) {
        super(name);
        setTemperature(initialTemp);
    }

    public void increaseTemp(int delta) {
        setTemperature(temperature + delta);
        System.out.println(name + " temperature increased by " + delta + " -> " + temperature + "°C");
    }

    public void decreaseTemp(int delta) {
        setTemperature(temperature - delta);
        System.out.println(name + " temperature decreased by " + delta + " -> " + temperature + "°C");
    }

    private void setTemperature(int temp) {
        // sensible bounds (optional): 5 to 35 °C
        if (temp < 5) temp = 5;
        if (temp > 35) temp = 35;
        temperature = temp;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void displayStatus() {
        String power = isOn ? "ON" : "OFF";
        System.out.println("The " + name + " is " + power + ". Current temperature is set at " + temperature + "°C.");
    }
}