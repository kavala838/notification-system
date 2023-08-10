package channels;

import models.Notification;

public class PushNotification implements NotificationChannel {
    @Override
    public void send(Notification notification) {
        System.out.println("Sending push notification to " + notification.getRecipient() +
                " with message: " + notification.getMessage());
    }
}
