package com.pattern.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class NewsPaper implements Publisher {

	private List<Subscriber> subscribers;
	private String news;

	public NewsPaper() {
		subscribers = new ArrayList<>();
	}
	@Override
	public void registerSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);

	}

	@Override
	public void removeSubscriber(Subscriber subscriber) {

		int i = subscribers.indexOf(subscriber);
		if (i >= 0) {
			subscribers.remove(i);
		}
	}

	@Override
	public void notifySubscriber() {

		Iterator<Subscriber> iterator = subscribers.iterator();

		while (iterator.hasNext()) {
			Subscriber subscriber2 = iterator.next();

			subscriber2.update(news);
		}

	}
	
	@Override
	public void setNews(String news) {
		this.news = news;
		notifySubscriber();
	}

}
