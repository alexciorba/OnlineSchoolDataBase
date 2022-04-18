package ro.mycode.repository;

import ro.mycode.model.Enrolment;

public class EnrolmentRepository extends Repository {

    public void addEnrolment(Enrolment enrolment){
        String insertTo="";
        insertTo+=" insert into enrolment ";
        insertTo+="(student_id,course_id)";
        insertTo+="values (";
        insertTo+=String.format(" '%d' , %d ",enrolment.getStudentId(),enrolment.getCourseId());
        insertTo+=")";
        exectuteStatement(insertTo);


    }

    public void deleteEnrolment(int id){
        {
            String delete="";
            delete+=String.format(" delete from enrolment where age=%d",id);
            exectuteStatement(delete);

        }
    }





}
