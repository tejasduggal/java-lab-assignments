public class Main {
    public static void main(String[] args) {

        // ----- Smart Light -----
        SmartLight light = new SmartLight("Living Room", 50);

        light.displayStatus();
        light.togglePower();
        light.brighten();
        light.displayStatus();
        light.dim();
        light.displayStatus();


        System.out.println("------------------------");

        // ----- Smart Thermostat -----
        SmartThermostat thermo = new SmartThermostat("Bedroom", 22);

        thermo.displayStatus();
        thermo.togglePower();
        thermo.increaseTemp();
        thermo.increaseTemp();
        thermo.displayStatus();
        thermo.decreaseTemp();
        thermo.displayStatus();
    }
}
