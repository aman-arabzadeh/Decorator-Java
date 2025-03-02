package org.example.Notifikation;

class FacebookDecorator extends NotifierDecorator {
    public FacebookDecorator(Notifiera notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending Facebook Notification: " + message);
    }
}