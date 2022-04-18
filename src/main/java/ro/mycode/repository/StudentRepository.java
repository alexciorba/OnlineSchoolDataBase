package ro.mycode.repository;

import ro.mycode.model.Book;
import ro.mycode.model.Student;

public class StudentRepository extends  Repository{
    public void addStudent(Student student){
        String insertTo="";
        insertTo+=" insert into student";
        insertTo+="(first_name,last_name,email,age) ";
        insertTo+="values(";


        insertTo+=String.format(" '%s' , '%s' ,'%s', %d ",student.getFirstName(),student.getLastName(),student.getEmail(),student.getAge());
        insertTo+=")";
        exectuteStatement(insertTo);

    }
    public void deleteStudent(int age){
        {
            String delete="";
            delete+=String.format(" delete from student where age=%d",age);
            exectuteStatement(delete);

        }
    }
    public void update(Student student){
        String update=" update student";
        update+=String.format(" set first_name= '%s' , ",student.getFirstName());
        update+=String.format("last_name= '%s' ",student.getLastName());
        update+=String.format("where age=%d",student.getAge());
        exectuteStatement(update);
    }

    @Override
    public void exectuteStatement(String execute) {
        super.exectuteStatement(execute);
    }
}
