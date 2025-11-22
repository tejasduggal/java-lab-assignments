public class Professor extends Employee {

    String department;
    String professorId;
    String[] listOfCourses;

    public Professor(String name, String email, String dob,
                     String employeeId, String professorId,
                     String department, String[] listOfCourses) {
        super(name, email, dob, employeeId);
        this.professorId = professorId;
        this.department = department;
        this.listOfCourses = listOfCourses;
    }

    public void displayAllCourses() {
        System.out.println("Courses taught by Professor " + name + ":");
        for(String course : listOfCourses) {
            System.out.println(" - " + course);
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Professor ID: " + professorId);
        System.out.println("Department: " + department);
    }
}
