import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        smartlight livingRoomLight = new smartlight("Living Room Light", 75);
        smartlight bedRoomLight = new smartlight("Bedroom Light", 40);

        smartthermostat hallThermostat = new smartthermostat("Hall Thermostat", 22);

        System.out.println("---- Initial statuses ----");
        livingRoomLight.displayStatus();
        bedRoomLight.displayStatus();
        hallThermostat.displayStatus();

        System.out.println("\n---- Changing states ----");
        livingRoomLight.togglePower();   
        livingRoomLight.dim(10);           
        livingRoomLight.displayStatus();

        bedRoomLight.togglePower();      
        bedRoomLight.brighten(30);         
        bedRoomLight.displayStatus();

        hallThermostat.togglePower();     
        hallThermostat.decreaseTemp(2);    
        hallThermostat.displayStatus();

        
        System.out.println("\n---- More operations ----");
        livingRoomLight.brighten(50);      // will cap at 100
        livingRoomLight.displayStatus();

        hallThermostat.increaseTemp(10);   // will cap at 35 (if over)
        hallThermostat.displayStatus();

        // Interactive demo (optional)
        System.out.println("\n---- Interactive demo (type 'exit' to stop) ----");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter command: [1] toggle living [2] toggle bedroom [3] toggle thermostat "
                    + "[4] dim living [5] brighten bedroom [6] temp up [7] temp down [exit]");
            String cmd = sc.next().trim().toLowerCase();
            if (cmd.equals("exit")) break;

            switch (cmd) {
                case "1" -> livingRoomLight.togglePower();
                case "2" -> bedRoomLight.togglePower();
                case "3" -> hallThermostat.togglePower();
                case "4" -> livingRoomLight.dim(15);
                case "5" -> bedRoomLight.brighten(15);
                case "6" -> hallThermostat.increaseTemp(1);
                case "7" -> hallThermostat.decreaseTemp(1);
                default -> System.out.println("Unknown command.");
            }

            // show statuses each loop
            livingRoomLight.displayStatus();
            bedRoomLight.displayStatus();
            hallThermostat.displayStatus();
        }
        sc.close();

        System.out.println("Demo finished. Goodbye!");
    }
}