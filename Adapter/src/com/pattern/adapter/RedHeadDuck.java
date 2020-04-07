package com.pattern.adapter;

public class RedHeadDuck extends Duck {

	public RedHeadDuck(String name) {
	this.name = name;
	}
	
	@Override
	public void quack() {
		System.out.println(this.name + " is quacking .. ");
	}
}
