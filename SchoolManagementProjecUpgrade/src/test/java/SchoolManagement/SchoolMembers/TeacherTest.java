package SchoolManagement.SchoolMembers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    @Test
    void teachStudent() {
        Teacher teacher = new Teacher("Emmanuel", 23, 45,"MAle");
        Student student = new Student("Isioma",26,90,"Female");
        String actual = teacher.teachStudent(student);
        String expected = "The name of your class teacher is " + "Emmanuel";
        assertEquals(actual,expected);
        assertNotNull(teacher.getName());
    }
}