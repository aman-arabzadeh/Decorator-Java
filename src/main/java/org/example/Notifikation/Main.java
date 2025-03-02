package org.example.Notifikation;

public class Main {
    public static void main(String[] args) {
        Notifiera notifier = new BasicNotifier();

        // Adding Facebook and WhatsApp decorators
        Notifiera fbNotifier = new FacebookDecorator(notifier);
        Notifiera whatsappNotifier = new WhatsAppDecorator(fbNotifier);

        // Sending notification to multiple channels  W and F
        whatsappNotifier.send("Hello, this is a test message!");
    }
}