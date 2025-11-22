public class Administrator extends Employee {

    String title;
    int countOfFaculty;
    int countOfCourses;

    public Administrator(String name, String email, String dob,
                         String employeeId, String title,
                         int countOfFaculty, int countOfCourses) {

        super(name, email, dob, employeeId);
        this.title = title;
        this.countOfFaculty = countOfFaculty;
        this.countOfCourses = countOfCourses;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Title: " + title);
        System.out.println("Faculty Managed: " + countOfFaculty);
        System.out.println("Courses Administered: " + countOfCourses);
    }
}
