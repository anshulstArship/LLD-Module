package com.rescaler;

import java.util.List;

public class EmailSender implements NotificationSender{

//    public static void sendEmail(List<Student> st, List<Mentor> mentor){
//        // not reusable
//        for(Student student:st){
//            System.out.println("Sending email sto students :"+student.email);
//        }
//        for(Mentor men:mentor){
//            System.out.println("Sending email sot mentors "+men.email);
//        }
//    }

    public static void sendEmail(List<User> users){
        for(User user:users){
            System.out.println("Sending email to "+user.email);
        }

    }

    @Override
    public void sendNotification(List<User> users) {
        for(User user:users){
            System.out.println("Sending email to "+user.email);
        }
    }
}
