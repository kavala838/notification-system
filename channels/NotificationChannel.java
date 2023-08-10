package channels;

import models.Notification;

// ISP: Only necessary methods are defined in this interface, making it small and focused.
public interface NotificationChannel {
    void send(Notification notification);
}
