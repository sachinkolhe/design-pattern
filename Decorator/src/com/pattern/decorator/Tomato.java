package com.pattern.decorator;

public class Tomato extends PizzaDecorator {

	public Tomato(Pizza pizza) {
		super(pizza);
		this.cost = 10d;
		this.name = "Tomato";
	}

	public Double getCost() {
		System.out.println("Adding cost of " + this.name + " rs " + this.cost);
		return pizza.getCost() + this.cost;
	}

}
