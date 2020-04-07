package com.pattern.driver;

import com.pattern.strategy.Duck;
import com.pattern.strategy.MallardDuck;
import com.pattern.strategy.behavior.FlyFast;
import com.pattern.strategy.behavior.Roar;

public class Driver {

	public static void main(String[] args) {

		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
		duck.setFlyable(new FlyFast());
		duck.setQuackable(new Roar());
		duck.performFly();
		duck.performQuack();
	}

}
