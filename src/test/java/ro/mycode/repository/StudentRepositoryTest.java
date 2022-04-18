package ro.mycode.repository;

import org.junit.Test;
import ro.mycode.model.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryTest {

    @Test
    void test(){
        Student student= new Student(1,"Ana","Popescu","ananana",23);
        StudentRepository studentRepository=new StudentRepository();
        studentRepository.addStudent(student);
    }

}