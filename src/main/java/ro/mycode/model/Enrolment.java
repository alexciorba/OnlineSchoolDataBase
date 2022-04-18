package ro.mycode.model;
import lombok.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Enrolment {
    private int id;
    private int studentId;
    private int courseId;
}
