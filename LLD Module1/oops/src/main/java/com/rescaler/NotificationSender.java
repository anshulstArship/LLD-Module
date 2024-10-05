package com.rescaler;

import java.util.List;

public interface NotificationSender { //Blueprint for behaviours

    public void sendNotification(List<User> users);
}
