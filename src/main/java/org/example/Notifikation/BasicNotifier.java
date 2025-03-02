package org.example.Notifikation;

class BasicNotifier implements Notifiera {
    @Override
    public void send(String message) {
        System.out.println("Sending Notification: " + message);
    }
}

