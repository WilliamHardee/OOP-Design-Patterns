package org.example.ObserverPattern;

import java.util.*;



public class NotificationService {

    private List<Subscriber> subscribers_;

    public NotificationService() {
        subscribers_ = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers_.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers_.remove(subscriber);
    }

    public void sendAlert() {
        subscribers_.forEach(subscriber -> subscriber.update());
    }

}
