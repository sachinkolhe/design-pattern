package com.pattern.driver;

import com.pattern.observer.Individual;
import com.pattern.observer.NewsPaper;
import com.pattern.observer.Office;
import com.pattern.observer.Publisher;
import com.pattern.observer.Subscriber;

public class Driver {

	public static void main(String[] args) {

		Publisher publisher = new NewsPaper();
		
		Subscriber individual = new Individual(publisher);
		Subscriber office = new Office(publisher);
		
		publisher.setNews(" Today is a very good day..");
		
		//publisher.removeSubscriber(individual);
		
		publisher.setNews(" who received?? ");
	}

}
