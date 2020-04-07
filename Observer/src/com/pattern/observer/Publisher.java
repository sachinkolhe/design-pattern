package com.pattern.observer;

public interface Publisher {

	
	public void removeSubscriber(Subscriber subscriber);
	public void notifySubscriber();
	void registerSubscriber(Subscriber subscriber);
	public void setNews(String string);
	
}
