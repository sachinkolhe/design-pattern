package com.pattern.strategy;

import com.pattern.strategy.behavior.Flyable;
import com.pattern.strategy.behavior.Mute;
import com.pattern.strategy.behavior.NoFly;
import com.pattern.strategy.behavior.Quackable;

public abstract class Duck {

	protected Flyable flyable;
	protected Quackable quackable;
	
	
	
	public Duck() {
		flyable = new NoFly();
		quackable = new Mute();
	}

	public void performFly() {
		flyable.fly();
	}
	
	public void performQuack() {
		quackable.quack();
	}

	public Flyable getFlyable() {
		return flyable;
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	public Quackable getQuackable() {
		return quackable;
	}

	public void setQuackable(Quackable quackable) {
		this.quackable = quackable;
	}
	
	
	
}
