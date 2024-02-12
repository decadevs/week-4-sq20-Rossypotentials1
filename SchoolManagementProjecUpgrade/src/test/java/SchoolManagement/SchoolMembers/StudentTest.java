package SchoolManagement.SchoolMembers;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void takeCourse() {
        Student student = new Student("Precious", 34,90,"Female");
        Course course = new Course("English", 211,90);
        String actual = student.takeCourse(course);
        String expected = "Precious ,Your Course title is English";
        //assertEquals(expected,actual);
    }
}