package org.example.Notifikation;

class WhatsAppDecorator extends NotifierDecorator {
    public WhatsAppDecorator(Notifiera notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending WhatsApp Notification: " + message);
    }
}