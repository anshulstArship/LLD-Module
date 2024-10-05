package com.rescaler;

import java.util.List;

public class SmsSender implements NotificationSender {

    public static void sendSms(List<User> users){
        for(User user:users){
            System.out.println("Sending email to "+user.pno);
        }
        // signature can be changes while creating but we need a common way for all notifications
    }

    @Override
    public void sendNotification(List<User> users) {
        for(User user:users){
            System.out.println("Sending email to "+user.pno);
        }
    }
}
