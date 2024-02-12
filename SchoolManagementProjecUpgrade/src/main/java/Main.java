
import SchoolManagement.SchoolMembers.Student;
import SchoolManagement.SchoolMembers.Teacher;

public class Main {
    public static void main(String[] args) {


        //Instantiation and invoking of the Student readFile Method

        Student.readStudentFile();

        System.out.println("==========================");
        System.out.println( "=========================");
        System.out.println("==========================");


        //Instantiation and invoking of the Teacher readFile Method
        Teacher.readTeacherFiles();


    }
}
