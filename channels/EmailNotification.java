package channels;

import models.Notification;

public class EmailNotification implements NotificationChannel {
    @Override
    public void send(Notification notification) {
        System.out.println("Sending email to " + notification.getRecipient() +
                " with message: " + notification.getMessage());
    }
}

