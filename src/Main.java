import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World! I am");
        String StudentName = "Navid Mirzad";
        int StudentAge = 21;
        double StudentGrade = 7.3;
        char StudentFirstInitial = 'N';
        char StudentLastInitial = 'M';
        boolean HasPerfectAttendance = true;

        System.out.println(StudentName);
        System.out.println(StudentAge);
        System.out.println(StudentGrade);
        System.out.println(StudentFirstInitial);
        System.out.println(StudentLastInitial);
        System.out.println("Navid has perfect attendance? True or False?");
        System.out.println(HasPerfectAttendance);
    }
}