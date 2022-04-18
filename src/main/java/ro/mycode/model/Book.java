package ro.mycode.model;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {

    private int id;
    private int studentId;
    private String bookName;
    LocalDate createdAt;


    public String convertToSqlDate(){

        return String.format("%d-%d-%d",createdAt.getYear(),createdAt.getMonthValue(),createdAt.getDayOfMonth());
    }



}
