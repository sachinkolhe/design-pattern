package com.pattern.decorator;

public class BasePizza extends Pizza {

	public BasePizza(String name) {
		this.name = name;
		this.cost = 50d;
	}
	
	public Double getCost() {
		System.out.println("Adding cost of " + this.name + " rs " + this.cost);
		return this.cost;
	}
}
