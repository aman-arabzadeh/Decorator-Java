package org.example.Notifikation;

class NotifierDecorator implements Notifiera {
    protected Notifiera notifiera;

    public NotifierDecorator(Notifiera notifier) {
        this.notifiera = notifier;
    }

    @Override
    public void send(String message) {
        notifiera.send(message);
    }
}
