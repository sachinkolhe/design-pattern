package com.pattern.strategy.behavior;

public class Mute implements Quackable {

	@Override
	public void quack() {

		System.out.println(" Mute .. ");

	}

}
