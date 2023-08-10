import channels.NotificationChannel;
import models.Notification;
import services.ChannelFactory;
import services.NotificationService;
import utils.Logger;

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification("Welcome to our service!", "user@example.com");

        // Use Factory to get a NotificationChannel instance
        NotificationChannel emailChannel = ChannelFactory.getChannel("email");

        // Inject channel into NotificationService
        NotificationService notificationService = new NotificationService(emailChannel);

        // Send the notification
        Logger.log("Sending notification via email.");
        notificationService.sendNotification(notification);

        // Switch channel
        NotificationChannel smsChannel = ChannelFactory.getChannel("sms");
        NotificationService smsService = new NotificationService(smsChannel);

        Logger.log("Sending notification via SMS.");
        smsService.sendNotification(notification);
    }
}
