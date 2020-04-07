package com.pattern.strategy;

import com.pattern.strategy.behavior.Flyable;
import com.pattern.strategy.behavior.Quackable;

public class MallardDuck extends Duck {

	public MallardDuck() {
		// TODO Auto-generated constructor stub
	}
	public MallardDuck(Flyable flyable, Quackable quack) {
		this.flyable = flyable;
		this.quackable = quack;
	}
	
	
}
