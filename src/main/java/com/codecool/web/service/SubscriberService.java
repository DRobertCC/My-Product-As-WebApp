package com.codecool.web.service;

import com.codecool.web.model.Subscriber;

import java.util.ArrayList;
import java.util.List;

public final class SubscriberService { // Singletonnal!!!

    //private List<Subscriber> subscribers = new ArrayList<>();
    public static List<Subscriber> subscribers = new ArrayList<>();

    public SubscriberService() {
        subscribers.add(new Subscriber("Feri", "feri@freemail.com"));
        subscribers.add(new Subscriber("Béla", "bela@freemail.hu"));
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void addSubscriber(Subscriber theSubscriber) {
        subscribers.add(theSubscriber);
    }
}
