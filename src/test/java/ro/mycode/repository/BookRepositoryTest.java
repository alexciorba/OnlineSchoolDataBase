package ro.mycode.repository;

import org.junit.jupiter.api.Test;
import ro.mycode.model.Book;
import ro.mycode.model.Enrolment;
import ro.mycode.model.Student;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryTest {

    @Test

    void test1(){
        Book book=new Book(1,2,"Baltagul", LocalDate.of(1999,12,24));
        Book bookUpdate=new Book(2,2,"Ion", LocalDate.of(1999,12,16));
        BookRepository bookRepository=new BookRepository();
        bookRepository.addBook(book);
        bookRepository.update(bookUpdate);




    }

    @Test
    void test(){
        Student student= new Student(1,"Ana","Popescu","ananana",23);
        StudentRepository studentRepository=new StudentRepository();
        studentRepository.addStudent(student);
    }


    @Test

    void test2(){
        StudentRepository studentRepository=new StudentRepository();
        studentRepository.deleteStudent(13);
    }

    @Test

    void test3(){
        Student student= new Student(3,"AnaMaria","LALALA","ananana",25);
        StudentRepository studentRepository=new StudentRepository();
        studentRepository.update(student);
    }

    @Test

    void test4(){
        Enrolment enrolment=new Enrolment(28,1,4);
        EnrolmentRepository enrolmentRepository=new EnrolmentRepository();
        enrolmentRepository.addEnrolment(enrolment);
    }

}