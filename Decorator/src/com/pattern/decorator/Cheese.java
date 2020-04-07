package com.pattern.decorator;

public class Cheese extends PizzaDecorator {

	public Cheese(Pizza pizza) {
		super(pizza);

		this.cost = 5.5d;
		this.name = "Cheese";
	}
	
	public Double getCost() {
		System.out.println("Adding cost of " + this.name + " rs " + this.cost);
		return pizza.getCost() + this.cost;
	}

}
