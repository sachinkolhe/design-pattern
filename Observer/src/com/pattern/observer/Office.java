package com.pattern.observer;

public class Office implements Subscriber {

	private Publisher publisher;
	public Office(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.registerSubscriber(this);
	}
	
	@Override
	public void update(String news) {
		System.out.println(" Office recevied a newspaper with news :: " + news);
	}

}
