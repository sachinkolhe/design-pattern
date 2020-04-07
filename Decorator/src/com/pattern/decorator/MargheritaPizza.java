package com.pattern.decorator;

public class MargheritaPizza extends Pizza {

	
	public MargheritaPizza(String name) {
		this.name = name;
		this.cost = 20d;
	}
	
	public Double getCost() {
		System.out.println("Adding cost of " + this.name + " rs " + this.cost);
		return this.cost;
	}
}
