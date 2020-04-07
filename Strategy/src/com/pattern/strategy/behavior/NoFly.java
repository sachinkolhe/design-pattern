package com.pattern.strategy.behavior;

public class NoFly implements Flyable {

	@Override
	public void fly() {
		System.out.println(" not flying ... ");

	}

}
