package ro.mycode.model;
import lombok.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
