package SchoolManagement.SchoolMembers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    public Teacher(String name, int age, int id, String gender) {
        super(name, age, id, gender);
    }
    private Student student;
    public String teachStudent(Student student){
        this.student = student;
        return "The name of your class teacher is " + getName();
    }

    public static void readTeacherFiles(){
        File file = new File("/Users/mac/IdeaProjects/week-4-sq20-Rossypotentials1/SchoolManagementProjecUpgrade/src/main/resources/Teacher.csv");
        String line = " ";
        List<Teacher> teacherList = new ArrayList<>();

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            int counter = 0;
            while ((line = buffer.readLine()) != null){
                if(counter!=0){
                    String [] splitTeacherObj = line.split(",");
                    Teacher teacher = new Teacher(splitTeacherObj[0], Integer.parseInt(splitTeacherObj[1]), Integer.parseInt(splitTeacherObj[2]), splitTeacherObj[3]);
                    teacherList.add(teacher);
                }counter++;
            }buffer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        var t0 = teacherList.get(0);
        var t1 = teacherList.get(1);
        var t2 = teacherList.get(2);
        var t3 = teacherList.get(3);
        var t4 = teacherList.get(4);
        var t5 = teacherList.get(5);
        var t6 = teacherList.get(6);

        System.out.println(t0 + "\n" + t1 + "\n" + t3 + "\n" + t4 + "\n" + t5 + "\n" + t6 );
    }
}
