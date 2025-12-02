package com.ex5;

public class EmailNotification implements  INotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
