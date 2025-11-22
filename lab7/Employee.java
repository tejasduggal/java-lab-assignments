public class Employee extends Person {

    String employeeId;

    public Employee(String name, String email, String dob, String employeeId) {
        super(name, email, dob);
        this.employeeId = employeeId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
    }
}
