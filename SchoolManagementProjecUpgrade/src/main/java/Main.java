
import SchoolManagement.SchoolMembers.Applicants;
import SchoolManagement.SchoolMembers.Principal;
import SchoolManagement.SchoolMembers.Student;
import SchoolManagement.SchoolMembers.Teacher;

public class Main {
    public static void main(String[] args) {


        //Instantiation and invoking of the Student readFile Method
        System.out.println("Student's Data");
        Student.readStudentFile();

        System.out.println("==========================");
        System.out.println( "=========================");
        System.out.println("Teacher's Data");
        System.out.println("==========================");
        System.out.println("==========================");


        //Instantiation and invoking of the Teacher readFile Method

        System.out.println("====================");
        Teacher.readTeacherFiles();

        //Instantiation and invoking of Principal and Applicants
        Principal principal = new Principal("Peter Pual", 67,7,"Male");
        Applicants applicants = new Applicants("Raymond musa", 15,76,"Male");
        principal.admitApplicants(applicants);
        String authority = principal.admitApplicants(applicants);
        System.out.println(authority);




    }
}
