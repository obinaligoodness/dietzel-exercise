package StudentManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;
    StudentData studentData;
    School school;

    @BeforeEach
    void setUp() {
        student = new Student();
        studentData = new StudentData();
        school = new School();
    }
    @Test
 void testThatStudentCanApply(){
        student.setFirstName("inem");
        student.setLastName("obi");
        student.setEmail("i_udosoro@gmail.com");
        Student registeredStudent = student.apply(studentData);
        System.out.println(registeredStudent);
        assertNotNull(registeredStudent);
    }
    @Test
    void testTheNumberOfRegisteredStudents(){
        Student registeredStudent = student.apply(studentData);
        assertNotNull(registeredStudent);
        int studentSize = school.getTotalNumberOfRegisteredStudents();
        assertEquals(1,studentSize);
    }
}