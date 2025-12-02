package com.ex5;

public class NotificationChannelFactory {

    public static INotificationChannel createChannel(String channelName) {
        switch (channelName.toUpperCase()) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SmsNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel: " + channelName);
        }
    }
}
