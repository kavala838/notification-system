package services;

import channels.EmailNotification;
import channels.NotificationChannel;
import channels.PushNotification;
import channels.SMSNotification;

public class ChannelFactory {
    public static NotificationChannel getChannel(String channelType) {
        switch (channelType.toLowerCase()) {
            case "email": return new EmailNotification();
            case "sms": return new SMSNotification();
            case "push": return new PushNotification();
            default: throw new IllegalArgumentException("Unknown channel type");
        }
    }
}
