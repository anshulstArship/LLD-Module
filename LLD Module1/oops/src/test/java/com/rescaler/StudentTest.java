package com.rescaler;

import com.rescaler.subscaler.TA;

import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student st = new Student(1,"Anshul","abc","April2023",90,"+91");
        System.out.println(st.getName()+" "+st.getStudentStatus());

        st.setStatus(StudentStatus.COMPLETED);
        System.out.println(st.getStudentStatus());

        Student student2 = new Student(2,"A","def","May2023",100,"+91");
        System.out.println(student2.getStudentStatus());
        System.out.println(student2.getRollNumber());

        // static call
        Student.toString(st);

        // non-static call
        st.toString();

        // create mentor object

        Mentor mentor1 = new Mentor(3,"Tanmay","ab",null);
        System.out.println(mentor1.name+" "+mentor1.email);
        mentor1.printDetails();
        student2.printDetails();

        Mentor mentor2 = new Mentor(Integer.valueOf(10));
        st.printDetails();

        TA ta = new TA(12,"Batman","abs","+92",5);
        System.out.println(ta.getContact());

        User student3 = new Student(13,"Anshul","anshul@gmail.com","April2023",100,"+91");

        EmailSender.sendEmail(List.of(student2,mentor2,mentor1));
        NotificationSender sender = new EmailSender();
        sender.sendNotification(List.of(mentor2));
    }
}
