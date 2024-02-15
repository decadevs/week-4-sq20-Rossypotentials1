package SchoolManagement.SchoolMembers;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    private Course course;
    private boolean fighting;
    private boolean stubborn;

    public boolean isFighting() {
        return fighting;
    }

    public void setFighting(boolean fighting) {
        this.fighting = fighting;
    }

    public boolean isStubborn() {
        return stubborn;
    }

    public void setStubborn(boolean stubborn) {
        this.stubborn = stubborn;
    }

    public Student(String name, int age, int id, String gender) {
        super(name, age, id, gender);
    }

    public String takeCourse(Course course){
//        this.course = course;
        return getName() + ",Your Course title is " + course ;

    }


    public  static void  readStudentFile(){
        File file = new File("/Users/mac/IdeaProjects/week-4-sq20-Rossypotentials1/SchoolManagementProjecUpgrade/src/main/resources/Student.csv");
        String line = " ";
        List<Student> studentArrayList = new ArrayList<>();

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            int counter = 0;

            while ((line = buffer.readLine()) != null){
                if(counter != 0){
                    String [] studentObj = line.split(",");
                    //System.out.println(Arrays.toString(studentObj));
                    Student student = new Student(studentObj[0],Integer.parseInt( studentObj[1]), Integer.parseInt(studentObj[2]), studentObj[3]);
                    studentArrayList.add(student);
                }counter++;

            }buffer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        var s0 = studentArrayList.get(0);
        var s1 = studentArrayList.get(1);
        var s2 = studentArrayList.get(2);
        var s3 = studentArrayList.get(3);
        var s4 = studentArrayList.get(4);
        var s5 = studentArrayList.get(5);
       //var s6 = studentArrayList.get(6);
       // var s7 = studentArrayList.get(7);
        //var s8 = studentArrayList.get(8);
       // var s9 = studentArrayList.get(9);
       // var s10 = studentArrayList.get(10);
       // var s11 = studentArrayList.get(11);
        //System.out.println(s6 + "\n" + s7 + "\n" + s8 + "\n" + s9);

        System.out.println(s0 + "\n" + s1 + "\n" + s2  + "\n" + s3 + "\n" + s4 + "\n" + s5 );




    }


}
