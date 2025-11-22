public class Student extends Person {

    String course;
    String studentId;

    public Student(String name, String email, String dob, String course, String studentId) {
        super(name, email, dob);
        this.course = course;
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}
