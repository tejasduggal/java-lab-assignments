public class Main2 {
    public static void main(String[] args) {

        System.out.println("----- STUDENT -----");
        Student s = new Student("Tejas Duggal", "tejas@bmu.edu.in", "12-03-2005",
                                "Computer Science", "STU1021");
        s.displayInfo();

        System.out.println("\n----- PROFESSOR -----");
        String[] profCourses = {"Java Programming", "Data Structures", "AI Basics"};
        Professor p = new Professor("Dr. Mehta", "mehta@bmu.edu.in", "05-10-1975",
                                    "EMP2001", "PROF500",
                                    "Computer Science", profCourses);
        p.displayInfo();
        p.displayAllCourses();

        System.out.println("\n----- ADMINISTRATOR -----");
        Administrator a = new Administrator("Mrs. Sharma", "sharma@bmu.edu.in",
                                            "15-04-1980", "EMP3001",
                                            "Dean of Students", 45, 120);
        a.displayInfo();
    }
}
