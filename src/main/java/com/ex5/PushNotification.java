package com.ex5;

public class PushNotification implements  INotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH: " + message);
    }
}
