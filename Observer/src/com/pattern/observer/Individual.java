package com.pattern.observer;

public class Individual implements Subscriber {

	private Publisher publisher;
	
	public Individual(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.registerSubscriber(this);

	}
	
	@Override
	public void update(String news) {
		System.out.println(" Individual recevied a newspaper with news :: " + news);
		//this.publisher.removeSubscriber(this);
	}

}
