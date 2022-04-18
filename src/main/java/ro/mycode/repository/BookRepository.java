package ro.mycode.repository;

import ro.mycode.model.Book;

import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookRepository extends Repository{

    public void addBook(Book book){
        String insertTo="";
        insertTo+=" insert into book";
        insertTo+="(book_name,created_at,student_id) ";
        insertTo+="values(";


        insertTo+=String.format(" '%s' , '%s' , %d ",book.getBookName(),book.convertToSqlDate(),book.getStudentId()) ;
        insertTo+=")";
        exectuteStatement(insertTo);

    }


    public void deleteBook(int studentId){
        {
            String delete="";
            delete+=String.format("delete from book where student_id=%d",studentId);
            exectuteStatement(delete);

        }
    }

    public void update(Book book){
        String update=" update book";
        update+=String.format(" set book_name= '%s' , ",book.getBookName());
        update+=String.format("created_at= '%s' ",book.convertToSqlDate());
        update+=String.format("where id=%d",book.getStudentId());
        exectuteStatement(update);
    }

    Statement statement;
    private ResultSet Books(){
        exectuteStatement("select * from book ");
        try{

            return statement.getResultSet();
        }catch (Exception e){
            System.out.println("nu s a executat schita");
            return null;
        }
    }



    @Override
    public void exectuteStatement(String execute) {
        super.exectuteStatement(execute);
    }
}
