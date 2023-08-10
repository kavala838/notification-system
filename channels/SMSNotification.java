package channels;

import models.Notification;


public class SMSNotification implements NotificationChannel {
    @Override
    public void send(Notification notification) {
        System.out.println("Sending SMS to " + notification.getRecipient() +
                " with message: " + notification.getMessage());
    }
}
