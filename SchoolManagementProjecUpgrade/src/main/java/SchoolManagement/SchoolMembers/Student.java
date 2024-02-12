package SchoolManagement.SchoolMembers;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    private Course course;

    public Student(String name, int age, int id, String gender) {
        super(name, age, id, gender);
    }

    public String takeCourse(Course course){
        this.course = course;
        return this.getName() + ",Your Course title is " + this.course ;

    }


    public static void  readStudentFile(){
        File file = new File("/Users/mac/IdeaProjects/week-4-sq20-Rossypotentials1/SchoolManagementProjecUpgrade/src/main/resources/Student.csv");
        String line = " ";
        List<Student> students = new ArrayList<>();

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            int counter = 0;

            while ((line = buffer.readLine()) != null){
                if(counter != 0){
                    String [] studentObj = line.split(",");
                    //System.out.println(Arrays.toString(studentObj));
                    Student student = new Student(studentObj[0],Integer.parseInt( studentObj[1]), Integer.parseInt(studentObj[2]), studentObj[3]);
                    students.add(student);
                }counter++;

            }buffer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        var s0 = students.get(0);
        var s1 = students.get(1);
        var s2 = students.get(2);
        var s3 = students.get(3);
        var s4 = students.get(4);
        var s5 = students.get(5);
       // var s6 = students.get(6);
       // var s7 = students.get(7);
        //var s8 = students.get(8);
       // var s9 = students.get(9);
       // var s10 = students.get(10);
       // var s11 = students.get(11);
        //System.out.println(s6 + "\n" + s7 + "\n" + s8 + "\n" + s9);

        System.out.println(s0 + "\n" + s1 + "\n" + s2  + "\n" + s3 + "\n" + s4 + "\n" + s5 );




    }


}
