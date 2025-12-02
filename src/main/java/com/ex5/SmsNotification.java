package com.ex5;

public class SmsNotification implements INotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
