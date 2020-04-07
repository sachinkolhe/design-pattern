package com.pattern.strategy.behavior;

public class Roar implements Quackable {

	@Override
	public void quack() {
		System.out.println(" roaring ... ");
	}

}
