package services;

import channels.NotificationChannel;
import models.Notification;

// SRP: This class is responsible only for coordinating notification sending.
public class NotificationService {
    private NotificationChannel channel;

    // DIP: High-level module depends on abstraction, not concrete implementation.
    public NotificationService(NotificationChannel channel) {
        this.channel = channel;
    }

    public void sendNotification(Notification notification) {
        channel.send(notification);
    }
}
